package navidadPKg;

public class Navidad {
	public static void DibujameLaNavidad(int n) {
	 for (int x = 0; x < n; x++) { 
	        for (int y = 0; y < n-x ; y++) 
	        	System.out.print(" "); 
	        for (int z = 0; z < (2 * x + 1); z++) 
	        System.out.print("*"); 
	        System.out.println();
	 }
	 for(int l =0; l <n-1; l++) {
		 System.out.print(" ");
	 }System.out.println("|||");
	}
}
