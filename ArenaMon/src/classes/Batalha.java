package classes;

import java.util.Scanner;

//Criando a classe Batalha de herda de Pokemon

public class Batalha extends Pokemon {
	
	 public Batalha(String nome, String tipo, int hp, int ataque, int defesa) {
	        super(nome, tipo, hp, ataque, defesa);
	    }
	    // Desenvolvendo o método para atacar o oponente
	    void atacarOponente(Pokemon oponente, Scanner scanner) {
	        int escolha; //Primeiro, um scanner para escolher entre os quatro ataques
	        do { 
	            System.out.println("Escolha um ataque para " + nome + ":");
	            System.out.println("1 - Ataque 1");
	            System.out.println("2 - Ataque 2");
	            System.out.println("3 - Ataque 3");
	            System.out.println("4 - Ataque 4");
	            
	            while (!scanner.hasNextInt()) { // enquanto a entrada não for um numero inteiro
	                System.out.println("Entrada inválida. Digite um número entre 1 e 4.");
	                scanner.next(); 
	            }
	            escolha = scanner.nextInt(); // lê o numero digitado pelo usuário e armazena em 'escolha'
	        } while (escolha < 1 || escolha > 4); // verifica se o valor de 'escolha' está dentro do que foi permitido (1 a 4)

	        int dano = 0; // o dano começa em 0.
	        
	        switch (escolha) { // switch para os casos de cada ataque.
	        
	            case 1:
	                System.out.println("Ataque 1 em curso.");
	                dano = (10 + ataque) - oponente.defesa; // calculo do dano
	                oponente.hp -= dano; // HP do oponente diminui conforme o valor do dano
	                System.out.println(nome + " atacou " + oponente.nome + " causando " + dano + " de dano \n");
	                
	                break;
	                // Mesma coisa nos outros casos, mudando apenas o valor do dano
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
	                
	                default:
	                	System.out.println("Opção inválida! Tente de novo.");
	        }
	    }
	    // Método da classe Batalha para caso o usuário queira trocar o Pokemon
	    public Pokemon trocarPokemon(Scanner scanner) {
	    	System.out.println("Escolha o seu novo Pokémon:");
	        System.out.println("1 - Pikachu");
	        System.out.println("2 - Charmander");
	        System.out.println("3 - Bulbasaur");
	        System.out.println("4 - Squirtle");
	        
	        int choosePokemon;
	        Pokemon novoPokemon = null;
	        
	        while(novoPokemon == null) {  // enquanto 'novoPokemon' for nulo, o loop continuará executando
	        	while(!scanner.hasNextInt()) {
	        		System.out.println("Entrada inválida! Digite um número entre 1 e 4");
	        		scanner.next();
	        	}
	        	
	        	choosePokemon = scanner.nextInt();
	        	
	        	switch(choosePokemon) {
	        
	        	case 1:
	        		novoPokemon = new Batalha("Pikachu", "Elétrico", 100, 50, 30);
	        		break;
	        		
	        	case 2:
	        		novoPokemon = new Batalha("Charmander", "Fogo", 90, 60, 25);
	        		break;
	        		
	        	case 3:
	        		novoPokemon = new Batalha("Bulbasaur", "Planta", 95, 55, 35);
	        		break;
	        		
	        	case 4:
	        		novoPokemon = new Batalha("Squirtle", "Água", 100, 45, 40);
	        		break;
	        		
	        		default:
	        			System.out.println("Erro! Opção inválida.");
	        	}
	        }
			return novoPokemon;
	        

	    }
	    // Começando a batalha
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Instanciano a classe Batalha
	        Pokemon pikachu = new Batalha("Pikachu", "Elétrico", 100, 50, 30);
	        Pokemon charmander = new Batalha("Charmander", "Fogo", 90, 60, 25);
	        Pokemon bulbasaur = new Batalha("Bulbasaur", "Planta", 95, 55, 35);
	        Pokemon squirtle = new Batalha("Squirtle", "Água", 100, 45, 40);
	        
	        System.out.println("ArenaMon - Batalha de Pokemons"); // Começo do jogo
	        System.out.println("Escolha o seu Pokemon:"); // Escolher o seu Pokemon logo de cara
	        System.out.println("1 - Pikachu");
	        System.out.println("2 - Charmander");
	        System.out.println("3 - Bulbasaur");
	        System.out.println("4 - Squirtle");
	        
	        int escolhaPokemon;
	        Pokemon jogador = null;
	        
	        while (jogador == null) { // enquanto o 'jogador' for nulo, o loop vai continuar
	        	while(!scanner.hasNextInt()) {
	        		System.out.println("Entrada inválida. Digite um número entre 1 e 4.");
	        		scanner.next();
	        	}
	        
	        	escolhaPokemon = scanner.nextInt();
	        	
	        	switch(escolhaPokemon) {
	        	// swicth para os quatro casos:
	        	case 1: // se a entrada for igual a 1, o Pokemon será um Pikachu
	        		jogador = pikachu;
	        		break;
	        		
	        	case 2:
	        		jogador = charmander;
	        		break;
	        		
	        	case 3:
	        		jogador = bulbasaur;
	        		break;
	        		
	        	case 4:
	        		jogador = squirtle;
	        		break;
	        		
	        		default:
	        			System.out.println("Opção inválida! Tente novamente.");
	        		
	        	}
	        }
	        
	        Pokemon oponente = new Batalha("Charmander", "Fogo", 90, 60, 25); // oponente aleatório
	        
	        int opcao;
	        
	        do {
	            System.out.println("ArenaMon - Batalha de Pokémons");
	            System.out.println("1 - Iniciar Batalha");
	            System.out.println("2 - Vizualizar Pokémon");
	            System.out.println("3 - Trocar de Pokemon");
	            System.out.println("0 - Sair");
	            
	            while (!scanner.hasNextInt()) { // só vai aceitar um número inteiro
	            	System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
	            }
	            
	            opcao = scanner.nextInt();

                switch (opcao) {
                
                case 1:
                    System.out.println("Que comece a batalha!");

                    while (jogador.estaVivo() && oponente.estaVivo()) { // enquanto ambos os Pokemons estiverem vivos, o turno vai rodar, usamos aqui o método da classe Pokemon estaVivo();
                        System.out.println("Vez do jogador atacar!");
                        jogador.atacarOponente(oponente, scanner);//Usando o método de atacarOponente();
                        if (!oponente.estaVivo()) { // Se o oponente estiver morto, o jogador ganhou.
                            System.out.println(oponente.nome + " foi derrotado! " + jogador.nome + " venceu! \n");
                            break;
                        }

                        System.out.println("Vez do oponente atacar!");
                        int danoOponente = 0; //aqui é o calculo do dano que o oponente vai causar no jogador(mesma coisa do cálculo do dano do jogador)
                        danoOponente = (10 + oponente.ataque) - jogador.defesa;
                        jogador.hp -= danoOponente;
                        System.out.println(oponente.nome + " atacou " + jogador.nome + " causando " + danoOponente + " de dano. \n");
                        
                        if (!jogador.estaVivo()) { //se o jogador estiver morto, o oponente venceu.
                            System.out.println(jogador.nome + " foi derrotado! " + oponente.nome + " venceu! \n");
                            break;
                        }
                    }
                    
                    break;

                case 2: // caso o jogador queira checar os atributos do seu Pokemon, chamamos o método da classe Pokemon
                    jogador.exibirPokemon();
                    
                    break;
                    
                case 3: // caso o jogador queira trocar de Pokemon, chamamos o método da classe Batalha criado lá em cima.
                     jogador = ((Batalha) jogador).trocarPokemon(scanner);
                     
                     break;
                    
                case 0: // caso o jogador queuira sair do jogo
                    System.out.println("Saindo do Jogo...");
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 0); // equanto a opção for diferente de 0, o loop vai continuar.

	        scanner.close();
	    }
	    
}
