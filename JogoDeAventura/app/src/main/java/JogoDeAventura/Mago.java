/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeAventura;

/**
 *
 * @author Aluno
 */
public class Mago extends Personagem {
    public Mago(String nome, int vida, int ataque) {
        //super(nome, Dados.rolarVarios(4, 2), Dados.rolarVarios(6, 3), Dados.rolarVarios(8, 4), Dados.rolarVarios(6, 2));
        super(nome,vida,ataque);
    }

    @Override
    public void atacar(Monstro oponente) {
        System.out.println(this.nome + " ataca com sua varinha, causando " + ataque + " de dano!");
    }

    /*
    public void usarMagia() {
        System.out.println(nome + " lança uma magia poderosa, gastando mana!");
        mana -= 5;
    }*/

    /*
    public void usarItem() {
        System.out.println(nome + " usa um item mágico para recuperar mana!");
        mana += 10;
    }*/

    
    public void fugir() {
        System.out.println(nome + " tenta fugir!");
    }
}
