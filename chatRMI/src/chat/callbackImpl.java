/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class callbackImpl extends UnicastRemoteObject implements callbackClient {
    private final String usuario;
    private final JTextArea jTextArea;

    public callbackImpl(String usuario,  JTextArea jTextArea) throws RemoteException {
        this.usuario = usuario;
        this.jTextArea = jTextArea;
    }

    @Override
    public void recibirMensaje(String mensaje) throws RemoteException {
        SwingUtilities.invokeLater(() -> {
            if (jTextArea != null) {
                jTextArea.append(mensaje + "\n");
            } else {
                System.out.println("JTextArea not set for user: " + usuario);
            }
        });
    }


    @Override
    public String getNombreUsuario() throws RemoteException {
        return usuario;
    }
}

