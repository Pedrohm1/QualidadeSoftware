package com.company;
import java.util.Scanner;
public class Layout {

    public void Layoutinicial() {
        System.out.println("|------------------------ByteBank-----------------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|---------Criando sua Conta Corrente--------------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("Informe seu nome:");

    }

    public void Funçoes() {
        Scanner entrada = new Scanner(System.in);
        int contador;
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("|-----------------------------------------|");
        System.out.println("|Para realizar depósito aperte   (1)      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Para realizar saque aperte      (2)      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Para consultar seu saldo aperte (3)      |");
        System.out.println("|-----------------------------------------|");
        contador = entrada.nextInt();
        if (contador == 1 )
        {
contaCorrente.realizaDeposito();
        }
        else if (contador ==2)
        {
contaCorrente.saque();
        }
        else if (contador ==3 )
        {
contaCorrente.consultaSaldo();
        }
        else
        {
            System.out.println("|-----------------------------------------|");
            System.out.println("|Tecla invalida                           |");
            System.out.println("|-----------------------------------------|");
            Layout layout = new Layout();
            layout.Funçoes();
        }


    }
}

