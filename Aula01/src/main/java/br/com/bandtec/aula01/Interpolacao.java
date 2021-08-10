/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.aula01;

/**
 *
 * @author Aluno
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Predo";
        Integer idade = 18;
        Double altura = 1.70;
        
        String frase = String.format("My name is %s, tenho %d anos e %.2f de altura", nome, idade, altura);
        
        System.out.println(frase);
        
    }
    
}
