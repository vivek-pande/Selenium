package stramsAndlamda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Basic2 {

	public static void main(String[] args) {
		List<String> QA = Arrays.asList("vivek", "sujeet", "ankit", "pooja", "dharmendar", "harsh", "harshit",
				"uddhav");
		List<String> DEV = Arrays.asList("akshay", "vikas", "anuj", "biswajit", "peehu", "sandip");

		// merging two string and sorting two
		Stream<String> platform = Stream.concat(QA.stream(), DEV.stream());
//		platform.sorted().forEach(s->System.out.println(s));
		Boolean flag = platform.anyMatch(s -> s.equalsIgnoreCase("vivek"));
		System.out.println(flag);
		Assert.assertTrue(flag);

		// collect
		List<String> SQA = QA.stream().filter(s -> s.startsWith("h")).sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(SQA.get(0));
		
		
		List<Integer> number = Arrays.asList(1,6,3,5,5,8,3,8,9,4,7,4,2,7,8);
//		number.stream().distinct().forEach(s->System.out.println(s));
//		number.stream().sorted().distinct().limit(5).forEach(s->System.out.println(s));
		
		List<Integer>filteredNumber =number.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(filteredNumber.get(3));
		
				
		
	}

}
