package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
    	 try {
             System.out.println("Digite o primeiro parâmetro");
             int numero1 = sc.nextInt();
             sc.nextLine();
             System.out.println("Digite o segundo parâmetro");
             int numero2 = sc.nextInt();
             sc.nextLine(); 

             try {
                 contar(numero1, numero2);
             } catch (ParametrosInvalidosException e) {
                 System.out.println("O segundo parâmetro precisa ser maior que o primeiro.");
             }

         } catch (InputMismatchException e) {
             System.out.println("Entrada inválida: o dígito não é um número inteiro");
         }
    	
    	
       

    }

    public static void contar(Integer numero1, Integer numero2) throws ParametrosInvalidosException{
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException();
        
        	
        }

        int imprimir = 1;
        for (; numero1 < numero2; numero1++) {
            System.out.println("Imprimindo número " + imprimir);
            imprimir++;
        }
    }
}
