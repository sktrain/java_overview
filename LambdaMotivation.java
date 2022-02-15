package sk.train;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMotivation {

	public static void main(String[] args) {
		
		List<String> stringlist = Arrays.asList("Hugo", "otto", "Alfons", "Gabi");		
		
		for(int i = 0; i< stringlist.size(); ++i) {
			System.out.println(stringlist.get(i));
		}
		
		for (String s : stringlist) {
			System.out.println(s);
		}
		
		
		stringlist.forEach(System.out::println);  //(  string -> System.out.println(string) );
	}

}

//class MyConsumer implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//		
//	}
//	
//}
