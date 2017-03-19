import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int n = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int v = in.nextInt();
			if (v <= l) {
				sum += v;
			}
		}
		System.out.println(sum);
		
	}

}