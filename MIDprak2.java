import java.util.Scanner;

public class MIDprak2 {
	public static void main(String args[]) {
	Double  hasil;
	int sisi;
	
	Scanner input = new Scanner(System.in);
	
	
	luaspersegi rumus = new luaspersegi();
	
	
		
	System.out.println("Buatlah Aplikasi polimorphisme untuk mencari luas Persegi");
	System.out.println();
	
	System.out.print("Silahkan Masukkan Sisi Persegi :  ");
	sisi = input.nextInt();
	System.out.println();
			
	rumus.setSisi(sisi);
	rumus.setLuasPersegi();
	System.out.println("Hasil luas persegi : " +  rumus.luaspersegi());


		
	}	
}