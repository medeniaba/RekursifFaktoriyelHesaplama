import java.util.Scanner;
public class RekursifFaktoriyel {
	

	
	

	  public static int Faktoriyel ( int sayi ) {
		  
		  if(sayi >= 1 )
			  return sayi*Faktoriyel(sayi-1);
		  else 
			  return 1 ; 
	  }
	 
		
		
		public static void main(String[] args) {
		
		 	Scanner klavye = new Scanner(System.in);
		 	System.out.println("Bir sayı giriniz : ");
		 	int num = klavye.nextInt();
		 	System.out.println( num +"  Sayısının Faktöriyeli = \n "  + Faktoriyel((num)));

		}

	}


