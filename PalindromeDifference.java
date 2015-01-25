//Please refer to the following link for problem statement.
// https://www.hackerrank.com/challenges/the-love-letter-mystery

import java.util.Scanner;

public class PalindromeDifference {
	public static void main(String ar[]){
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int count;
		while(T!=0){
			count = 0;
			String str = scanner.next();
			String revStr = new StringBuffer(str).reverse().toString();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==revStr.charAt(i))
					continue;
				else{
					int diff = str.charAt(i)-revStr.charAt(i);
					if(diff<0)
						diff = -diff;
					count+=diff;
				}
			}
			System.out.println(count/2);
			T--;
		}
	}
}
