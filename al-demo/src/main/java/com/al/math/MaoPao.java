package com.al.math;

import com.al.data.MyArray;

/**
 * 冒泡排序
 * @author AiLi
 *
 */
public class MaoPao {
		
	
	public static void main(String[] args) {
		MyArray arr = new MyArray(7);
		arr.add(2);
		arr.add(7);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(6);
		arr.add(5);
		
		int[] a = arr.getArr();
		arr.display();
		//升序
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if ( a[j] > a[j+1] ){
					int z = a[j];
					a[j] = a[j+1];
					a[j+1] = z;
				}
			}
		}
		
		arr.setArr(a);
		arr.display();
	}
}
