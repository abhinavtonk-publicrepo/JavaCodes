package leet_code_easy.rotate_array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		int[] b = new int[a.length];
			
		for(int i=0;i<a.length-k;i++) {
			b[i+k] = a[i];
		}
		
		for (int i=a.length-k,j=0; i<a.length; i++,j++) {
//			b[j]=a[i]; 
			b[i-a.length+k] = a[i];
		}
		
		
		
		System.out.println(Arrays.toString(b));
	}

}
