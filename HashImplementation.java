import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashImplementation {

	private static void iterateht(Hashtable<Integer, Integer> ht) {
		Set<Integer> s = ht.keySet();
		for (Integer key : s) {
			System.out.println(ht.get(key));
		}
	}

	public static void copyHashMap() {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Hashtable<Integer, Integer> copyht = new Hashtable<Integer, Integer>();
		hm.put(1, 4);
		hm.put(2, 5);
		hm.put(3, 6);
		copyht.putAll(hm);
		for (Integer s : copyht.keySet()) {
			System.out.println(copyht.get(s));
		}

	}

	private static void searchKey(Character key) {
		Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
		ht.put('a', 'A');
		ht.put('b', 'B');
		if (ht.containsKey('a')) {
			System.out.println(ht.get('a'));
		}

	}

	private static void searchValue(char c) {
		Hashtable<Integer, Character> ht = new Hashtable<Integer, Character>();
		ht.put(1, 'a');
		ht.put(2, 'b');
		if (ht.containsValue('a')) {
			System.out.println("Contains");
		}

	}

	private static void entryView() {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1, 10);
		ht.put(2, 20);
		Set<Entry<Integer, Integer>> entries = ht.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());

		}

	}

	private static void clearhashtable() {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1, 100);
		ht.put(2, 200);
		Set<Entry<Integer, Integer>> entries = ht.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		ht.clear();
		System.out.println(ht);

	}

	private static void useEnumeration() {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1, 300);
		ht.put(2, 400);
		ht.put(3, 500);
		Enumeration<Integer> keys = ht.keys();
		while (keys.hasMoreElements()) {
			Integer key = keys.nextElement();
			System.out.println(key + "->" + ht.get(key));
		}

	}

	public static void main(String[] args) {

		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1, 1);
		ht.put(2, 2);
		ht.put(3, 3);
		searchKey('a');
		copyHashMap();
		iterateht(ht);
		searchValue('a');
		entryView();
		clearhashtable();
		useEnumeration();
	}

}
