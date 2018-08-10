import java.util.*;

/**
 * Write a description of class DorasGreatMapAdventurePart2 here.
 * 
 * @author Mr. Allen
 * @version 
 */
public class DorasGreatMapAdventurePart2<K, V> extends DorasGreatMapAdventure<K,V>
{

/**
 *   If client creates a "hash" DorasGreatMapAdventure, key will have a reasonable hashCode, the associated set contains Objects
 *   If client creates a "tree" DorasGreatMapAdventure, key will implement Comparable interface as required by the TreeMap() class,
 *                                                                          the associated set contains Objects
 */
	public DorasGreatMapAdventurePart2(String type) {
		super(type);
	}

/**  returns a DorasGreatMapAdventure implemented with a HashMap
 *      This allows me to take the union of DorasGreatMapAdventure implemented with TreeMaps and HashMap
 *
 *      the returned Map will contains the keys that are in either Map.
 *      For keys that are in both Maps, the associated Sets will be a union of the two sets
 */
	public DorasGreatMapAdventurePart2<K, V> mapUnion(DorasGreatMapAdventure<K, V> boots)
	{
	    DorasGreatMapAdventurePart2<K, V> union = new DorasGreatMapAdventurePart2<K, V>("Hash");
		return union;
	}

/**  returns a DorasGreatMapAdventure implemented with a HashMap
 *      This allows me to take the intersection of DorasGreatMapAdventure implemented with TreeMaps and HashMap
 *
 *      the returned Map will contains the keys that are only in both Maps.
 *      the associated Sets will be an intersection of the two sets
 */
	public DorasGreatMapAdventurePart2<K, V> mapIntersection(DorasGreatMapAdventure<K, V> backpack)
	{
	    DorasGreatMapAdventurePart2<K, V> intersection = new DorasGreatMapAdventurePart2<K, V>("Hash");

	    return intersection;
	}

/**  returns a DorasGreatMapAdventure implemented with a HashMap
 *      This takes the difference of DorasGreatMapAdventure implemented with TreeMaps and HashMap
 *
 *      the returned Map will contain the keys that are in this.iAmTheMap.
 *      for each key in this.iAmTheMap,
 *      if that key is in swiper,
 *         the associated set is the set difference of this.iAmTheMap - swiper.iAmTheMap
 *         if the associated Set is Empty, remove the Key - Set pair from the Map
 *      otherswise (key is NOT in swiper)
 *         teh associated set is the set associated with key in this.iAmTheMap
 */
	public DorasGreatMapAdventurePart2<K, V> mapDifference(DorasGreatMapAdventure<K, V> swiper)
	{
	    DorasGreatMapAdventurePart2<K, V> difference = new DorasGreatMapAdventurePart2<K, V>("Hash");

	    return difference;
	}
	
/**
 *      returns true iff
 *         for each key in this.iAmTheMap, backpack.iAmTheMap contains the same key
 *         this.iAmTheMap.get(key) is a subset of backpack.iAmTheMap.get(k)
 *      note:  this allows both Maps to be equal
 *      otherwise return false
 */
	public boolean isSubmapOf(DorasGreatMapAdventure<K, V> backpack) {
		return 0 == (int)(2*Math.random());  // so compiles
	}
	
/**
 *      returns true iff
 *         for each key in this.iAmTheMap, backpack.iAmTheMap contains the same key
 *         this.iAmTheMap.get(key) is a subset of backpack.iAmTheMap.get(key) for every key in iAmTheMap.keySet()
 *         with this.iAmTheMap.get(key) is a proper subset of backpack.iAmTheMap.get(key) for atleast one key in iAmTheMap.keySet()
 *      note:  this implies that equal sets are NOT properSubsets.
 *      otherwise return false
 */
	public boolean isProperSubmapOf(DorasGreatMapAdventure<K, V> s) {
		return 0 == (int)(2*Math.random());  // so compiles
	}
	

	
/**
 *      Removes all mappings from this map
 *  postCondition:  keySet().size() == 0
 */
	public void clear() {

	}
	
/**
 *      the set associated with key isa is emptied
 *  postCondition:  getMap().get(isa).size() == 0
 *      if isa is not a key
 *          - do not throw an exception, that is exit the method gracefully
 */
	public void clearKey(K isa) {

	}

/**
 *      returns the number key-value mapping in iAmTheMap
 */
	public int numMappings() {
		return -1;
	}
}