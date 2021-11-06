import java.util.Scanner;

public class MIDprak1 {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	Scanner input = new Scanner(System.in);
	
	
	luaslingkaran rumus = new luaslingkaran();
	
	
		
	System.out.println("Buatlah Aplikasi polimorphisme untuk mencari luas lingkaran");
	System.out.println();
	
	System.out.print("Masukkan nilai jari-jari / r: ");
	jari = input.nextInt();
	System.out.println();
			
	rumus.setJari(jari);
	rumus.setluaslingkaran();
	System.out.println("Hasil luas lingkaran : " + String.format("%.2f",rumus.getluaslingkaran()));


		
	}	
}