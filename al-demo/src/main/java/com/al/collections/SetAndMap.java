package com.al.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class SetAndMap {
		
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		Random random = new Random();
		//1.添加  遍历
		a.add(3);
		a.add(5);
		a.add(3);
		a.add(null);
		for (Integer integer : a) {
			System.out.println(integer);
		}
		//2.查询 删除
		a.remove(3);
		Iterator<Integer> aa = a.iterator();
		while(aa.hasNext()) {
			System.out.println(aa.next());
		}
		System.out.println();
		
		HashMap<String, Object> b = new HashMap<String, Object>();
		b.put("1", 1);
		b.put("2", "value2");
		b.put("3", 3.0);
		//遍历1
		Set<String> c = b.keySet();
		for (String string : c) {
			System.out.println("key="+string+",value="+b.get(string));
		}
		System.out.println();
		
		//遍历2
		for (Entry<String, Object> bb : b.entrySet()) {
			System.out.println(bb.getKey()+"，"+bb.getValue());
		}
	}
}
