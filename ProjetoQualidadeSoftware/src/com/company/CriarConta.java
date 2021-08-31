package com.company;

import java.lang.reflect.Constructor;

public class CriarConta {

    private int numeroConta;
    private double saldo;
    private String nome;
    public CriarConta(int numeroConta, double saldo, String nome)
    {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
}
