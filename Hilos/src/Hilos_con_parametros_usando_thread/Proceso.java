/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos_con_parametros_usando_thread;

/**
 *
 * @author hertz676
 */
public class Proceso extends Thread{
    int num_entero;

    public Proceso(String nombreHilo) {
        super(nombreHilo);//La palabra super da a entender que se tomara un atributo de la clase padre (thread), la clase name es el unico atributo de tipo string
        //Asigna el valor mandado desde el main, lo asigna al atributo name y con el getName(), regresa el valor que se asigno
    }
       
    @Override
    public void run(){
        for (int i = 0; i < num_entero; i++) {
            System.out.println(i+this.getName());
        }
        System.out.println("");
    }
    public void tomarValor(int valor){
        this.num_entero=valor;
    }
}
