package stap2;

import java.util.Scanner;

public class Main2_3 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			
	if((A % 4 == 0 && A % 100 == 1) || A % 400 == 0) {
			System.out.println("1");			
		}else if(A % 4 == 0 && A % 400 == 0) {
			System.out.println("0");
		}else {
			System.out.println("0");
		}
			
		}
	}

		

