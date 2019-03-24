package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java_streams1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(35);
		al.add(25);
		al.add(80);
		al.add(73);
		al.add(33);
		al.add(20);
		al.add(50);
		al.add(60);
		System.out.println(al);
		
		//Method1
		List<Integer> oColl = al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(oColl);
		//OR
		//Method 2
		List<Integer> list1 = al.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list1);
		//OR
		//Method 3
		List<Integer> list2 = al.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
