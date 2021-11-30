
package reto2.reto2;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Reto2 {

    public static void Punto1(){
        int num1, num2, result;
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola ");
        System.out.println("Ingrese el número hasta el cual se hará cada tabla: ");
        num2 = leer.nextInt();
        System.out.println("Ingrese el número hasta el cual se harán las tablas: ");
        num1 = leer.nextInt();
        for(int i = 1;i <= num1;i++){
            for(int j = 1;j <= num2;j++){
                result = i * j;
                System.out.println((i + " x " + j)+(" = " + result));
            }
            System.out.println();
        }
    }
   
    public static void Punto2(){
        Scanner Entrada = new Scanner (System.in);
        int n;
        int impares;
        int cuadrado= 0;
        impares = 1;
        String procedimiento; 
        procedimiento = "";
        System.out.println("Ingrese un número entero: ");
        n = Entrada.nextInt();
        System.out.print(n + "^2 = ");
        for(int i=1; i<=n; i++){
            if (i !=n ){
                System.out.print(impares + " + ");
                cuadrado = cuadrado + impares;
                procedimiento = procedimiento + impares;
                impares = impares + 2;
            }
            else{
                System.out.print(impares);
                cuadrado = cuadrado + impares;
                procedimiento = procedimiento + impares;
                impares = impares + 2;
            }
        }
        System.out.println(" = " + n + "^2 = " + cuadrado);
    }
     
    public static void Punto3(){
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        n = leer.nextInt();
        int odd = -1;
        for(int i = 1;i <= n;i++){
            System.out.print(i + "^3 = ");
            for(int j = 1;j <= i;j++){
                odd = odd + 2;
                if(j < i){
                    System.out.print(odd + " + ");
                }
                else{
                    System.out.print(odd + " = ");
                }
            }
            System.out.println(Math.pow(i, 3));
            
        }
    }

    public static void Punto4(){
        int cienmil = 0;
        int cincuentamil = 0;
        int veintemil = 0;
        int diezmil = 0;
        int cincomil = 0;
        int dosmil = 0;
        int mil = 0;
        int quinientos = 0;
        int doscientos = 0;
        int cien = 0;
        int cincuenta = 0;
        int residuo = 0;
        int cantidad = 0;
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de dinero a retirar: ");
        cantidad = Entrada.nextInt();
        if (cantidad>=0){cienmil=cantidad/100000;
            residuo=cantidad%100000;
            cincuentamil=residuo/50000;
            residuo=residuo%50000;
            veintemil=residuo/20000;
            residuo=residuo%20000;
            diezmil=residuo/10000;
            residuo=residuo%10000;
            cincomil=residuo/5000;
            residuo=residuo%5000;
            dosmil=residuo/2000;
            residuo=residuo%2000;
            mil=residuo/1000;
            residuo=residuo%1000;
            quinientos=residuo/500;
            residuo=residuo%500;
            doscientos=residuo/200;
            residuo=residuo%200;
            cien=residuo/100;
            residuo=residuo%100;
            cincuenta=residuo/50;
            System.out.println("Usted retiró: ");
            if(cienmil!=0)
                System.out.println(cienmil + " billete(s) de $100.000");
            if(cincuentamil!=0)
                System.out.println(cincuentamil + " billete(s) de $50.000");
            if(veintemil!=0)
                System.out.println(veintemil + " billete(s) de $20.000");
            if(diezmil!=0)
                System.out.println(diezmil + " billete(s) de $10.000");
            if(cincomil!=0)
                System.out.println(cincomil + " billete(s) de $5.000");
            if(dosmil!=0)
                System.out.println(dosmil + " billete(s) de $2.000");
            if(mil!=0)
                System.out.println(mil + " billete(s) de $1.000");
            if(quinientos!=0)
                System.out.println(quinientos + " moneda(s) de $500");
            if(doscientos!=0)
                System.out.println(doscientos + " moneda(s) de $200");
            if(cien!=0)
                System.out.println(cien + " moneda(s) de $100");
            if(cincuenta!=0)
                System.out.println(cincuenta + " moneda(s) de $50");           
        }
    }
      
    public static void main(String[] args) {
       int opcion;
       Scanner leer = new Scanner(System.in);
       boolean sw = true;
       while(sw){
           System.out.println("         Ingrese el número correspondiente a la opción:         ");
           System.out.println("1. Punto 1.");
           System.out.println("2. Punto 2.");
           System.out.println("3. Punto 3.");
           System.out.println("4. Punto 4.");
           System.out.println("5. Salir.");
           
           try{
           opcion = leer.nextInt();
           
           switch(opcion){
               case 1: 
                   Punto1();
                   break;
               case 2: 
                   Punto2();
                   break;
               case 3: 
                   Punto3();
                   break;
               case 4: 
                   Punto4();
                   break;
               case 5: 
                   sw = false;
                   break;
               default:
                   System.out.println("Ingrese una opción válida (Número entre 1 y 5)");
                  
           }
           }catch(InputMismatchException e){
               System.out.println("Debe ingresar un número entero");
               leer.next();
           }
       }
       
    }
    
}
