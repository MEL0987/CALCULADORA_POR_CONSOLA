/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1calculadora;

/**
 *
 * @author Ismael
 */
public class senox {

    /**
     *
     * @param valor
     * @return
     */
    public double senx(double valor){
        int cont=1;
        double potencia1=1;
        double potencia2=3;
        double y;
        double sumaspositiva=0.0;
        double sumanegativa=0.0;
        
        factorial fact = new factorial();
        do{
            sumaspositiva=sumaspositiva+(Math.pow(valor, potencia1))/fact.calculo_factorial(potencia1);
            potencia1+=4;
            sumanegativa=sumanegativa-(Math.pow(valor, potencia2))/fact.calculo_factorial(potencia2);
            potencia2+=4;
            cont++;
            
        }while(cont<4);
        y=sumaspositiva+sumanegativa;
        return y;
        }
    
}
