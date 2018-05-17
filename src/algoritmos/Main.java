/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Eliam
 */
public class Main {
    public static void main(String[] args) {
        Fachada fac=new Fachada(5, 9);
        fac.ordenarBy("quickSort");
    }
}
