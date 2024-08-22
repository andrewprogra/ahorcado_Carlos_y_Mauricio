package juarez_carlosbiarray;

import java.util.Scanner;
import java.util.Random;

public class Juarez_CarlosBiArray {

    public static void main(String[] args) {
        //llamamos al scanner
        Scanner lea = new Scanner(System.in);
        boolean continuar = false;

        do {
            System.out.println("***Arreglo bidimesional****");
            System.out.println("----------------------------");
            System.out.print("\ningrese cantidad de filas que desea que el arreglo tenga:");
            int filas = lea.nextInt();
            System.out.print("\ningrese cantidad de columnas que desea que el arreglo tenga:");
            int columnas = lea.nextInt();

            if (filas != columnas) {
                System.out.println("\nel arreglo no es cuadrado");

                continuar = true;
            } else {
                Random random = new Random();//llamamos a random

                //arreglo
                int[][] arreglo=new int[filas][columnas];

               //nesesitamos que los numeros random ingresen al arreglo
                for (int Filas = 0; Filas < filas; Filas++) {
                    for (int Columnas = 0; Columnas < filas; Columnas++) {
                      arreglo[Filas][Columnas]=random.nextInt(90) + 10;
                       
                    }

                }
                
                System.out.println("****El arreglo seria:****");
                
                //mostramos los numeros random en orden segun como querramos el arreglo
                for(int Filas=0;Filas<filas;Filas++){
                for(int Columnas=0;Columnas<columnas;Columnas++){
                    System.out.print(arreglo[Filas][Columnas]+" ");
                }
                    System.out.println();
                }
                System.out.println();
                
                //suma Diagonal principal/nesesitamos que al primer suma vaya de manera diagonal
               
                for(int i=0;i<=arreglo.length;i++){
                
                }
                
                continuar = false;
            }
        } while (continuar);

    }

}
