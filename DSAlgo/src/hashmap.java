import java.util.*;
import java.util.Map.Entry;
public class hashmap {

	public static void main(String[] args) {
		Map<String,List<String>> m = new HashMap<String,List<String>>();
		List<String> a = new ArrayList<String>();
		a.add((String)("a"));
		a.add((String)"b");
		m.put("A", a);
		List<String> b = new ArrayList<String>();
		b.add((String)("a"));
		b.add((String)"b");
		m.put("B", b);
		List<String> c = new ArrayList<String>();
		c.add((String)("a"));
		c.add((String)"b");
		m.put("C", c);
		Set<Map.Entry<String,List<String>>> e = m.entrySet();
		for(Entry<String, List<String>> s:e){
			System.out.println(s.getKey()+"->"+s.getValue());
		}
		
	}

}
