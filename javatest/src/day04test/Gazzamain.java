package day04test;

import java.util.Scanner;

public class Gazzamain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
		
		do {
			System.out.println("sex");
			n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("n = 1");
				break;
			case 2:
				System.out.println("n = 2");
				break;
			case 0:
				System.out.println("n = 0");
				i++;
				break;
			}
		} while(i == 0);
		
		sc.close();
	}
}