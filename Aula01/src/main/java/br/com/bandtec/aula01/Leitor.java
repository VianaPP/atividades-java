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
public class Leitor {

    public static void main(String[] args) {
        
        // Declaração padrão de um objeto do tipo scanner
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        
        System.out.println("Bem vindo: " +  nome);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        
    }
}
