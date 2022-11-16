/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodsarea;
import javax.swing.JOptionPane;
/**
 *
 * @author Erik
 */
public class MethodsArea {

    public static void main(String[] args) {
        String Texto="";
        double resultado=0;
        String eleccion=JOptionPane.showInputDialog("Introduce una figura:\n circulo\n triangulo\n cuadrado");
        switch(eleccion){
            case"circulo":
                Texto=JOptionPane.showInputDialog("Ingresa el radio");
                int radio=Integer.parseInt(Texto);
                resultado=areaCirculo(radio);
            break;
            case "triangulo":
                Texto=JOptionPane.showInputDialog("Introduce la base");
                int base=Integer.parseInt(Texto);
                Texto=JOptionPane.showInputDialog("Ingrese la altura");
                int altura=Integer.parseInt(Texto);
                resultado=areaTriangulo(base,altura);
            break;
            case"cuadrado":
                Texto=JOptionPane.showInputDialog("Ingresa la medida de un lado");
                int lado=Integer.parseInt(Texto);
                resultado=areaCuadrado(lado);
            break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            break;
        }
        JOptionPane.showMessageDialog(null, "El area del "+eleccion+" es "+resultado);
    }
    
public static double areaCirculo(int radio){
    return Math.pow(radio, 2)*Math.PI;
}
public static double areaTriangulo(int base, int altura){
    return (base*altura)/2;
}

public static double areaCuadrado(int lado){
    return lado*lado;
}

}
