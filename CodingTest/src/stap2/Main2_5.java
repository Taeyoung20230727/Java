package stap2;

import java.util.Scanner;

public class Main2_5 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int H = sc.nextInt();
			int M = sc.nextInt();
			
			if(H >= 0 && H <= 23 && M >= 0 && M <= 59) {
				
				 
				 if(M>=45) {
					 M = M-45;
				 } else{
					 if (H==0) { 
					 H = 23;
				 }else {
					 H = H - 1;
				 }
					 M = 60-(45-M);
				 }
				 
				 System.out.print(H+" "+M);
		}
	}
}
