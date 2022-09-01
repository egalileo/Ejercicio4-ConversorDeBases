package com.mycompany.conversorbases;

import javax.swing.JOptionPane;

/* 
    Elaborar una aplicacion la cual pregunte al usuario si desea convertir 
    un numero decimal entero positivo a binario, octal o Hexadecimal, por medio de un menu
*/

public class App {

    public static void main(String[] args) {
        boolean salir = false;
        int opcion, numero, base, temporal, residuo;
        String salida = "", caracteres;
        
        while(salir == false){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese la opcion que desee"
                    + "\n1. Convierta a Decimal\n2. Convertir a Octal\n3.Convertir a Hexadecimal"
                    + "\nCualquier otro numero para salir"));
            switch (opcion){
                case 1: //Decimal a Binario
                    
                    do{
                        numero = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese el numero que desea convertir a binario")); 
                        if(numero<0){
                            JOptionPane.showMessageDialog(null, "Error. Ingrese un numero positivo");
                        }
                    }while(numero < 0);
                    base = 2;
                    temporal = numero;
                    
                    while(temporal > 0){
                        residuo = temporal % base;
                        temporal = temporal / base;
                        salida = residuo + salida;
                    }
                    JOptionPane.showMessageDialog(null, "El numero: "+ numero
                            +" en Decimal\nconvertido a Binario es: "+salida);
                    break;
                case 2: //Decimal a Octal
                    do{
                        numero = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese el numero que desea convertir a Octal")); 
                        if(numero<0){
                            JOptionPane.showMessageDialog(null, "Error. Ingrese un numero positivo");
                        }
                    }while(numero < 0);
                    base = 8;
                    temporal = numero;
                    
                    while(temporal > 0){
                        residuo = temporal % base;
                        temporal = temporal / base;
                        salida = residuo + salida;
                    }
                    JOptionPane.showMessageDialog(null, "El numero: "+ numero
                            +" en Decimal\nconvertido a Octal es: "+salida);
                    break;
                case 3: //Decimal a Hex
                    do{
                        numero = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese el numero que desea convertir a Hexadecimal")); 
                        if(numero<0){
                            JOptionPane.showMessageDialog(null, "Error. Ingrese un numero positivo");
                        }
                    }while(numero < 0);
                    base = 16;
                    temporal = numero;
                    caracteres = "0123456789ABCDEF";
                    while(temporal > 0){
                        residuo = temporal % base;
                        temporal = temporal / base;
                        salida = caracteres.charAt(residuo) + salida;
                    }
                    JOptionPane.showMessageDialog(null, "El numero: "+ numero
                            +" en Decimal\nconvertido a Hexadecimal es: "+salida);
                    salida = "";
                    break;
                default:
                    salir = true;
                    break;
            }
        }
    }
}
