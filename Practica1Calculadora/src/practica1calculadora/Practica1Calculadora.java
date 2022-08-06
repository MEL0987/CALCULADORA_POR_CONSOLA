/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Practica1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        int opti;

        while (!salir) {
            System.out.println("BIEMBENIDO A MI CALCULADORA");
            System.out.println("\n");
            System.out.println("1. Arimeticas");     //LISTA DE TODAS LAS OPERACIONES DISPONIBLES PARA LA CALCULADORA
            System.out.println("2. Trigonometricas");
            System.out.println("3. Estadisticas");
            System.out.println("4. Calculos");
            System.out.println("5. Salir");

            try {

                System.out.println("\n");
                System.out.println("INTRODUCE UN NUMERO PARA HACER UN CALCULO");    //SE PIDE EL NUMERO DE LA OPERACION A REALIZAR
                opti = entrada.nextInt();

                switch (opti) {
                    case 1:

                        /*AQUI INICIA EL CALCULO DE OPERACIONES ARITMETICAS*/
                        System.out.println("\n");
                        System.out.println("ESCOGISTE ARITMETICAS");

                        /*VARIABLES PARA LAS ARITMETICAS*/
                        int OP;
                        double num1 = 0;
                        double num2 = 0;
                        double result = 1;

                        /*MENU DE OPERACIONES ARITMETICAS*/
                        do {
                            System.out.println("\n");
                            System.out.println("ESCOJA UN NUMERO DE OPCION: ");

                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            System.out.println("4. Division");
                            System.out.println("5. Potencia");
                            System.out.println("6. Salir");

                            OP = entrada.nextInt();

                            /* if(OP !=6){
                System.out.print("Inserte Primer Digito: ");
                num1 = entrada.nextInt();
                System.out.print("Inserte Segundo Digito: ");
                num2 = entrada.nextInt();
            }*/
                            switch (OP) {
                                case 1:
                                    OP = 1;
                                    System.out.print("Inserte Primer Digito: ");
                                    num1 = entrada.nextInt();
                                    System.out.print("Inserte Segundo Digito: ");
                                    num2 = entrada.nextInt();
                                    result = num1 + num2;
                                    System.out.println("EL resultado de la suma es: " + result);
                                    break;

                                case 2:
                                    OP = 2;
                                    System.out.print("Inserte Primer Digito: ");
                                    num1 = entrada.nextInt();
                                    System.out.print("Inserte Segundo Digito: ");
                                    num2 = entrada.nextInt();
                                    result = num1 - num2;
                                    System.out.println("EL resultado de la resta es: " + result);
                                    break;

                                case 3:
                                    OP = 3;
                                    System.out.print("Inserte Primer Digito: ");
                                    num1 = entrada.nextInt();
                                    System.out.print("Inserte Segundo Digito: ");
                                    num2 = entrada.nextInt();
                                    result = num1 * num2;
                                    System.out.println("EL resultado de la multiplicacion es: " + result);
                                    break;

                                case 4:
                                    OP = 4;
                                    System.out.print("Inserte Primer Digito: ");
                                    num1 = entrada.nextInt();
                                    System.out.print("Inserte Segundo Digito: ");
                                    num2 = entrada.nextInt();
                                    result = num1 / num2;
                                    System.out.println("EL resultado de la division es: " + result);
                                    break;

                                case 5:
                                    OP = 5;
                                    int base,
                                     exponente,
                                     expo;
                                    System.out.print("Ingrese la Base: ");
                                    base = entrada.nextInt();
                                    System.out.print("Ingrese el Exponente: ");
                                    exponente = entrada.nextInt();
                                    expo = exponente;
                                    long power = 1;

                                    while (exponente != 0) {

                                        power = power * base;

                                        --exponente;
                                    }
                                    System.out.println(base + " Elevado a " + expo + " es: " + power);
                                    break;
                            }

                        } while (OP != 6);
                        System.out.println("Regresara al menu principal");
                        System.out.println("\n");

                        break;
                    /*AQUI TERMINA EL PROCESO DE LA CALCULADORA ARITMETICA*/

                    /*COMIENZA PROCESO DE LA CALCULADORA TRIGONOMETRICA*/
                    case 2:
                        System.out.println("\n");
                        System.out.println("Esogiste Trigonometricas");
                        int OPE;
                        double y = 0;
                        double cx = 0;
                        double resultado;
                        do {
                            System.out.println("\n");
                            System.out.println("ESCOJA UN NUMERO DE OPCION: ");

                            System.out.println("1. Seno");
                            System.out.println("2. Coseno");
                            System.out.println("3. Tangente");
                            System.out.println("4. Salir");

                            OPE = entrada.nextInt();

                            if (OPE != 4) {
                                /*System.out.print("Inserte Primer Digito: ");
                numO = entrada.nextInt();
                /*System.out.print("Inserte Segunbdo Digito: ");
                numT = entrada.nextInt();*/
                            }

                            switch (OPE) {

                                case 1:
                                    OPE = 1;
                                    double x;
                                    senox seno = new senox();

                                    System.out.println("Digite el dato: ");
                                    double g = entrada.nextDouble();    //lee los grados
                                    x = g * 3.141592 / 180.0;             //convertidor
                                    y = seno.senx(x);                 //se manda a llamar el metodo
                                    System.out.println("Seno(" + g + ") =" + y);    //se imprime el valor 
                                    break;

                                case 2:
                                    OPE = 2;
                                    double t;
                                    cosx coseno = new cosx();
                                    System.out.println("Digite el valor: ");
                                    double q = entrada.nextDouble();
                                    t = q * 3.141592 / 180.0;
                                    cx = coseno.cosenox(t);
                                    System.out.println("Coseno(" + q + ")=" + cx);

                                    break;

                                case 3:
                                    OPE = 3;
                                    System.out.println("Segun los datos que ingreso del seno y el coseno");
                                    System.out.println("El Seno es: " + y);    //se llama el valor del seno
                                    System.out.println("El coseno es: " + cx);   //se llama el valor del coseno
                                    resultado = y / cx;
                                    System.out.println("Por lo tanto la tangente es: " + resultado);
                                    break;
                            }

                        } while (OPE != 4);
                        System.out.println("Regresara al menu principal");
                        break;
                    //FINALIZA LAS TRIGONOMETRICAS

                    //FINALIZA LAS TRIGONOMETRICAS

                    /*EMPIEZA ESTADISTICA*/
                    case 3:
                        System.out.println("\n");
                        System.out.println("Esogiste Estadisticas");

                        int OPER;
                        //Promedio
                        float Resu = 0;
                        float digitos = 1;
                        float var = 0;
                        float cd = 0;

                        //Media
                        double media;
                        double digitos2 = 1;
                        int a;

                        int m;
                        int cont1 = 0;
                        int cont2 = 0;
                        int moda = 0;
                        double digitos3 = 1;

                        //varianza
                        double varianza = 0;
                        double media2 = 0;
                        double digitos4 = 1;

                        //desviacion
                        double desviacion;
                        double media3 = 0;
                        double digitos5 = 1;

                        do {
                            System.out.println("\n");
                            System.out.println("ESCOJA UN NUMERO DE OPCION: ");

                            System.out.println("1. Promedio");
                            System.out.println("2. Media");
                            System.out.println("3. Moda");
                            System.out.println("4. Varianza");
                            System.out.println("5. Desviacion Estandar");
                            System.out.println("6. Salir");

                            OPER = entrada.nextInt();
                            switch (OPER) {

                                /*PROMEDIO*/
                                case 1:
                                    OPER = 1;
                                    System.out.print("Ingrese la cantidad de celdas: ");
                                    System.out.print("\n");
                                    cd = entrada.nextFloat();//cantidad de digitos1
                                    System.out.println("Ingrese " + cd + " elemenos por favor");
                                    System.out.println("\n");
                                    while (digitos <= cd) {

                                        System.out.println("Ingrese el digito: " + digitos);
                                        float n = entrada.nextFloat();
                                        var += n;
                                        digitos++;

                                    }
                                    Resu = var / cd;
                                    System.out.println("EL resultado del Promedio es: " + Resu);
                                    break;
                                //TERMINA CODIGO 

                                /*MEDIA*/
                                case 2:
                                    OPER = 2;
                                    System.out.print("Ingrese la cantidad de celdas");
                                    System.out.print("\n");
                                    a = entrada.nextInt();
                                    System.out.println("Ingrese " + a + " elemenos por favor");
                                    System.out.println("\n");
                                    double numeros[] = new double[a];
                                    for (int i = 0; i < a; i++) {

                                        System.out.println("Ingrese el digito: " + digitos2);
                                        numeros[i] = entrada.nextInt();
                                        digitos2++;

                                    }
                                    double suma = 0;
                                    for (double i : numeros) {
                                        suma = suma + i;

                                    }
                                    media = suma / a;
                                    System.out.println("La media es: " + media);
                                    break;

                                //TERMINA CODIGO MEDIA

                                /*MODA*/ /*LA MODA SOLO PERMITE DATOS ENTEROS*/
                                case 3:
                                    OPER = 3;
                                    System.out.print("Ingrese la cantidad de celdas: ");
                                    System.out.print("\n");
                                    int n = entrada.nextInt(),
                                     c;
                                    int[] q = new int[n];
                                    int[] b = new int[n];
                                    System.out.println("Ingrese " + n + " elemenos por favor por favor"); //ingresar elementos luego dar enter y seguir ingresando
                                    System.out.println("\n");
                                    double sum = 0;
                                    for (int i = 0; i < n; i++) {
                                        q[i] = entrada.nextInt();
                                    }
                                     {
                                        for (int i = 0; i < n; i++) {
                                            c = 1;
                                            if (q[i] == -1) {
                                                b[i] = 0;
                                            } else {
                                                for (int j = i + 1; j < n; j++) {
                                                    if (q[i] == q[j]) {
                                                        c++;
                                                        q[j] = -1;
                                                    }
                                                }
                                                b[i] = c;
                                            }
                                        }
                                        int g = b[0];
                                        for (int i = 1; i < n; i++) {
                                            if (b[i] >= g) {
                                                m = b[i];
                                            }

                                        }
                                        for (int i = 0; i < n; i++) {
                                            if (b[i] == g) {
                                                System.out.println("La moda es: " + q[i]);
                                            }
                                        }
                                    }
                                    break;

                                //TERMINA CODIGO MODA

                                /*VARIANZA*/ /*LA VARIANZA SOLO PERMITE DATOS ENTEROS*/
                                case 4:
                                    OPER = 4;

                                    System.out.print("Ingrese la cantidad de celdas");
                                    System.out.print("\n");
                                    a = entrada.nextInt();
                                    System.out.println("Ingrese " + a + " elemenos por favor");
                                    System.out.println("\n");
                                    double numeros2[] = new double[a];
                                    for (int i = 0; i < a; i++) {

                                        System.out.println("Ingrese el digito: " + digitos4);
                                        numeros2[i] = entrada.nextInt();
                                        digitos4++;

                                    }
                                    double suma2 = 0;
                                    for (double i : numeros2) {
                                        suma2 = suma2 + i;
                                        media2 = suma2 / a;
                                    }

                                    double sumatoria;
                                    for (int i = 0; i < a; i++) {
                                        sumatoria = Math.pow(numeros2[i] - media2, 2);
                                        varianza = varianza + sumatoria;
                                    }
                                    varianza = varianza / (a - 1);
                                    System.out.println("EL resultado de la Varianza es: " + varianza);
                                    break;
                                //TERMINA CODIGO VARIANZA          

                                /*DESVIACION */
                                case 5:
                                    OPER = 5;
                                    System.out.print("Ingrese la cantidad de celdas");
                                    System.out.print("\n");
                                    a = entrada.nextInt();
                                    System.out.println("Ingrese " + a + " elemenos por favor");
                                    System.out.println("\n");
                                    double numeros3[] = new double[a];
                                    for (int i = 0; i < a; i++) {

                                        System.out.println("Ingrese el digito: " + digitos5);
                                        numeros3[i] = entrada.nextInt();
                                        digitos5++;

                                    }
                                    double suma3 = 0;
                                    for (double i : numeros3) {
                                        suma3 = suma3 + i;
                                        media3 = suma3 / a;
                                    }
                                    double sumatoria2;
                                    for (int i = 0; i < a; i++) {
                                        sumatoria2 = Math.pow(numeros3[i] - media3, 2);
                                        varianza = varianza + sumatoria2;
                                    }
                                    varianza = varianza / (a - 1);

                                    desviacion = Math.sqrt(varianza);
                                    double resultadosss = Math.rint(desviacion * 100) / 100;

                                    System.out.println("EL resultado de la Desviacion Estandar es: " + resultadosss);
                                    break;
                            }
                            //TERMINA CODIGO DESVIACION

                        } while (OPER != 6);
                        System.out.println("Regresara al menu principal");
                        break;

                    //INICIA CALCULOS
                    case 4:
                        
                        System.out.println("Esogiste Calculos");
                        System.out.println("\n");
                        char[] variable
                                = {'a', 'b', 'c', 'x', 'y', 'z', 'w'};
                        System.out.println("Ingrese un Numero Para Columnas y Filas");
                        System.out.println("Ejemplo: 3");
                        Scanner sc = new Scanner(System.in);
                        int num = entrada.nextInt();
                        System.out.println("\n");
                        System.out.println("Ingrese los coeficientes conforme al numero que ingreso");

                        System.out.println("Ingrese los datos como en el siguiente ejemplo");
                        System.out.println("1  2  5 .... ");
                        System.out.println("\n");
                        // Ingreso de coeficientes
                        int[][] matrix = new int[num][num];
                        int[][] constt = new int[num][1];
                        for (int i = 0; i < num; i++) {
                            for (int j = 0; j < num; j++) {
                                matrix[i][j] = sc.nextInt();
                            }
                            constt[i][0] = sc.nextInt();
                        }
                        // Representacion de las ecuaciones lineales a
                        // Matricial
                        System.out.println(
                                "La representacion Matricial de las ecuaciones que ingreso es: ");
                        for (int i = 0; i < num; i++) {
                            for (int j = 0; j < num; j++) {
                                System.out.print(" " + matrix[i][j]);
                            }
                            System.out.print("  " + variable[i]);
                            System.out.print("  =  " + constt[i][0]);
                            System.out.println();
                        }
                        break;

                    //TERMINA CALCULOS
                    case 5:
                        salir = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 5");
                }

            } catch (InputMismatchException e) { //Para que solo me permita numeros no Letras o Palabras
                System.out.println("Debes introducir solo numeros");
                entrada.nextInt(); //Si no pongo esto se queda en BUCLE

            }
        }
        System.out.println("Finalizo La Calculadora");
    }
}
