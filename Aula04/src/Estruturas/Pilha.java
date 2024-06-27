package Estruturas;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		pilha.push("Primeiro item");
		pilha.push("Segundo item");
		pilha.push("Terceiro item");
		
		String primeiroRemovido = pilha.pop();
		String segudoRemovido = pilha.pop();
		String terceiroRemovido = pilha.pop();
		
		System.out.println(primeiroRemovido);
		System.out.println(segudoRemovido);
		System.out.println(terceiroRemovido);

	}

}
