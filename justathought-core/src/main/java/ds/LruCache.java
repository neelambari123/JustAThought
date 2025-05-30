package ds;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LruCache<E,V> extends LinkedHashMap<E,V>{

	private final int capacity;
	
	public LruCache(int capacity) {
		super(capacity,(float) 7.5);
		this.capacity=capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<E, V> eldest) {		
		return size()>capacity;
	}
	
	public void putValue(E key,V Value) {
		super.put(key, Value);
	}
	
	public V getValue(E key) {
		return super.getOrDefault(key, null);
	}
	
	
	
	public static void main(String[] args) {
		LruCache<Integer, String> demo=new LruCache<>(5);
		demo.put(1, "one");
		demo.put(2, "two");
		demo.put(3, "three");
		demo.put(4, "four");
		demo.put(1, "five");
		demo.put(4, "six");
		demo.put(6, "seven");
		System.out.println(demo);
		
	}
}
