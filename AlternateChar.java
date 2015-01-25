import java.util.Scanner;

public class AlternateChar {
	public static void main(String ar[]){
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int count;
		while(T!=0){
			count = 0;
			String str = scanner.next();
			for(int i=0;i<str.length()-1;i++){
				if(str.charAt(i)==str.charAt(i+1))
					count++;
			}
			System.out.println(count);
			T--;
		}
	}
}
