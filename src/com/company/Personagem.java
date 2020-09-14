package com.company;

/*
    >> quando classe é criada como final,
    não pode existir subclasses.

    >> quando metodo é criado como final,
    não pode ser sobrescrito

    >> quando uma variável é atribuida como final,
    o valor dela é alterado apenas 1 vez.
 */
public class Personagem {
    private int atack;
    private int defense;
    private int life;
    private String name;

    public final boolean danoSofrido(int dano) {
        if (defense > dano) {
            defense = defense - dano;
            return true;
        }
        else {
            return false;
        }
    }

    public Personagem(int atack, int defense, int life, String name) {
        this.atack = atack;
        this.defense = defense;
        this.life = life;
        this.name = name;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
