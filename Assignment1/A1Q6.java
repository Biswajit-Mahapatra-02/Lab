import java.util.Arrays;
public class A1Q6 {
	public static void main(String args[]) {
		int arr[]= {5,2,1,4,3};
		System.out.println(withoutMethodMax(arr));
		System.out.println(withoutMethodMin(arr));
		System.out.println(withMethodMax(arr));
		System.out.println(withMethodMin(arr));
	}
	
	static int withoutMethodMax(int arr[]) {
		 int max = arr[0];
		 for(int i = 0;i<arr.length;i++) 
			 if(arr[i]>max)
				 max = arr[i];
		 return max;
	}
	static int withoutMethodMin(int arr[]) {
		int min = arr[0];
		for(int i = 1;i<arr.length;i++) 
			if(arr[i]<min)
				min = arr[i];
		return min;
   }
	static int withMethodMax(int arr[]) {
		return Arrays.stream(arr).max().getAsInt();
	}
	static int withMethodMin(int arr[]) {
		return Arrays.stream(arr).min().getAsInt();
	}
}
