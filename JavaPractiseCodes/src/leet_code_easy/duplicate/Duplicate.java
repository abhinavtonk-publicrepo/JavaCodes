package leet_code_easy.duplicate;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		boolean isDuplicate = false;
		int a[]= {1,2,1,3,4,1};
		//		int count=1;

		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
				isDuplicate= true;
				break;
			}else {
				map.put(i, 1);
			}
		}

		System.out.println(map);
		System.out.println(isDuplicate);


	}

}
