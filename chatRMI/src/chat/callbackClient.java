/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chat;

import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author hertz676
 */
public interface callbackClient extends Remote{
    void recibirMensaje(String message) throws RemoteException;
    String getNombreUsuario() throws RemoteException;
}
