package leet_code_easy.buy_sell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// In progress
public class BuySell {
	
	


	public static void main(String[] args) {
		int[] a = {7,1,5,3,6,4};
		List<Integer> list = new ArrayList<Integer>();
//		int temp =0;
		
		for(int i=0; i<a.length;i++) {
			int temp = 0;
			for(int j=i+1; j<a.length;j++) {
				if(a[j]-a[i]>temp) {
					temp = a[j]-a[i];
					}	
			}
			list.add(temp);
			System.out.println("temp = " + temp);
		}
		
		Collections.sort(list);
		int size = list.size();
		
		System.out.println("List = " + list);
		System.out.println(list.get(size-1) - list.get(0));

	}

}
