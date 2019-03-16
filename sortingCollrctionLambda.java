package Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortingCollrctionLambda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(35);
		al.add(25);
		al.add(80);
		al.add(73);
		al.add(33);
		al.add(21);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		//Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		System.out.println(al);
	}

}
