package classes;

import java.util.Scanner;

// Criando a classe abstrata de Pokemon com os seus atributos e métodos:
abstract class Pokemon {
	protected String nome;
	protected String tipo;
	protected int hp;
	protected int ataque;
	protected int defesa;
	
	public Pokemon(String nome, String tipo, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.tipo = tipo;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public void exibirPokemon() { // Método para exibir as informações do Pokemon
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("HP: " + hp);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defesa: " + defesa);
	}
	
	abstract void atacarOponente(Pokemon oponente, Scanner scanner); // Método abstrato para atacar o oponente

	public boolean estaVivo() { // Método para checar se o Pokemon está vivo, crucial na batalha.
		return hp > 0;
	}
	
}
