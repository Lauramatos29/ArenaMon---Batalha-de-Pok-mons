package classes;

import java.util.Scanner;

public class Batalha extends Pokemon {
	
	 public Batalha(String nome, String tipo, int hp, int ataque, int defesa) {
	        super(nome, tipo, hp, ataque, defesa);
	    }

	    void atacarOponente(Pokemon oponente, Scanner scanner) {
	        int escolha;
	        do {
	            System.out.println("Escolha um ataque para " + nome + ":");
	            System.out.println("1 - Ataque 1");
	            System.out.println("2 - Ataque 2");
	            System.out.println("3 - Ataque 3");
	            System.out.println("4 - Ataque 4");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Entrada inválida. Digite um número entre 1 e 4.");
	                scanner.next(); 
	            }
	            escolha = scanner.nextInt();
	        } while (escolha < 1 || escolha > 4);

	        int dano = 0;
	        
	        switch (escolha) {
	        
	            case 1:
	                System.out.println("Ataque 1 em curso.");
	                dano = (10 + ataque) - oponente.defesa;
	                oponente.hp -= dano;
	                System.out.println(nome + " atacou " + oponente.nome + " causando " + dano + " de dano \n");
	                
	                break;
	                
	            case 2:
	            	System.out.println("Ataque 2 em curso.");
	                dano = (15 + ataque) - oponente.defesa;
	                oponente.hp -= dano;
	                System.out.println(nome + " atacou " + oponente.nome + " causando " + dano + " de dano \n");
	                
	                break;
	                
	            case 3:
	            	System.out.println("Ataque 3 em curso.");
	                dano = (20 + ataque) - oponente.defesa;
	                oponente.hp -= dano;
	                System.out.println(nome + " atacou " + oponente.nome + " causando " + dano + " de dano \n");
	                
	                break;
	                
	            case 4:
	            	System.out.println("Ataque 4 em curso.");
	                dano = (25 + ataque) - oponente.defesa;
	                oponente.hp -= dano;
	                System.out.println(nome + " atacou " + oponente.nome + " causando " + dano + " de dano \n");
	                
	                break;
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Pokemon jogador = new Batalha("Picachu", "Fogo", 100, 50, 30);
	        Pokemon oponente = new Batalha ("Chamander", "Fogo", 90, 60, 25);

	        int opcao;
	        
	        do {
	            System.out.println("ArenaMon - Batalha de Pokémons");
	            System.out.println("1 - Iniciar Batalha");
	            System.out.println("2 - Vizualizar Pokémon");
	            System.out.println("0 - Sair");
	            
	            while (!scanner.hasNextInt()) {
	            	System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
	            }
	            
	            opcao = scanner.nextInt();

                switch (opcao) {
                
                case 1:
                    System.out.println("Que comece a batalha!");

                    while (jogador.estaVivo() && oponente.estaVivo()) {
                        System.out.println("Vez do jogador atacar!");
                        jogador.atacarOponente(oponente, scanner);
                        if (!oponente.estaVivo()) {
                            System.out.println(oponente.nome + " foi derrotado! " + jogador.nome + " venceu! \n");
                            break;
                        }

                        System.out.println("Vez do oponente atacar!");
                        int danoOponente = 0;
                        danoOponente = (10 + oponente.ataque) - jogador.defesa;
                        jogador.hp -= danoOponente;
                        System.out.println(oponente.nome + " atacou " + jogador.nome + " causando " + danoOponente + " de dano.");
                        
                        if (!jogador.estaVivo()) {
                            System.out.println(jogador.nome + " foi derrotado! " + oponente.nome + " venceu! \n");
                            break;
                        }
                    }
                    
                    break;

                case 2:
                    jogador.exibirPokemon();
                    
                    break;
                    
                case 0:
                    System.out.println("Saindo do Jogo...");
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	    
}