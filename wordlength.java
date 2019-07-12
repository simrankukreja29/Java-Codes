import java.util.*;
public class wordlength {

	
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String,Integer> map=new HashMap<>();
		  int l=0;
		  for(int i=0;i<strings.length;i++){
		    l=strings[i].length();
		    map.put(strings[i],l);
		  }
		  return map;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordlength l1=new wordlength(); 
		Scanner sc = new Scanner(System.in);
		String arr[]=new String[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		Map m=l1.wordLen(arr);
		System.out.println(m);
	}

}
