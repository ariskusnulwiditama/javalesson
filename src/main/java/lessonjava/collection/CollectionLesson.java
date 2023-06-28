package lessonjava.collection;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionLesson {
	public static void main(String[] args) {
		Collection<String> names = List.of("koko","kiki","popo");
		List<String> jobs = new ArrayList<>();
		jobs.add("developer");
		jobs.add("chef");
		jobs.add("driver");

		jobs.forEach(System.out::println);

		for(String val: names) {
			System.out.println(val);
		}
		List<String> search = new ArrayList<>();
		search.add("kiki");

		System.out.println(names.containsAll(search));
	}
}
