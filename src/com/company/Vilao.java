package com.company;

/*
    quando classe é criada como final, não pode existir subclasses.
 */
public final class Vilao extends Personagem {

    public Vilao(int atack, int defense, int life, String name) {
        super(atack, defense, life, name);
    }

}
