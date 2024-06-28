/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hertz676
 */
public class server extends UnicastRemoteObject implements serverInterface{
    private Map<String, callbackClient> clientes;

    public server() throws RemoteException {
        clientes = new HashMap<>();
    }

    @Override
    public void registrarCliente(callbackClient cliente, String usuario) throws RemoteException {
        clientes.put(usuario, cliente);
        mensajeGrupo("\n" + usuario + " se ha unido al chat.");
    }

    private String getUsuarioCliente(callbackClient cliente) throws RemoteException {
    return cliente.getNombreUsuario();
}

    @Override
    public void eliminarCliente(callbackClient cliente) throws RemoteException {
        String username = getUsuarioCliente(cliente);
        clientes.remove(username);
    }

    @Override
    public void mensajeGrupo(String message) throws RemoteException {
        for (callbackClient client : clientes.values()) {
            client.recibirMensaje(message);
        }
    }

    @Override
    public void mensajeDirecto(String remitente, String receptor, String mensaje) throws RemoteException {
        callbackClient cliente = clientes.get(receptor);

        if (cliente != null) {
            cliente.recibirMensaje("[Mensaje privado de " + remitente + "]: " + mensaje);
        }
    }
    
    public void connection(String Ip){
        try {
                serverInterface servidor = new server();

                LocateRegistry.createRegistry(9000);

                java.rmi.Naming.rebind("//"
                    + java.net.InetAddress.getLocalHost().getHostAddress()
                    + ":" + 9000 + "/serverInterface", servidor);
		System.out.println("Servidor corriendo...");
 
               System.out.println("Servidor de chat RMI listo.");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    

    public static void main(String[] args) {
                try {
                server servidor = new server();

                LocateRegistry.createRegistry(9000);

                java.rmi.Naming.rebind("//"
                    + java.net.InetAddress.getLocalHost().getHostAddress()
                    + ":" + 9000 + "/server",servidor);
                System.out.println("Servidor de chat RMI listo.");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
