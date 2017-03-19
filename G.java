import java.io.*;
import java.util.*;

public class G {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Treasure[] t = new Treasure[num];
		for (int i = 0; i < num; i++) {
			t[i] = new Treasure(in.nextInt(), in.nextInt());
		}
		Arrays.sort(t);
		int[] print = new int[num];
		int maxVal = t[num-1].val;
		for (int i = num - 1; i >= 0; i--) {
			if (t[i].val == maxVal) print[i] = t[i].index;
			else break;
		}
		Arrays.sort(print);
		for (int i = 0; i < num; i++) {
			if (print[i] > 0) System.out.println(print[i]);
		}
		
	}

}

class Treasure implements Comparable<Treasure> {
	int index, val;
	public Treasure(int start, int end) {
		this.index = start;
		this.val = end;
	}
	public int compareTo(Treasure other) {
		return this.val - other.val;
	}
	public int compare(Treasure other) {
		return this.index - other.index;
	}
}