package com.ph.desafiodio.main;

import java.util.Scanner;

import com.ph.desafiodio.exceptions.ParametrosInvalidos;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = Integer.valueOf(scanner.next());
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = Integer.valueOf(scanner.next());
			
			contar(parametroUm, parametroDois);
			
		} catch (NumberFormatException e) {
			System.out.println("Parâmetro informado não é numérico.");
		} catch (ParametrosInvalidos e) {
			System.out.println("Primeiro parâmetro deve ser MENOR que o segundo.");
		} finally {
			scanner.close();
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidos();
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i );
		}
	}

}
