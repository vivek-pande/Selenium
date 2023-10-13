package stramsAndlamda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("vivek");
		arr.add("avinash");
		arr.add("sujeet");
		arr.add("ajeet");
		arr.add("afsana");

		int count = 0;
		for (String name : arr) {
			if (name.startsWith("a")) {
				count++;
			}

		}
		System.out.println(count);
		/// by Streams

		System.out.println(arr.stream().filter(x -> x.startsWith("a")).count());
		
		long z=Stream.of("vivek","sujeet","rahul","ravi","akash","kamesh").filter(f->f.startsWith("r")).count();
		System.out.println(z);
		
		long v=Stream.of("vivek","sujeet","rahul","ravi","akash","kamesh").filter(f->{
			f.startsWith("r");
			return false;
			}).count();
		
		System.out.println(v);
		
		//filtering on the bases of length
//		arr.stream().filter(x->x.length()>5).forEach(y->System.out.println(y));
		// filtering on the bases of length and limit it to 1 result
//		arr.stream().filter(x->x.length()>4).limit(1).forEach(y->System.out.println(y));
		
		//map
		
		//filtering on the bases of length and converting it to upper case using map
//		arr.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s)); 
		
		//filtering on the bases of first letter and sorting it to alphabetical order and converting it to upper case
		arr.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	}

}
