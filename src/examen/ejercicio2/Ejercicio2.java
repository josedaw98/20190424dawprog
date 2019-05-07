package examen.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {

	private static BufferedReader kb = new BufferedReader(new InputStreamReader((System.in)));

	public static void main(String[] args) throws IOException {

		Scanner linea;
		System.out.print("> ");
		try {
			linea = new Scanner(kb.readLine());
			int n = linea.nextInt();
			int m = linea.nextInt();
			if (linea.hasNext()) {
				System.out.println("Sólo se esperaban dosº números en esta línea...");
				System.exit(-1);
			}
			Set<Integer> s1 = readSet(n);
			Set<Integer> s2 = readSet(m);
			Set<Integer> s3 = new HashSet<>();
			s3.addAll(s2);
			s3.removeAll(s1);
			System.out.println(s3);
		} catch (InputMismatchException e) {
			System.out.println("Se esperaba un número entero...");
			System.exit(-1);
		} catch (NoSuchElementException e) {
			System.out.println("Se esperaban dos números en esta línea...");
			System.exit(-1);
		}
	}

	private static Set<Integer> readSet(int n) throws IOException {
		Set<Integer> s = new HashSet<>();

		try {
			for (int i = 0; i < n; i++) {
				Scanner linea = new Scanner(kb.readLine());
				int num = linea.nextInt();
				if (linea.hasNext()) {
					System.out.println("Sólo se esperaba un número en esta línea...");
					System.exit(-1);
				}
				s.add(num);
			}
		} catch (InputMismatchException e) {
			System.out.println("Se esperaba un número entero...");
			System.exit(-1);
		} catch (NoSuchElementException e) {
			System.out.println("Se esperaba un número en esta línea...");
			System.exit(-1);
		}

		return s;
	}

}
