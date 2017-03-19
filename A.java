import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			sum += num;
			if (num != 0) cnt++;
		}
		System.out.println((int) (sum / cnt + 0.5));
		
	}

}