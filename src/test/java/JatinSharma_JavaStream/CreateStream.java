package JatinSharma_JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to create a stream
		
		List<String> names = Arrays.asList("alice","bob");
		//1. List-> Stream
		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
		//2. Array- Stream
		
		String[] arr= {"Java","Python","C++","c#"};
		
		Stream<String> stream2= Arrays.stream(arr);
		stream2.forEach(System.out::println);
		//3. Stream of
		
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
		integerStream.forEach(System.out::println);
		//4. Stream generator
		
		Stream<Double> limit = Stream.generate(Math::random).limit(1);
		limit.forEach(System.out::println);
	}

}
