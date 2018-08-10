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
        return iAmTheMap.size()+numItems();
    }

    /**
     *      returns the total number of non key items in the iAmTheMap
     *      That is, the sum of the size of each set assocaiated with all keys
     */
    public int numItems()
    {
        Iterator<K> keyIt=keySet().iterator();
        int ans=0;
        while(keyIt.hasNext())
        {
            ans+=iAmTheMap.get(keyIt.next()).size();
        }
        return ans;
    }

    /**
     *      returns the total number of distinct non key items in the iAmTheMap
     *      That is, the sum of the size of each set assocaiated with all keys,
     *               not counting duplicates
     */
    public int numDistinctItems() {
        Set<V> s= new HashSet<V>();
        Iterator<K> keyIt=keySet().iterator();
        while(keyIt.hasNext())
        {
            Set<V> set = (iAmTheMap.get(keyIt.next()));
            Iterator<V> it = set.iterator();
            while(it.hasNext())
            {
                s.add(it.next());
            }
        }
        return s.size();
    }

    /**
     *      returns true iff
     *           iAmTheMap is Empty or all sets in the Map are Empty
     *      otherwise returns false
     */
    public boolean isEmpty() 
    {
        return iAmTheMap.isEmpty()||numItems()==0;
    }

    /**
     *      returns true if a one or more associated set contains diego
     *      otherwise (no set contains diego) return false
     *      
     */
    public boolean contains(Object diego)
    {
        if(isEmpty())
        {
            return false;
        }
        Iterator<K> keyIt=keySet().iterator();
        while(keyIt.hasNext())
        {
            Set<V> set=iAmTheMap.get(keyIt.next());
            if(set.contains(diego))
            {
                return true;
            }
        }
        return false;
    }

    /**
     *      returns an array containing all elements from the associated sets
     *      items may appear in the array more than once
     *      keys are not to be added to the array
     */
    public Object[] toArray()
    {
        Object[] ans = new Object[(numItems())];
        int x=0;
        Iterator<K> keyIt=keySet().iterator();
        while(keyIt.hasNext())
        {
            Set<V> set = (iAmTheMap.get(keyIt.next()));
            Iterator<V> it = set.iterator();
            while(it.hasNext())
            {
                ans[x]=(it.next());
                x++;
            }
        }
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
        Set<V> set=iAmTheMap.get(key);
        if(set==null)
        {
            Set<V> temp=new TreeSet<V>();
            temp.add(tico);
            iAmTheMap.put(key, temp);
        }
        else
        {
            set.add(tico);
        }
    }

    /**
     *      if tico is in the Set associate with key
     *          remove tico from the set associated with key.
     *          if the Set becomes Empty, remove the key from iAmTheMap
     *      otherwise (tico is not in the Set) 
     *          - do not throw an exception, that is exit the method gracefully
     */
    public void remove(K key, V tico) {
        Set<V> set=iAmTheMap.get(key);
        if(set!=null)
        {
            set.remove(tico);
            if(set.size()==0)
            {
                set.remove(key);
            }
        }
    }

    /**
     *      remove isa from all sets
     *          if the Set becomes Empty, remove the key from iAmTheMap
     */
    public void removeFromAll(V isa)
    {
        Iterator<K> it=keySet().iterator();
        Set<K> remove = new HashSet<K>();
        while(it.hasNext())
        {
            K key=it.next();
            Set temp = iAmTheMap.get(key);
            if(temp.contains(isa))
            {
                temp.remove(isa);
                if(temp.size()==0)
                {
                    remove.add(key);
                }
            }
        }

        Iterator<K> iterator=remove.iterator();
        while(iterator.hasNext())
        {
            iAmTheMap.remove(iterator.next());
        }
    }

    /**
     *      Every key in this.iAmTheMap is a key in otherDorasGreatMapAdventure.iAMTheMap
     *      Every key in otherDorasGreatMapAdventure.iAmTheMap is a key in this.iAMTheMap
     *      Each pair of set for a given key are equal
     *           that is,  iAmTheMap.get(key).equals(otherDorasGreatMapAdventure.iAmTheMap.get(key))
     */
    public boolean equals (Object otherDorasGreatMapAdventure) {
        Set<K> s1=keySet();
        Set<K> s2=((DorasGreatMapAdventure)otherDorasGreatMapAdventure).keySet();
        Iterator<K> it1=s1.iterator();
        Iterator<K> it2=s2.iterator();
        Iterator<K> it3=s1.iterator();
        while(it1.hasNext())
        {
            V v=(V)it1.next();
            if(!s2.contains(v))
            {
                return false;
            }
        }
        while(it2.hasNext())
        {
            V v=(V)it2.next();
            if(!s1.contains(v))
            {
                return false;
            }
        }
        while(it3.hasNext())
        {
            K k=(K)it3.next();
            if(!iAmTheMap.get(k).equals(((DorasGreatMapAdventure)otherDorasGreatMapAdventure).getMap().get(k)))
            {
                return false;
            }
        }
        return true;
    }

    /**
     *      The String should be of the form:
     *      "{key.toString()=iAmThemap.get(key).toString(), <repeat for all keys>}
     *      a single = between key and set, with a comma and a single space between each key set pair
     */
    public String toString() {
        String str="{";
        Set<K> set=keySet();
        Iterator<K> it=set.iterator();
        boolean isFirstElement=true;
        while(it.hasNext())
        {
            K key = it.next();
            if(isFirstElement)
            {
                isFirstElement=false;
            }
            else
            {
                str+=", ";
            }
            str+=(key.toString()+ "=" + iAmTheMap.get(key).toString());
        }
        str+="}";
        return str;
    }

    //stuff added after attempt 1

    /**
     *      Finds the largest value in all the sets contained in the map.
     *      You should assume that all Sets contain comparable items
     *      and that all sets are Comparable to each other
     *      DorasGreatMapAdventure is NOT empty
     */
    public V maxItem()
    {
        Iterator<K> keyIt=keySet().iterator();
        V v=null;
        boolean isFirstElement=true;
        while(keyIt.hasNext())
        {
            Set<V> set = iAmTheMap.get(keyIt.next());
            Iterator<V> it=set.iterator();
            while(it.hasNext())
            {
                if(isFirstElement)
                {
                    v=it.next();
                    isFirstElement=false;
                }
                else
                {
                    V temp = it.next();
                    if(((Comparable)v).compareTo(((Comparable)temp))<0)
                    {
                        v=temp;
                    }
                }
            }
        }
        return v;
    }
}