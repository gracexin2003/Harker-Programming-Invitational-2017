import java.io.*;
import java.util.*;

public class D {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double max = -999999999;
		int ind = 1;
		for (int i = 1; i <= num; i++) {
			double cur = in.nextInt()/(double) in.nextInt();
			if (cur > max) {
				max = cur;
				ind = i;
			}
		}
		System.out.println(ind);
		
	}

}