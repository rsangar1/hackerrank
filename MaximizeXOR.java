//Please refer to following link for problem statement.
// https://www.hackerrank.com/challenges/maximizing-xor

import java.util.Scanner;

public class MaximizeXOR {
	static int maxXor(int l, int r) {
		int maximum = 0;
		for(int i=l;i<=r;i++){
			for(int j=i+1;j<=r;j++){
				if((i^j)>maximum){
					maximum = i^j;
				}
			}
		}
		return maximum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
    }
}
