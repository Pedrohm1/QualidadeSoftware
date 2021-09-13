package com.company;
import java.util.Scanner;
import java.util.*;

public class ContaCorrente {

    private String nome;
    private int cpf;
    private int numconta= 1112;
    private double saldo =0;
    Scanner entrada = new Scanner(System.in);

    public void ContaCorrente ()
    {
        numconta = numconta;
        saldo = saldo;
        nome = entrada.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = entrada.nextInt();

    }

    public void realizaDeposito (){
        Layout layout = new Layout();
        double valor;
        System.out.println("Informe o valor a ser depositado: ");
        valor= entrada.nextDouble();
        if (valor > 0){
           saldo +=saldo + valor;
            System.out.println("O seu novo valor é de : " + saldo);
            layout.Funçoes();
        }
        else {
            System.out.println("Valor invalido ");
            layout.Funçoes();
        }

    }

    public void saque()
    {
        double valor;
        System.out.println("Informe o valor a ser sacado: ");
        valor= entrada.nextDouble();
        if (valor >= saldo){
            System.out.println("Valor invalido ");
            Layout layout = new Layout();
            layout.Funçoes();
        }
        else {   saldo =saldo -valor;
            System.out.println("O novo falor é de: " + saldo);

        }

    }

    public void consultaSaldo (){
        System.out.println("|-----------------|");
        System.out.println("|Seu saldo é    : " + saldo);
        System.out.println("|-----------------|");
    }


}

