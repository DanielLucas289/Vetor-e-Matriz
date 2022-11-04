/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num4;
import java.util.Scanner;
/**
 *
 * @author Dani Lucas
 */
public class Num4 {

    
    public static void AnalisaTemperaturas(double[] Temperatura)
    {
     Scanner teclado = new Scanner(System.in);
     
      double guarda, maior = 0 , soma = 0, menor = 40 , ComparaMedia = 0;
      double media = 0;
     
      for(int cont = 0; cont < Temperatura.length; cont++)
      {
        System.out.println("Digite a temperatura do " + (cont+1) + "ª dia");
        guarda = teclado.nextDouble();
        
        if(guarda <= 40 && guarda >= 15)
        {
           Temperatura[cont] = guarda;
           
           if(Temperatura[cont] > maior)
            maior = Temperatura[cont];
           
           if(Temperatura[cont] < menor)
           menor = Temperatura[cont];
           
           soma += Temperatura[cont];
            
        }
        else
        {
          System.out.println("Temperatura inválida");
          cont--;
        }    
        
      }  
      
      media = (double)(soma/Temperatura.length);
      
      for(int i = 0; i < Temperatura.length; i++)
      {
        if(Temperatura[i] < media)
           ComparaMedia++; 
      }
      
      System.out.println("A menor temperatura registrada é: " + menor);
      System.out.println("A maior temperatura registrada é: " + maior);
      System.out.println("A temperatura media é : " + media);
      System.out.println("O número de dias que a temperatura foi abaixo da média é: " + ComparaMedia);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         double VetTemp[] = new double [31]; 
         
         AnalisaTemperaturas(VetTemp);
    }
    
}
