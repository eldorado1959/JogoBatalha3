/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeAventura;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class JogoDeAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
        Monstro monstro = new Monstro("Jeferson",100,100);
        Personagem personagem = new Mago("", 0, 0);
        System.out.println("Jogo de Aventuras!");
        System.out.print("Qual o nome do seu personagem? ");
        String nome = scanner.nextLine();

        System.out.println("Escolha sua classe: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        int escolha = scanner.nextInt();

        
        
        switch (escolha) {
    case 1:
        //personagem = new Guerreiro(nome);
        break;
    case 2:
        personagem = new Mago(nome,100,100);
        break;
    case 3:
        //personagem = new Arqueiro(nome); // Crie a classe `Arqueiro`.
        break;
    default:
        System.out.println("Opção inválida. Criando Guerreiro por padrão.");
        
        personagem = new Mago(nome,100,100);
        break;
}

        
        System.out.println("Bem-vindo, " + nome );

        // Exemplo de combate
        while (personagem.vida > 0 && monstro.vida > 0) {
            System.out.println("\n Encontrou monstro");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            int acao = scanner.nextInt();

            if (acao == 1) {
                //personagem.atacar(); passe um personagem como parametro
                
                personagem.atacar(monstro);
                
            } else if (acao == 2) {
            System.out.println("Ação inválida!");    
            break;
            } else {
                System.out.println("Ação inválida!");
            }
        }

        if (!personagem.estaVivo() ) {
            System.out.println("Você foi derrotado. Fim de jogo!");
        } 
          

        scanner.close();
    }
}
