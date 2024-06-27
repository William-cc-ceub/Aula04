package Estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		fila.offer(44);
		fila.offer(66);
		fila.offer(88);
		
		Integer primeiroRetorno = fila.poll();
		Integer segundoRetorno = fila.poll();
		Integer terceiroRetorno = fila.poll();

		
		System.out.println("Primeiro: " + primeiroRetorno);
		System.out.println("Segundo: " + segundoRetorno);
		System.out.println("Terceiro: " + terceiroRetorno);

	}


}
