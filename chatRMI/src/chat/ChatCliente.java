package chat;

import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JTextArea;

public class ChatCliente {
    serverInterface servidor;
    
    public void startClient(String usuario, JTextArea jTextArea, String ip){
        try {
            String serverUrl = "rmi://"+ip+":9000/serverInterface";

            servidor = (serverInterface) Naming.lookup(serverUrl);

            callbackImpl clientCallback = new callbackImpl(usuario, jTextArea);
            servidor.registrarCliente(clientCallback, usuario);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enviaraTodos(String mensaje, String usuario) throws RemoteException{
        servidor.mensajeGrupo(usuario + ": " + mensaje);

    }
    
    public void mensajePrivado(String usuario, String usuarioprivado, String mensaje) throws RemoteException{
        servidor.mensajeDirecto(usuario, usuarioprivado, mensaje);
    }
    
}