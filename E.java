import java.util.*;

public class E {

	public static void main(String[] args) throws Exception{
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		//int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			//sum += arr[i];
		}
		/*int prof = (int) ((sum)/ 2.0) + 1;
		Arrays.sort(arr);
		int ind = n - 1;
		int num = 0;
		sum = 0;
		while (sum < prof) {
			sum += arr[ind];
			ind--;
			num++;
		}
		System.out.println(num);
		*/
		
	}

}



#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;
	int arr[n];
	int sum = 0;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
		sum += arr[i];
	}
	
	sort(arr, arr + n);
	int num = 0;
	int ind = n - 1;
	int prof = (int) ((sum)/ 2.0) + 1;
	sum = 0;
	
	while (sum < prof) {
		num++;
		sum += arr[ind];
		ind--;
	}
	
	cout << num;
	return 0;
	
}