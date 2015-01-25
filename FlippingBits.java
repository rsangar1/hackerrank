//This program print the value by flipping the each bit. Please refer to following link for problem statement
//Problem statement : https://www.hackerrank.com/challenges/flipping-bits

import java.util.Scanner;

public class FlippingBits {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			Long input = sc.nextLong();
			String str = Long.toBinaryString(~input);
			str = str.substring(32);
			System.out.println(Long.parseLong(str, 2));
		}
	}
}
