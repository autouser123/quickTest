package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return (i1>i2)?-1:(i1<i2)?+1:0;
	}
	
}

public class sortingCollrctionwithOutLambda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(33);
		al.add(25);
		al.add(80);
		al.add(73);
		al.add(33);
		al.add(20);
		System.out.println(al);
			
		Collections.sort(al,new myComparator() );
		System.out.println(al);
	}

}
