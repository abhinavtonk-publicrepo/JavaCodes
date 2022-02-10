package leet_code_hard.smallest_positive_number;

import java.util.Arrays;
//Given an unsorted integer array nums, return the smallest missing positive integer.
//You must implement an algorithm that runs in O(n) time and uses constant extra space.

//Logic=> Sort the array, Find first positive number
public class SmallestPositiveNumber {

	public static void main(String[] args) {
		int[] a = {-1,1,2,3,4}; //{3,4,-1,1}=>2 ; {1,2,0}=>3 ; {7,8,9,11,12}=>1
		int smallestPositiveInArray = 0, indexOf1=0;
		
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<=0) {// Continue till the numbers in the array are negative
				continue;
			}
			else if(a[i]>1) {// If first positive number is greater than 1 then smallestPositiveInArray=1
				smallestPositiveInArray = 1;
				System.out.println("smallest = " + smallestPositiveInArray);
				System.exit(0);			
			}
			else {// when a[i]=1 (when 1st positive number is 1 then capture it's index for further checks)
				indexOf1 = i;
				break;
			}
		}
		
			for(int i=indexOf1+1,j=2; i<a.length;i++,j++) {
				if(a[i]==j) {
					if(i==a.length-1) {// If we reach till the last element of array
						smallestPositiveInArray= a[i] + 1;
						break;
					}else { // else we continue till there is sudden break in incremental value of array
						continue;
					}					
				}
				else {
					smallestPositiveInArray = a[i-1]+1; // As soon as there is break in linear incremental value
					break;
				}
			}			
			System.out.println("smallest = " + smallestPositiveInArray);
	}
}
