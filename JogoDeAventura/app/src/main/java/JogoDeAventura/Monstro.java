/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeAventura;

/**
 *
 * @author Aluno
 */
public class Monstro {
  
String nome;
    int vida;
    int ataque;

    public Monstro(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personagem oponente) {
        oponente.vida -= this.ataque;
        System.out.println(this.nome + " atacou " + oponente.nome + " e causou " + this.ataque + " de dano!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

