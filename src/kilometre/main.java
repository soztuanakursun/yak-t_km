package kilometre;

import java.util.Scanner;



public class main {
	public static void main (String[]args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Kilometrede ne kadar yakt���n� giriniz");
	int yak�t=scanner.nextInt();
	System.out.println("Ka� kilometre gitti�ini giriniz");
	int yol=scanner.nextInt();
	System.out.println("toplam tutar:" + (yak�t * yol));
	}
	
}
