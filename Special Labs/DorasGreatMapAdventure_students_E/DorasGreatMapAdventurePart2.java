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
        Map<K, Set<V>> map1 = getMap();
        Map<K, Set<V>> map2 = boots.getMap();
        Map<K, Set<V>> map3 = union.getMap();
        Iterator<K> it1 = map1.keySet().iterator();
        Iterator<K> it2 = map2.keySet().iterator();
        while(it1.hasNext())
        {
            K key = it1.next();
            map3.put(key, map1.get(key));
        }
        while(it2.hasNext())
        {
            K key = it2.next();
            if(map3.containsKey(key))
            {
                Set<V> temp = map2.get(key);
                Iterator<V> tempIt = temp.iterator();
                while(tempIt.hasNext())
                {
                    map3.get(key).add(tempIt.next());
                }
            }
            else
            {
                map3.put(key, map2.get(key));
            }
        }
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
        Map<K, Set<V>> map1 = getMap();
        Map<K, Set<V>> map2 = backpack.getMap();
        Map<K, Set<V>> map3 = intersection.getMap();
        Iterator<K> it1 = map1.keySet().iterator();
        while(it1.hasNext())
        {
            K key = it1.next();
            if(map2.containsKey(key))
            {
                Set<V> set1 = map1.get(key);
                Set<V> set2 = map2.get(key);
                Set<V> set3 = new HashSet<V>();
                map3.put(key, set3);
                Iterator<V> setIt = set1.iterator();
                while(setIt.hasNext())
                {
                    V item = setIt.next();
                    if(set2.contains(item))
                    {
                        set3.add(item);
                    }
                }
            }
        }
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
        Map<K, Set<V>> map1 = getMap();
        Map<K, Set<V>> map2 = swiper.getMap();
        Map<K, Set<V>> map3 = difference.getMap();
        Iterator<K> it1 = map1.keySet().iterator();
        while(it1.hasNext())
        {
            K key = it1.next();
            if(map2.containsKey(key))
            {
                Set<V> set1 = map1.get(key);
                Set<V> set2 = map2.get(key);
                Set<V> set3 = new HashSet<V>();
                map3.put(key, set3);
                Iterator<V> setIt = set1.iterator();
                while(setIt.hasNext())
                {
                    V item = setIt.next();
                    if(!set2.contains(item))
                    {
                        set3.add(item);
                    }
                }
                if(set3.size()==0)
                {
                    map3.keySet().remove(key);
                }
            }
            else
            {
                map3.put(key, map1.get(key));
            }
        }
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
        return isSubmapOf((DorasGreatMapAdventure<K, V>)this, (DorasGreatMapAdventure<K, V>)backpack);
    }
    
    private boolean isSubmapOf(DorasGreatMapAdventure<K, V> original, DorasGreatMapAdventure<K, V> backpack)
    {
        Map<K, Set<V>> map1 = original.getMap();
        Map<K, Set<V>> map2 = backpack.getMap();
        Iterator<K> it1 = map1.keySet().iterator();
        while(it1.hasNext())
        {
            K key = it1.next();
            if(!map2.containsKey(key))
            {
                return false;
            }
            else
            {
                Set<V> set1 = map1.get(key);
                Set<V> set2 = map2.get(key);
                Iterator<V> setIt = set1.iterator();
                while(setIt.hasNext())
                {
                    V item = setIt.next();
                    if(!set2.contains(item))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
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
        return isSubmapOf(s)&&!isSubmapOf((DorasGreatMapAdventure<K, V>)s, (DorasGreatMapAdventure<K, V>)this);
    }

    /**
     *      Removes all mappings from this map
     *  postCondition:  keySet().size() == 0
     */
    public void clear() {
        getMap().keySet().clear();
    }

    /**
     *      the set associated with key isa is emptied
     *  postCondition:  getMap().get(isa).size() == 0
     *      if isa is not a key
     *          - do not throw an exception, that is exit the method gracefully
     */
    public void clearKey(K isa) {
        getMap().get(isa).clear();
    }

    /**
     *      returns the number key-value mapping in iAmTheMap
     */
    public int numMappings() {
        return getMap().keySet().size();
    }
}