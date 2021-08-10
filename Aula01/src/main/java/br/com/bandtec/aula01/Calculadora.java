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
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        Double numero1 = leitor.nextDouble();

        System.out.println("Digite outro numero real: ");
        Double numero2 = leitor.nextDouble();

        String soma = String.format("A soma é: %.2f", (numero1 + numero2));
        System.out.println(soma);

        String subtracao = String.format("A subtração é: %.2f" + (numero1 - numero1));
        System.out.println(subtracao);

        String multiplicacao = String.format("A multiplicação é: %.2f" + (numero1 * numero2));
        System.out.println(multiplicacao);

        if (numero2 != 0 && numero1 != 0) {
            String divicao = String.format("A divisão é: %.2f" + (numero1 / numero2));
            System.out.println(divicao);
        } else {
            System.out.println("Erro, não é possivel dividir 0");
        }

        

        System.out.println("-------------------Fim--------------------");

    }
}
