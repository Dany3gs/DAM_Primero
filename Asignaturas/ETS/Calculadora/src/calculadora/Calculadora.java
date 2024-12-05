/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Calculadora {

    int dato1, dato2;

    public Calculadora(int dato1, int dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public int suma() {
        return dato1 + dato2;
    }

    public int resta() {

        return dato1 - dato2;
    }

    public int dividir() {
        return dato1 % dato2;
    }

}
