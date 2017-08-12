package com.hand.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
	/***
	*@author  gdp 
	*@date    2017年8月12日 上午11:02:33
	*/
	public static void main(String[] args) {
		//1--在List中存放50个小于100的整数
		List<Integer> zList=new ArrayList<>(); //存放50个整数的List
		int temp=0;	//临时存放所随机取得的整数的值
		System.out.print("随机生成50个小于100的数，分别为：");
		for (int i = 0; i < 50; i++) {
			temp=(int)(Math.random()*100);
			System.out.print(temp+",");
			zList.add(temp);
		}
		System.out.println();
		
		
		//2-在Map中按key值存入value
		Map<Integer,ArrayList<Integer>> map=new HashMap<>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> aList=new ArrayList<>();
			for (int j = 0; j < zList.size(); j++) {
				if(zList.get(j)/10==i){
					aList.add(zList.get(j));
				}
			}
			map.put(i, aList);
		}
		System.out.println("Map中的数据为："+map);
		
		map.put(100, new ArrayList<Integer>());
		
		
		
		
		
	}
}
