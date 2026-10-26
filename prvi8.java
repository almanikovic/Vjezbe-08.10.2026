package zadaci;

import java.util.Scanner;
import java.util.Random;


public class prvi8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//08.10
		//1.kreirati program koji ce kreirati novi niz,korisnik unosi duzinu niza a nakon toga
		//popuniti niz sa random vrijednostima i prikazati ga
		//izmijeniti svaku parni element niza da bude njegova suprotna vrijednost(-1*) a svaki neparni pretvoriti u njegovu inverznu vrijednost
		//(1/n)



		        Scanner sc = new Scanner(System.in);
                Random  rn = new Random();
		        System.out.print("Unesite broj clanova niza: ");
		        int n = sc.nextInt();

		        double[] niz = new double[n];
		
		        
		        for (int i = 0; i < n; i++) {
		            niz[i] = rn.nextInt();
		        }

		        for (int k = 0; k < n; k++) {
		            System.out.print(niz[k]);
		
		        }
		       
		        for (int i = 0; i < n; i++) {

		            if (niz[i] % 2 == 0) {
		                niz[i] = -1 * niz[i];
		            } else {
		                niz[i] = 1 / niz[i];
		            }
		        }

		        System.out.println("\n Izmijenjeni niz:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(niz[i] + " ");
		        }
		
		
		
		
		
		
	}

}
