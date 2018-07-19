package com.al.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 此包存放java集合框架的demo
 * @author AiLi
 *
 */
public class App {
	public static void main(String[] args) {
		//我们这里将 ArrayList集合作为 Collection 的实现类
        Collection collection = new ArrayList();
        
        System.out.println(collection.hashCode());
        //添加元素
        collection.add("Tom");
        collection.add("Bob");
        System.out.println(collection.hashCode());
        System.out.println("Tom".hashCode());
        //删除指定元素
        collection.remove("Tom");
        
        //删除所有元素
        Collection c = new ArrayList();
        c.add("Bob");
        collection.removeAll(c);
        
        //检测是否存在某个元素
        collection.contains("Tom");
        
        //判断是否为空
        collection.isEmpty();
        
        //利用增强for循环遍历集合
        for(Object obj : collection){
            System.out.println(obj);
        }
        //利用迭代器 Iterator
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
	}
}
