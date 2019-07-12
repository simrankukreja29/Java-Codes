import java.util.*;

/*
 * The classic word-count algorithm: given an array of strings, 
 * return a Map<String, Integer> with a key for each different 
 * string, with the value the number of times that
 *  string appears in the array.
 */
public class wordcount {

	
	public Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map=new HashMap<String,Integer>();

		  for(int i=0;i<strings.length;i++){
		    if(!map.containsKey(strings[i])){
		      map.put(strings[i],1);
		    }
		    else{
		    int count=map.get(strings[i]);
		    map.put(strings[i],count+1);
		    } 
		  }
		  return map;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordcount l1=new wordcount(); 
		Scanner sc = new Scanner(System.in);
		String arr[]=new String[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		Map m=l1.wordCount(arr);
		System.out.println(m);
	}
	}

}
