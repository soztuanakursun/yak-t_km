package kilometre;

import java.util.Scanner;



public class main {
	public static void main (String[]args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Kilometrede ne kadar yaktýðýný giriniz");
	int yakýt=scanner.nextInt();
	System.out.println("Kaç kilometre gittiðini giriniz");
	int yol=scanner.nextInt();
	System.out.println("toplam tutar:" + (yakýt * yol));
	}
	
}
