package Collections;

import java.util.*;



public class CollectionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList		
		 1.Implementation: List interface
		 2.Memory consumption: ArrayList stores the element’s value alone and 
		 internally maintains the indexes for each element.
		 3.Order :  ArrayList returns the list items in the same order in 
		 which they got inserted into the list.
		 4.Duplicates : Allows duplicate elements
		 (It does allow duplicate values).
		 5.	Nulls : HashMap allows number of null elements.
		 6) get method:	In ArrayList we can get the element by specifying the index of i
		*/
		List a1 = new ArrayList();
		a1.add("ZARA");
		a1.add("Mahanz");
		a1.add("Ayan");
		System.out.println("Array Elements");
		System.out.println("\t"+a1);
		
		Iterator a1_itr = a1.iterator();
		while(a1_itr.hasNext()){
			Object element = a1_itr.next();
			System.out.print(element+" ");
		}
		
		
		//Linked List
		/* Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
		 * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
		 * LinkedList is better for manipulating data.
		 */
		List l1= new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println("\n\n LinkedList Elements");
		System.out.println("\t"+l1);
		
		Iterator l1_itr = a1.iterator();
		while(l1_itr.hasNext()){
			Object element = l1_itr.next();
			System.out.print(element+" ");
		}
		
		//hashSet
		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahanz");
		s1.add("Ayan");
		System.out.println();
		System.out.println("\n\nset Elements");
		System.out.println("\t"+s1);
		
		
		Iterator s1_itr = a1.iterator();
		while(s1_itr.hasNext()){
			Object element = s1_itr.next();
			System.out.print(element+" ");
		}
		
		/*HashMap
		 *  1.Implementation: Map interface
		 * 	2.Memory consumption: HashMap stores key & value pair.
		 *	For each value there must be a key associated in HashMap. 
		 *	That clearly shows that memory consumption is high in HashMap 
		 * compared to the ArrayList.
		 *	3.Order :  HashMap doesn’t have insertion order
		 *	4.Duplicates :  HashMap doesn’t allow duplicate keys 
		 * (It does allow duplicate values).
		 *	5.Nulls : HashMap allows one null key and any number of null values.
		 *	6) get method:	In HashMap the elements is being fetched by specifying the corresponding key.
		*/	
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahanz", "31");
		m1.put("Mahanz_duplicate", "31");
		m1.put("Ayan", "12");
		System.out.println();
		System.out.println("\n\nMap elements");
		System.out.println("\t"+m1);
		
		Iterator m1_itr = a1.iterator();
		while(m1_itr.hasNext()){
			Object element = m1_itr.next();
			System.out.print(element+" ");
		}
	}

}
