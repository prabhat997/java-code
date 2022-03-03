package git_repo;

import java.util.Scanner;

public class conditional {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();
        if(N % 2 == 0){
	        if((N >=2 && N <= 5) || (N > 20)){
	            System.out.println("Not Weird");
	        }
	        else if(N >= 6 && N <= 20){
	            System.out.println("Weird");
	        }   
         }
        else{
         System.out.println("Weird");
    }

    }
}
