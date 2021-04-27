package StreamApiPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) throws IOException {
		//List Object Creation
		
		List<Integer> numbers=Arrays.asList(1,11,2,22,3,33,4,44,5,55);
		
		List<String> names=new ArrayList<>();
		names.add("Prakash");names.add("Swapnil");names.add("Anand");names.add("Kamlesh");names.add("Akshay");
//=====================================================================================================================================		
					//Stream Object Creation
		
					Stream<Integer> str = numbers.stream();
					//str.forEach(System.out::println);
					
					Stream str1=Stream.empty();
					
					Stream str2=Stream.builder().build();
					
					IntStream str3=Arrays.stream(new int[] {1,2,3,4,5,6});
		
						Stream<Character> str4=Stream.of('a','b','c','d','e','f','g','h');
						//str4.forEach(System.out::println);
	
//=====================================================================================================================
				//Convert from List to Array	
						
					Integer[] arr=numbers.stream().toArray(Integer[]::new);
					String[] arr1=names.stream().toArray(String[]::new);
//					for(String ary : arr1)
//					{
//						System.out.println(ary);
//					}
					
					Object[] obj = numbers.stream().toArray();
					
//===================================================================================================================					
						//Even And Odd Numbers By Filters
						
					List<Integer> even=numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
				//	System.out.println(even);
					//even.forEach(System.out::println);
					
				//	numbers.stream().filter(n -> n%2!=0).forEach(System.out::println);
//======================================================================================================================					
					//To UpperCase by Map
				Set<String> uppercase =names.stream().map(u ->u.toUpperCase()).collect(Collectors.toSet());
					//uppercase.forEach(System.out::println);
					
//========================================================================================================================
				//Find Minimum Value by min()
				int min = numbers.stream().min((x,y) -> x.compareTo(y)).get();	
				//System.out.println(min);
					
//===============================================================================================================================
				//Find Maxmum Value by max()
			int max = numbers.stream().max((x,y) -> (x.compareTo(y))).get();
			//System.out.println(max);
//==========================================================================================================================			
			//Sorted ascending order
			
			List<Integer> asc = numbers.stream().sorted().collect(Collectors.toList());
			//asc.forEach(System.out::println);
//============================================================================================================================			
			//Sorted descending order
			
			//List<Integer> asc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			//asc.forEach(System.out::println);
//=====================================================================================================================				
			//Find String by initial
			
			List<String> iniString = names.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
			//iniString.forEach(System.out::println);
			
//=======================================================================================================================
					//Find files by using list
			
		
			
			
			List<Path> allFiles = Files.list(Paths.get("C:\\Users\\HP\\Desktop")).collect(Collectors.toList());
			//allFiles.forEach(System.out::println);
//============================================================================================================================================			
					//Find file and split string s and symbols
			
			
			
			List<String[]> star = Files.lines(Paths.get("C:\\Users\\HP\\Desktop\\pom.xml")).map(l -> l.split("<!--")).collect(Collectors.toList());//.forEach(System.out::println);
				
		
//	for(String[] s:star)
//		{
//			for(String s1:s)
//			{
//			System.out.println(s1);
//			}
//		}
//===================================================================================================================================
		//Find file and replace symbol function with empty string			
			List<String> stars = Files.lines(Paths.get("C:\\Users\\HP\\Desktop\\pom.xml")).map(l -> 
																		l.replace("<!--","").
																		replace("<","").
																		replace("/","").
																		replace(">","")).collect(Collectors.toList());//.forEach(System.out::println);
	//	stars.forEach(System.out::println);
		
//==========================================================================================================================================
		//Addition of elements of list// elements>10
			
			
			int sum = numbers.stream().filter(n ->n>10).mapToInt(n ->n).sum();//.collect(Collectors.toList());
		//System.out.println(sum);
		
//====================================================================================================================================================
		
		int[] dup = {10,20,10,60,40,20,30,20,90,80,100};
//		List<Integer> dl =Arrays.asList(dup);
//		
//		Set<Integer> dupi = dl.stream().collect(Collectors.toSet());//.forEach(System.out::println);
		//dupi.forEach(System.out::println);

//====================================================================================================================================================================
		//To Find Dupliactes in Array
		
		for(int i=0;i<dup.length;i++)
		{
			for(int j=i+1;j<dup.length;j++)
			{
			if(dup[i]==dup[j])
			{
				
				//System.out.println(dup[i]);
				
			}
			}			
		}
//=========================================================================================================================================		
		Set<Integer> set=new HashSet<>();
		
		for(Integer i : dup)
		{
			if(set.add(i)==false)
			{
				//System.out.println(i);
			}
		}
		
//===============================================================================================================================================================
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer i: dup)
		{
			Integer count = map.get(i);
			if(count==null)
			{
				map.put(i,1);
			}
			else
			{
				map.put(i,++count);
			}
		}
		
//		Set<Integer> key = map.keySet();
//		System.out.println(key);
		
		Set<Entry<Integer,Integer>> m = map.entrySet();
		for(Entry<Integer,Integer> entry:m)
		{
			if(entry.getValue()>1)
			{
		System.out.println(entry.getKey());
			}
		
		}
		
		
		
		
		
	}

}
