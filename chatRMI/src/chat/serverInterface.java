package chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface serverInterface extends Remote{
    void registrarCliente(callbackClient cliente, String usuario) throws RemoteException;
    void eliminarCliente(callbackClient cliente) throws RemoteException;
    void mensajeGrupo(String mensaje) throws RemoteException;
    void mensajeDirecto(String remitente, String receptor, String mensaje) throws RemoteException;
}
