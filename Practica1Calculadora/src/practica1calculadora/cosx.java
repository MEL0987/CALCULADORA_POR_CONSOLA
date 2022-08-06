/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1calculadora;

/**
 *
 * @author Ismael
 */
public class cosx {
    
    public double cosenox(double valor){
        int cont=1;
        double potencia1=2;
        double potencia2=4;
        double y;
        double sumapositiva=0.0;
        double sumanegativa=0.0;
        
        factorial2 fact = new factorial2();
        do{
            sumapositiva=sumapositiva-(Math.pow(valor, potencia1))/fact.calcula_factorial(potencia1); //Taylor
            potencia1+=4;
            sumanegativa=sumanegativa+(Math.pow(valor, potencia2))/fact.calcula_factorial(potencia2); //Taylor
            potencia2+=4;
            cont++;
        }while(cont<4);
        y=1+sumapositiva+sumanegativa;
        return y;
    }
    
}
