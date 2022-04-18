package Assignment1;
import java.util.Arrays;
public class Q6 {
	public static void main(String args[]) {
		int arr[]= {5,2,1,4,3};
		System.out.println(withoutMethodMax(arr));
		System.out.println(withMethodMax(arr));
	}
	
	static int withoutMethodMax(int arr[]) {
		 int max = 0;
		 for(int i = 0;i<arr.length;i++) 
			 if(arr[i]>max)
				 max = arr[i];
		 return max;
	}
	static int withMethodMax(int arr[]) {
		return Arrays.stream(arr).max().getAsInt();
	}
}