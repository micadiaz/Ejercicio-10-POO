package ejercicio.pkg10.poo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10Poo {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double aux;
       double [] A=new double[50];  //inicializacion de los arreglos
       double[] B=new double[20];  // "  "       " "       " "
         
        for (int i = 0; i < 50; i++) {
            A[i]=(double)(Math.random()*50);  //ingreso de numeros aleatorios
        }
 
        for (int i = 0; i < 50-1; i++) {
            for (int j = 0; j < 50-1; j++) {
                if(A[j]>A[j+1]){  //si el numero en el que estamos(A[j]) es mayor al que le sigue (A[j+1]),hace lo que sigue
                aux=A[j];
                A[j]=A[j+1];
                A[j+1]=aux; }
            }
        }
        System.out.println("los 50 numeros ordenados de menor a mayor quedaria= ");
        for (int i = 0; i < 50; i++) {
            System.out.println(A[i]);
        }
       int j=0;
        for (int i = 0; i < 10; i++) {
         B[j]=A[i];
         j++;
          }
        System.out.println("");
        System.out.println("los 20 numeros combinados quedaria= ");
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }
          j=0;
        for (int i = 0; i < 10; i++) {
            B[j]=0.5;
            j++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }
     }   
}  
 

/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/