// Please refer to the following link for problem statement
// https://www.hackerrank.com/challenges/is-fibo

import java.util.Scanner;

public class IsFibo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long temp, num;
		for(int i=0;i<T;i++){
			num = sc.nextLong();
			long n1 = 0;
			long n2 = 1;
			temp = 0;
			while(temp<num){
				temp = n1 + n2;
				n1 = n2;
				n2 = temp;
			}
			if(temp == num){
				System.out.println("IsFibo");
			}else
				System.out.println("IsNotFibo");
		}
	}
}
