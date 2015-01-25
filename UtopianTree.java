// Please refer to the following link for problem statement.
// https://www.hackerrank.com/challenges/utopian-tree

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int height;
		while(T!=0){
			int test = scanner.nextInt();
			int count = 0;
			height = 1;
			while(test!=0){
				count++;
				if(count%2!=0)
					height*=2;
				else
					height+=1;
				test--;
			}
			System.out.println(height);
			T--;
		}

	}
}
