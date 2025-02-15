package net.minecraft2.util;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import com.google.common.collect.Maps;

public class MapPopular {
	public static <K,V> Map<K,V> createMap(Iterable<K> keys, Iterable<V> values){
		return populateMap(keys, values,(Map) Maps.newLinkedHashMap());
	}
	
	public static <K,V> Map<K,V> populateMap(Iterable<K> keys, Iterable<V> values, Map<K,V> map){
		Iterator<V> iterator = values.iterator();
		for(K k : keys) {
			map.put(k, iterator.next());
		}
		if(iterator.hasNext()) {
			throw new NoSuchElementException();
		}
		else {
			return map;
		}
		
	}
}
