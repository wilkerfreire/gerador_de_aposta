package application;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> numerosAposta = new TreeSet<>();
		
		
		System.out.print("Com quantos números você vai querer fazer sua aposta?  (6 a 20) ");
		int n = sc.nextInt();
		
		if (n >= 1 && n <= 20) {
			while (numerosAposta.size() != n) {
				numerosAposta.add(new Random().nextInt(1, 61));
			}
		}
		
		numerosAposta.forEach(x -> System.out.print(x + " "));
		
		sc.close();
	}

}
