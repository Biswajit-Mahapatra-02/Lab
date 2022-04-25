// Write a Java method that takes an array of int values and determines if there is a pair of distinct elements of the array whose product is odd.
import java.util.*;
public class A1Q7{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("How many numbers you would like to input?: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    Vector<Integer> uniqueNums = new Vector<Integer>(5);
    int count = 0;
	for (int i = 0; i < n; i++, count = 0)
		arr[i]=sc.nextInt();
    for (int i = 0; i < n; i++, count = 0){
      int temp = arr[i];
      boolean isUnique = true;
      for(int j = 0; j < n ; j++){
        if(arr[j]==temp)
          count++;
      }
      if(count==1)
        System.out.println(temp+" is unique");
	uniqueNums.add(temp);
  		}
	System.out.println(uniqueNums);
	}
	for(int i = 0; i < uniqueNums.size(); i++){
		for(int j = 0; j < uniqueNums.size(); j++){
			if(uniqueNums.get(i) == uniqueNums(j)){
				
			}
		}
	}
}
