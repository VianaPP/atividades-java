/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.aula01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Bilhete {
    public static void main(String[] args) {
         
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do seu saldo:");
        Double saldo = leitor.nextDouble();
        
        Double restantePassagem = saldo / 4.40;
     
        System.out.println("Restam o total de " + (int)Math.floor(restantePassagem) + " Passagem,"
                + "que você pode utilizar");
        
        
        
        
        
    }
}
