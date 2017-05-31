package scjp.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	
	public static void main(String[] args){
		List<String> li = new ArrayList<String>();
		List<Integer> le = new ArrayList<Integer>();
		List<String> ll1 = new LinkedList<String>();
		ll1.add("ABC");
		ll1.add("DEF");
		ll1.add("GHI");
		
		ListIterator<String> listIte=  ll1.listIterator();		
		listIte.add("HSrikanth");
		listIte.add("KSrikanth");
		while(listIte.hasNext()){
			//System.out.println(listIte.previous());
			String sri = listIte.next();
			
			System.out.println(sri);
			}
		System.out.println(ll1);
		List lt = new ArrayList();
		li.add("Srikanth");
		li.add("Srilakshmi");
		li.add("Test1");
		le.add(1);
		le.add(2);
		le.add(12);
		le.add(10);
		le.add(10);
		le.remove(new Integer(2));
		lt.addAll(li);
		lt.addAll(le);
		lt.addAll(0, le);
		lt.add("New String");
		System.out.println(lt);
		System.out.println(lt.size());
		li.set(0, "Srilakshmi");
		System.out.println(li.get(2));		
		Iterator<String> ite = li.iterator();
		
		while(ite.hasNext()){
			String str = ite.next();
			if(li.contains("Srikanth")){
				ite.remove();				
				System.out.println("Success");
			}
			System.out.println(str);
			}
		li.add("New Srikanth");
		System.out.println(li);
		for(Integer i:le){
			
			if(le.contains(10)){
				
				int ind = le.indexOf(10);
				le.set(ind, 13);
								
			}
			
			System.out.println(i);
		}
	    for(Object o:lt ){
	    	System.out.println(o);
	    }
	}

}
