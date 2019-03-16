package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(35);
		al.add(25);
		al.add(80);
		al.add(73);
		al.add(33);
		al.add(20);
		System.out.println(al);
		
		Integer[] i = al.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);

	}

}
