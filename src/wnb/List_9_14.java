package wnb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.sound.sampled.Line;

public class List_9_14 {
	public static void main(String [] args){
		List<Integer> l= new ArrayList<Integer>();
		List<Integer> ld=new ArrayList<Integer>();
		Random r= new Random();
		for(int i=0; i<10;i++)
		{
			l.add(i);
			ld.add(r.nextInt(100));
		}
			/*System.out.println(l);
			System.out.println(ld);
			l.get(0);
			System.out.println(l.get(1));
			//System.out.print(ld.spliterator());
			int st =ld.set(0, 99);
			System.out.println(st);
			System.out.println(ld);
			Collections.sort(l);
			Collections.sort(ld);
			System.out.println(l);
			System.out.println(ld);
			Collections.sort(ld,Collections.reverseOrder());
			System.out.println(ld);
			int max=Collections.max(ld);
			System.out.println(max);
			int min=Collections.min(l);
			System.out.println(min);
			l.remove(5);
			System.out.println(l);
			List <Integer> lk=new LinkedList<Integer>();
			lk.add(4);
			int s0=lk.size();
			System.out.println(s0);
			lk.addAll(l);
			System.out.println(lk);
			int s2=lk.size();
			System.out.println(s2);
			String[] books = {"java","c","c++","c#","asp"};
			for(String book : books)
			{
			System.out.print(book );
			System.out.print(" ");
			lk.removeAll(l);
			}
			System.out.println(lk);
			int s=lk.size();
			System.out.println(s);*/
	
	}

}
