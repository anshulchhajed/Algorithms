import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
 * Description:Counts the duplicate character in an array
 * 
 * 
 * 
 */
public class DuplicateCharacter {
	public static void main(String[] args) {
	
		compute("anashul".toCharArray());
	}
	
	public static void compute(char[] input) {
		Map<Character, Integer> countMap = new TreeMap<>();
		for (char ch : input) {
			countMap.compute(ch, (key, val) -> {
				if (val == null) {
					return 1;
				} else {
					return val + 1;
				}
			});

		}
		
		Set<Entry<Character, Integer>> entry=countMap.entrySet();
		entry.forEach(k-> System.out.println(k));
		
	}
}