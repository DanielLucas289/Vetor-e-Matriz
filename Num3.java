/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num.pkg3;
import java.util.Scanner;
/**
 *
 * @author Dani Lucas
 */
public class Num3 {

   public static void Preenchevet(int[] x , int[] y)
 {
    Scanner teclado = new Scanner(System.in);

    for(int cont = 0; cont < x.length; cont++)
    {
      System.out.println("Digite o " + (cont+1) + "ª valor da lista x");
       x[cont] = teclado.nextInt();
    }  

    for(int cont = 0; cont < y.length; cont++)
    {
      System.out.println("Digite o " + (cont+1) + "ª valor da lista y");
       y[cont] = teclado.nextInt();
    }  
   
     ParImpar(x,y);
 }

 public static void ParImpar(int vet1[] , int vet2[])
 {
   int NovoVet[] = new int [20];  
     
   for(int cont1 = 0, cont2 = 0 , cont3 = 0; cont1 < NovoVet.length; cont1++)
   {
     if(cont1 % 2 == 0)
     {    
      NovoVet[cont1] = vet2[cont2];
      cont2++;
     }
     else
     {    
      NovoVet[cont1] = vet1[cont3]; 
      cont3++;
     } 
   } 
   
    System.out.println();
    System.out.println();
    
    for(int s = 0; s < NovoVet.length; s++)
    {
      System.out.println(NovoVet[s]);
    }
    
   
   
 
 }

  
  public static void main(String[] args) {
     int lista1[] = new int [10];
     int lista2[] = new int [10];

     Preenchevet(lista1,lista2);
  }
}
