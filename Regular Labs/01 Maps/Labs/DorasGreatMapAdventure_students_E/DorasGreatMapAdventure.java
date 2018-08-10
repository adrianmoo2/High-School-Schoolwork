/**
 *   If client creates a "hash" DorasGreatMapAdventure, key will have a reasonable hashCode, the associated set contains Objects
 *   If client creates a "tree" DorasGreatMapAdventure, key will implement Comparable interface as required by the TreeMap() class,
 *                                                                          the associated set contains Objects
 */

import java.util.*;

public class DorasGreatMapAdventure<K,V>{

/**
 *   Thou shall add NO methods that that modify any properties of iAmTheMap.
 *   Modify any properties of iAmTheMap may cause you other methods to fail toString() testing
*/
	private Map<K, Set<V>> iAmTheMap;
	
/**
 *   Thou shall not modify the constructor.
 *   Modify the constructor of iAmTheMap may cause you other methods to fail toString() testing
 */
	public DorasGreatMapAdventure(String type) {
		if ("hash".equals(type))
			iAmTheMap = new HashMap<K, Set<V>>();
		else if ("tree".equals(type))
			iAmTheMap = new TreeMap<K, Set<V>>();
		else
			iAmTheMap = new HashMap<K, Set<V>>();
	}

/**
 *      returns the set of keys from iAmTheMap
 *      I know, I gave it to you.
 */
	public Set<K> keySet() {
		return iAmTheMap.keySet();   
	}

/**
 *      returns iAmTheMap - Just in case there is a DorasGreatMapAdventureTheSequel
 *      I know, I gave it to you.
 */
	public Map<K, Set<V>> getMap() {
		return iAmTheMap;
	}
	
/**
 *      returns the total number of items in the iAmTheMap
 *      That is, the sum of the size of each set assocaiated with all keys
 *               plus the number of keys
 *               redundant items are counted multiple times.
 */
	public int size() {
		return -1;    // so it compiles
	}
	

/**
 *      returns the total number of non key items in the iAmTheMap
 *      That is, the sum of the size of each set assocaiated with all keys
 */
	public int numItems()
    {
		return -1;    // so it compiles 
    }

/**
 *      returns the total number of distinct non key items in the iAmTheMap
 *      That is, the sum of the size of each set assocaiated with all keys,
 *               not counting duplicates
 */
	public int numDistinctItems() {
		return -1;    // so it compiles
    }

/**
 *      returns true iff
 *           iAmTheMap is Empty or all sets in the Map are Empty
 *      otherwise returns false
 */
	public boolean isEmpty() {
		return 0 == (int)(2*Math.random());  // so compiles
	}

/**
 *      returns true if a one or more associated set contains diego
 *      otherwise (no set contains diego) return false
 *      
 */
	public boolean contains(Object diego)
	{
		return 0 == (int)(2*Math.random());  // so compiles
	}
	
/**
 *      returns an array containing all elements from the associated sets
 *      items may appear in the array more than once
 *      keys are not to be added to the array
 */
	public Object[] toArray()
	{
	    Object[] ans = new Object[(int)(111*Math.random())];
		return ans;
	}
	
/**
 *      add tico to the set associated with key.
 *      If key is not in iAmTheMap, add a new TreeSet containg tico as its sole member
 *
 *    yes - add a TREE set to insure matching traversal order 
 *
 *
 */
	public void add(K key, V tico) {
	}
	
/**
 *      if tico is in the Set associate with key
 *          remove tico from the set associated with key.
 *          if the Set becomes Empty, remove the key from iAmTheMap
 *      otherwise (tico is not in the Set) 
 *          - do not throw an exception, that is exit the method gracefully
 */
	public void remove(K key, V tico) {
	}
	
/**
 *      remove isa from all sets
 *          if the Set becomes Empty, remove the key from iAmTheMap
 */
	public void removeFromAll(V isa)
	{
	}
	
/**
 *      Every key in this.iAmTheMap is a key in otherDorasGreatMapAdventure.iAMTheMap
 *      Every key in otherDorasGreatMapAdventure.iAmTheMap is a key in this.iAMTheMap
 *      Each pair of set for a given key are equal
 *           that is,  iAmTheMap.get(key).equals(otherDorasGreatMapAdventure.iAmTheMap.get(key))
 */
	public boolean equals (Object otherDorasGreatMapAdventure) {
		return 0 == (int)(2*Math.random());  // so compiles
	}
	
/**
 *      The String should be of the form:
 *      "{key.toString()=iAmThemap.get(key).toString(), <repeat for all keys>}
 *      a single = between key and set, with a comma and a single space between each key set pair
 */
	public String toString() {
		return "{ NOT the right String }"; 
	}

// stuff added after attempt 1
	
/**
 *      Finds the largest value in all the sets contained in the map.
 *      You should assume that all Sets contain comparable items
 *      and that all sets are Comparable to each other
 *      DorasGreatMapAdventure is NOT empty
 */
	public V maxItem()
	{
		return (V)new Object();
	}
}