package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_tu;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main {
	
	
	public static void main(String[] args) {
		Map<String, Integer> mapStr = new TreeMap<String, Integer>();
		
		String str = "aaAaabcdebbbAccCd";
		//a:6
		//b:4
		//c:4
		//d:2
		//e: 1
		String strLower = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			String strItem = strLower.charAt(i) +"";
			boolean checkKey = mapStr.containsKey(strItem);
			
			if(checkKey) {
				int count  = mapStr.get(strItem);
				count++;
				mapStr.put(strItem,count);
			}else {
				mapStr.put(strItem, 1);
			}
		}
		
		Set<String> set = mapStr.keySet();
        for (Object key : set) {
            System.out.println(key + " " + mapStr.get(key));
        }
	}
}
