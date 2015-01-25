//Please refer to the following link for reference
// https://www.hackerrank.com/challenges/find-digits

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		long num, temp;
		int divisor, count;
		for(int i=0;i<T;i++){
			num = sc.nextLong();
			temp = num;
			count = 0;
			while(num>0){
				divisor = (int) (num%10);
				if(divisor>0 && temp%divisor == 0)
					count++;
				num = num/10;
			}
			System.out.println(count);
		}

	}

}
