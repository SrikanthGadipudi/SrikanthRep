package scjp.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListEx1 {
	
	
	public void setExample(){
		Set<String> set1 = new HashSet<String>();
		set1.add("Srikanth");
		set1.add("Srikanth");
		set1.add("Virtusa");
		set1.add("Alphabet");
		
		for(String sValue : set1){
			System.out.println("set values"+sValue);
		}
		SortedSet<String> set2 = new TreeSet<String>(set1);
		
		for(String sValue : set2){
			System.out.println("Tree Set Values"+sValue);
		}
		
	}
	public void mapExample(){
		Map<Integer,List<String>> m1 = new TreeMap<Integer, List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("Srikanth");
		l1.add("Abraham");
		l1.add("Virtusa");
		m1.put(2, l1);
		List<String> l2 = new ArrayList<String>();
		l2.add("Test No");
		l2.add("Test Name");
		l2.add("Test Desc");
		m1.put(1, l2);
		// iteration of keys
		System.out.println("Set Of Keys" +m1.keySet());
		for(Integer key : m1.keySet()){
			List<String> lValue = m1.get(key);
			for(String lit :lValue ){
				System.out.println("Values retrieving with key " + key + "  value  " + lit);
			}
		}
		// Iteration of values
		System.out.println("Collection Of Values" +m1.values());
		for(List<String> lit1 : m1.values()){
			for(String liv :lit1  ){
				System.out.println("List Of Values " + liv);
			}
		}
			
		//Iteration of entries
		System.out.println("Set Of Entries (Key Value Pair)" +m1.entrySet());
		for(Entry<Integer, List<String>> s1: m1.entrySet()){
			
			
			for(String kv : s1.getValue())
			{
				System.out.println("get Keys " +s1.getKey()+" get values "+kv);
			}
		}
		
		
		
		
	}
	public void listExample(){
		List<String> list1 = new ArrayList<String>();
		list1.add("Sri");
		list1.add("Laxmi");
		list1.add("Nayana");
		list1.add("Nani");
		list1.add("Sri");
		
		
		Set<String> se = new HashSet<String>(list1);
		
		for(String sValue : se){
			System.out.println("Set values"+sValue);
		}
				
				
				
				

		
		
/*		for(String value:list1){
			System.out.println(value);
		
		}*/
/*		Iterator<String> it=list1.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}*/
		List<Object> list2 = new ArrayList<Object>();
		list2.add("Polaris");
		list2.add(2);
		list2.add(list1);
		System.out.println(list2.get(0));
		System.out.println(list2.contains(2));
		
		
		for(Object listValue : list2)
		{
			int inde = list2.indexOf(listValue);
			if(inde==0)
			{
				String s1 = (String) listValue;
				System.out.println(s1);
			}
			else if(inde==1)	{
					Integer s1 = (Integer) listValue;
					System.out.println(s1);
			}
				else if(inde==2){
					List<String> s1 = (List<String>)listValue;
					Iterator<String> it = s1.iterator();
					while(it.hasNext()){
						String v1 = it.next();
						System.out.println("sub list values"+v1);
					}
					
					
			}
			}
	
			
					
			
		}
		
		
	

	public static void main(String[] args) {
		ListEx1 li = new ListEx1();
		//li.listExample();
		//li.setExample();
		li.mapExample();

	}

}
