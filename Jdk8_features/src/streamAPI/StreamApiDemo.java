package streamAPI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) throws IOException {

		
//===============================================================================================================
		//LIST CREATING WAYS
		
		List<String> mobile=new ArrayList<>();
		mobile.add("Samsung");
		mobile.add("Nokia");
		mobile.add("GooglePixel");
		mobile.add("Lenova");
		
		for(String s : mobile)
		{
		//System.out.println(s);
		}
			
		List<Integer> digit = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//	digit.forEach(System.out::println);
		
//==============================================================================================================
		String[] cars = {"Hyundai","Renault","Honda","BMWa","Apache"}; //String Array
		
		Integer[] arr = digit.stream().toArray(Integer[]::new); //Convert stream to Array
		Object[] arr1 = digit.stream().toArray();
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr1));
		
//===============================================================================================================
		
		//STREAM OBJECT CREATING WAYS//
		
		Stream stm = Stream.empty();  //by stream empty methods
		
		Stream stm1 = digit.stream(); //by list object reference
		
		Stream stm3 = Stream.builder().build(); //by builder method
		
		Stream stm4 = Stream.of(cars); //by stream OF method
		//stm4.forEach(System.out::println);
		
		IntStream stm5 = Arrays.stream( new int[] {6,7,8,9}); //By Arrays stream method
		//stm5.forEach(System.out::println);
		
		Stream stm6 = Arrays.stream( new Integer[] {6,7,8,9});
//======================================================================================================================		
		//OPERATIONS//
		
		List<String> carlist = Arrays.asList(cars);
		Stream<String> stm2 = carlist.stream();
		List<String> l = stm2.filter(c -> c.startsWith("H")).collect(Collectors.toList()); //To Find String by initial Word
		//l.forEach(s -> System.out.println(s));
		
		List<String> carsort = carlist.stream().sorted().collect(Collectors.toList()); //Sorting by natural order or ascending order
		//carsort.forEach(System.out::println);
		
		List<Integer> squareNumber = digit.stream().map(n -> n*n).collect(Collectors.toList());//.forEach(System.out::println); //Squaring every element by map
		//System.out.println(squareNumber);
		
		Integer maxnumber = digit.stream().max((x, y) -> x.compareTo(y)).get(); //To Find MaxNumber		
		 //System.out.println("Max= "+maxnumber);
		 
		 Integer minnumber = digit.stream().min((x,y) -> x.compareTo(y)).get(); //To Find MinNumber
		// System.out.println("Min= "+minnumber);
		 
		 Stream.generate(() ->(new Random().nextInt(10))).limit(10);//.forEach(System.out::println); //Random number till 10
		
		
		List<Integer> lst = digit.stream().filter(i -> i % 2==0).collect(Collectors.toList());	//EvenNumbers	
		//lst.forEach(System.out::println);
		
		boolean anymatches = digit.stream().anyMatch(i -> i>9); //Returns true if digtilist has number greater den 10
		//System.out.println(anymatches);
		
		boolean noneMatches = carlist.stream().noneMatch(s -> s.startsWith("C")); //Return true if doesn't contain given argument string
		//System.out.println(noneMatches);
		
		boolean allMatches = carlist.stream().allMatch(s -> s.contains("a")); //Return true if all elements contains "a"
		//System.out.println(allMatches);
		
		
		Optional<String> op = mobile.stream().findFirst(); 
		String optional=mobile.stream().findFirst().orElse("OOpssss");
		//System.out.println(op);
		
		Files.list(Paths.get("C:\\Users\\HP\\Desktop")).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	
	

}
