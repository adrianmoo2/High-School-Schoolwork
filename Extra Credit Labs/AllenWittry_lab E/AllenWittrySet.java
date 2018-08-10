/*
If client creates a "hash" AllenWittrySet, then it may hold heterogeneous info and other AllenWittrySets.
If client creates a "tree" AllenWittrySet, then it may only hold elements which implement the Comparable interface as required by the TreeSet() class.
This class also has a compareTo() method which enables it to hold other AllenWittrySets.
 */
import java.util.*;
@SuppressWarnings("unchecked")
public class AllenWittrySet <E> implements Comparable <E> {

    private Set <E> mySet;

    // constructor works - do NOT modify
    public AllenWittrySet (String type) {
        if ("hash".equals(type))
            mySet = new HashSet <E> ();
        else if ("tree".equals(type))
            mySet = new TreeSet <E> ();
        else
            mySet = new HashSet <E> ();
    }

    //  return an AllenWittrySet that is the Union of mySet and s 
    //  that is (mySet U s)
    public AllenWittrySet<E> setUnion(AllenWittrySet <E> s) {
        AllenWittrySet <E> temp = new AllenWittrySet<E>("hash"/*or "tree"*/);
        Iterator it1=s.iterator();
        Iterator it2=mySet.iterator();
        while(it1.hasNext())
        {
            temp.add((E)it1.next());
        }
        while(it2.hasNext())
        {
            temp.add((E)it2.next());
        }
        return temp;
    }

    //  return an AllenWittrySet that is the Intersection of mySet and s 
    //  that is(mySet (unsidedown U) s)
    public AllenWittrySet<E> setIntersection(AllenWittrySet <E>  s) {
        AllenWittrySet <E> temp = new AllenWittrySet<E>("hash"/*or "tree"*/);
        Iterator it1=s.iterator();
        while(it1.hasNext())
        {
            E e=(E)it1.next();
            if(mySet.contains(e))
            {
                temp.add(e);
            }
        }
        return temp;
    }

    //  return an AllenWittrySet that is the items in mySet and NOT in s 
    //  that is(mySet - s)
    public AllenWittrySet<E> setDifference(AllenWittrySet <E> s) {
        AllenWittrySet <E> temp = new AllenWittrySet<E>("hash"/*or "tree"*/);
        Iterator it1=s.iterator();
        Iterator it2=mySet.iterator();
        while(it2.hasNext())
        {
            temp.add((E)it2.next());
        }
        while(it1.hasNext())
        {
            temp.remove((E)it1.next());
        }
        return temp;
    }

    //  returns true if mySet is a subset of s
    public boolean isSubsetOf(AllenWittrySet <E> s) {
        Iterator it=mySet.iterator();
        while(it.hasNext())
        {
            E o=(E)it.next();
            if(!s.contains(o))
            {
                return false;
            }
        }
        return true;
    }

    /**  returns true if mySet is a proper subset of s
     *           A set is a proper subset of B iff
     *           set A is a subset B and set A does not equal B
     */
    public boolean isProperSubsetOf(AllenWittrySet <E> s) {
        if(!isSubsetOf(s))
        {
            return false;
        }
        Iterator it=s.iterator();
        while(it.hasNext())
        {
            if(!mySet.contains(it.next()))
            {
                return true;
            }
        }
        return false;
    }

    // this works - do not mess with
    public Iterator <E> iterator() {
        return mySet.iterator();
    }

    // returns the number of elements in mySet
    public int size() {
        return mySet.size();
    }

    // returns true if mySet is empty
    public boolean isEmpty() {
        return mySet.isEmpty();
    }

    // returns true if mySet contains o
    public boolean contains(E o) {
        return mySet.contains(o);
    }

    //  removes all elements of mySet.
    public void clear() {
        mySet.clear();
    }

    //  returns an array which contains only the elements in mySet
    //  That is, mySet.contains(Object[k]), 0 <= k < Object.length
    //  && mySet.size() == Object.length
    public Object[] toArray() {
        Object[] arr=new Object[mySet.size()];
        Iterator it=mySet.iterator();
        for(int x=0; x<arr.length; x++)
        {
            arr[x]=it.next();
        }
        return arr;
    }

    //  add o to mySet
    public void add(E o) {
        mySet.add(o);
    }

    //  remove o from mySet
    public void remove(E o) {
        mySet.remove(o);
    }

    // this method is auto-called by Set class when determining
    // if an AllenWittrySet is already in this AlllenWittrySet - if you don't
    // have a compareTo(), then the system issues an exception because it 
    // doesn't have a way to check for equality since the add() method will
    // automatically try to call this since it cannot allow duplicate items
    // to be put into a set

    // return 0 only if both sets contain the same elements
    //  otherwise, since sets are not ordered, you may return any non zero value
    public int compareTo(E otherObj) {
        if(equals(otherObj))
        {
            return 0;
        }
        return -1;
    }

    /*
    public AllenWittrySet<E> sigmaN(int n) {
    Object[] objs = toArray();

    }
     */

    // return true if mySet is a subset of otherObj 
    //             && otherObj is a subset of mySet 
    //  but there is an easier way :)
    public boolean equals (Object otherObj) {
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        AllenWittrySet<E> other = (AllenWittrySet) otherObj;
        Iterator it=mySet.iterator();
        Iterator it2=other.iterator();
        while(it.hasNext())
        {
            E element=(E)it.next();
            if(!other.contains(element)) 
            {
                return false;
            }
        }
        while(it2.hasNext())
        {
            E element=(E)it2.next();
            if(!mySet.contains(element))
            {
                return false;
            }
        }
        return true;
    }

    // returns a string of the form
    //     "[obj1.toString(), obj2.toString(),...., objN.toString()]
    public String toString() {
        String string="[";
        Iterator it=mySet.iterator();
        boolean first=true;
        while(it.hasNext())
        {
            if(!first)
            {
                string+=", ";
            }
            else
            {
                first=false;
            }
            string+=(it.next().toString());
        }
        string+="]";
        return string;
    }
}