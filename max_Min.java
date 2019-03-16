package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class max_Min {

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
		
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);

	}

}
