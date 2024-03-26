/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasFilosofos;

/**
 *
 * @author hertz676
 */
public class Filosofo extends Thread {

    private Tenedor primerTenedor;
    private Tenedor segundoTenedor;
    private String primerTenedortxt;
    private String segundoTenedortxt;

    public Filosofo(Tenedor _tenedorIzq, Tenedor _tenedorDer, String iniciarCena) {
        if (iniciarCena.equals("izquierda")) {
            primerTenedor = _tenedorIzq;
            segundoTenedor = _tenedorDer;
            primerTenedortxt = "izquierda";
            segundoTenedortxt = "derecha";
        }
        if (iniciarCena.equals("derecha")) {
            primerTenedor = _tenedorDer;
            segundoTenedor = _tenedorIzq;
            primerTenedortxt = "izquierda";
            segundoTenedortxt = "derecha";
        }
    }

    public void run() {
        for(int i =1; i<=5; i++){
            
        }
    }

}
