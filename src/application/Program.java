package application;

import java.util.Scanner;

import entities.Seat;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Seat[] seatsVect = new Seat[42];
		
		int aux = 0;
		int pos = 0;
		for (int i = 0; i < seatsVect.length; i++) {			
			if (aux <= 4) {
				pos = i + 1;
				if (aux == 2) {
					pos = i + 2;
					System.out.print(" ");
				}
				if (aux == 3) {
					pos = i;
				}				
				if (aux == 4) {
					aux = 0;
					System.out.println();
				}
			}
			System.out.printf("[%02d]", pos);
			aux++;
		}

		sc.close();
    }    
}
