/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num5;
import java.util.Scanner;
/**
 *
 * @author Dani Lucas
 */
public class Num5 {

    public static void PreencheMatriz(int [][]M)
    {
        Scanner teclado = new Scanner(System.in);
    
        
        for(int i = 0; i < M[0].length; i++)
        {
           for(int j = 0; j < M.length; j++)
           {
              System.out.println("Digite da linha " + (i+1) + " e coluna " + (j+1));
              M[i][j]  = teclado.nextInt();
          
           }
        }
       
        
        
       SomaA(M);
       SomaB(M);
       SomaC(M);
       SomaD(M);
       SomaE(M);
    }
    
    public static void SomaA(int M[][])
    {
     int soma = 0;   
        
     for(int i = 0; i < M.length; i++)
     {
       soma += M[3][i];   
     }
     
     System.out.println("A soma dos elementos da linha 4 é: " + soma);
    
    }
    
    public static void SomaB(int M[][])
    {
     int soma = 0;   
        
     for(int i = 0; i < M.length; i++)
     {
       soma += M[i][1];   
     }
     
     System.out.println("A soma dos elementos da coluna 2 é: " + soma);
    
    }
    
     public static void SomaC(int M[][])
    {
     int soma = 0;   
        
     for(int i = 0; i < M.length; i++)
     {
       soma += M[i][i];   
     }
     
     System.out.println("A soma dos elementos da diagonal principal é: " + soma);
    
    }
     
     public static void SomaD(int M[][])
    {
     int soma = 0;   
        
     for(int i = 0, j = 4; i < M.length; i++)
     {
       soma += M[i][j];
       j--;
     }
     
     System.out.println("A soma dos elementos da diagonal secundária é: " + soma);
    
    }
     
     public static void SomaE(int M[][])
    {
     int soma = 0;   
        
     for(int i = 0; i < M[0].length; i++)
        {
           for(int j = 0; j < M.length; j++)
           {
              soma += M[i][j];
           }
        }
     System.out.println("A soma de todos os elementos da matriz é: " + soma);
    
    }
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] M = new int[5][5];
        
        PreencheMatriz(M);
        
    }
    
}
