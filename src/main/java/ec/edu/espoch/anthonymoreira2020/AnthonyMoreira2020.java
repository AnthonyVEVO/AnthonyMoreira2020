/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.anthonymoreira2020;

import java.util.Scanner;


public class AnthonyMoreira2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner menu = new Scanner (System.in);
        
        //definir variables
           float    totalPuntos;
           float    promedioPuntos;
           float    puntAlta;
           float    puntBaja;
           
           
        //creacion de vector tamaño 7    
            float [] puntua = new float  [7];
            for (int i = 0; i < 7; i++) {
                System.out.println("Ingrese las puntuaciones optenidas en cada uno de los  7 dias");
            
        //validar que no sea un numero no negativo        
                puntua[1]= sc.nextFloat();
                if (puntua[i]<0){
                System.out.println("No cumple esta condicion");
                
        //menu       
             int opcion = 0;
                System.out.println("Seleccione una opcion");
                    
                System.out.println("1.Caulcular el total de puntuaciones de la semana");
                System.out.println("2.Cacular el promedio y mostrar dias por encima y por debajo del promedio");
                System.out.println("3.Mostrar el dia con la puntuacion mas alta y el dia con la puntuacion mas baja");
                System.out.println("4.Calcular el total de puntuaciones acumuladas durante los primeros cuatro dias y los ultimos cuatro dias");
                System.out.println("5.Salir");
                
                opcion = menu.nextInt();
                
            switch (opcion){
                case 1:
                 totalPuntos= 0;
                    for (int j = 0; i < 7; i++) {
                        totalPuntos = puntua[i] +totalPuntos;          
                    }
                    float suma = 0;
                    for (int j = 0; j < 10; j++) {
                        suma =  puntua[i]+suma;    
                    
                    System.out.println("el valor total de las puntuaciones de la semana es:");
                    break;
                default:
                
                case 2:
                    
                 promedioPuntos= suma/7;
                 for (int k = 0; k < 7; k++) {
                 if (promedioPuntos<puntAlta) {
                 System.out.println("La cantidad esta por encima del promedio"+puntAlta);
                 
                 for (int k = 0; k < 7; k++) {
                 if (promedioPuntos>puntBaja) {
                 System.out.println("La cantidad esta por debajo del promedio"+puntBaja);
                 break;
                 
                 default:

                 
                 case 3:
                 puntAlta= puntua[0];
                 puntBaja= puntua[0];

                 for (int k = 0; k < 7; k++) {
                 if (puntua[i]>puntAlta) {
                    puntAlta= puntua[i];
                 if (puntua[i]<puntBaja) {
                    puntBaja= puntua[i];
                    
                    System.out.println("la puantuacion mas alta");
                    System.out.println("la puntuacion mas baja");
                    System.out.println("los dias");
   
}
   
}
                 
    
}
                 
                 
               
   
}
    
}
                
                 
                 
             
   
}
    
}
                    }
                    
            
            }
                    
                    
                
                
        
            
           
               
                    
                }
        }
            
            
          

              
             
              
    }
}
