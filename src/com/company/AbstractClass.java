package com.company;

/*
    Classes que não podem ser instanciadas.
    Uma forma de garantir herança total.
    Somente subclasses não abstratas podem ser instanciadas.
 */
public abstract class AbstractClass {
    protected String nome;
    protected int idade;
    abstract boolean comer();
    abstract boolean dormir();




}
