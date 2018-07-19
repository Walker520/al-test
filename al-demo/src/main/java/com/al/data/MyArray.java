package com.al.data;

import java.util.Random;

/**
 * 重写数组  
 * 1.含有属性： 定义一个数组、数组实际长度、数组最大长度。
 * 2.含有方法   1构造函数   无参：设置默认数组大小，只需定义一个最大的数组长度
 * @author AiLi
 *
 */
public class MyArray {
	private int [] arr;   	//定义一个数组
	private int elems;		//数组实际长度
	private int length;	//数组最大长度
	
	/**
	 * 无参构造  默认数组大小50
	 */
	public MyArray(){
		this.elems = 0;
		this.length = 50;
		this.arr = new int[length];
	}
	
	/**
	 * 自定义大小为length的数组
	 * @param length
	 */
	public MyArray(int length){
		this.elems = 0;
		this.length = length;
		this.arr = new int[length];
	}
	
	public int[] getArr() {
		return arr;
	}
	
	public void setArr(int[] arr){
		this.arr = arr;
	}
	
	public int getSize(){
		return elems;
	}
	
	public void display(){
		for (int i = 0; i < elems; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
	public void add(int value){
		if(elems<length){
			arr[elems] = value;
			elems++;
		}else{
			System.out.println("满啦，再加就越界咯！");
		}
	}
	
	/**
	 * 返回查找元素的下标
	 * @param value
	 * @return
	 */
	public int find(int value){
		for (int i = 0; i < elems; i++) {
			if (value == arr[i]){
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean delete(int value){
		int index = find(value);
		if(index != -1){
			if(index == elems-1){
				elems--;
			}else{
				for (int i = index; i < elems-1; i++) {
					arr[i] = arr[i+1];
				}
				elems--;
			}
			 return true;
		}else{
			return false;
		}
	}
	
	public boolean update(int oldValue,int newValue){
		int index = find(oldValue);
		if (index != -1){
			arr[index] = newValue;
			return true;
		}else{
			 System.out.println("需要修改的数据不存在");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyArray arr = new MyArray(5);
			//1.测试添加
			arr.add(5);
			arr.add(1);
			arr.add(4);
			arr.add(8);
			arr.add(9);
			arr.display();
			
			arr.delete(2);
			arr.update(1, 2);
			arr.display();
			arr.delete(2);
			arr.display();
	}

}
