
/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


*/
import java.util.*;
public class Bigdiff {

	
	public int bigDiff(int[] nums) {
	  int max=-999;
	  int min=3444;
	  for(int i=0;i<nums.length;i++){
	    max=Math.max(max,nums[i]);
	    min=Math.min(min,nums[i]);
	  }
	  return max-min;
	}

	public static void main(String[] args) {
		Bigdiff l1=new Bigdiff(); 
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int result=l1.bigDiff(arr);
		System.out.println(result);
	
	}
}
