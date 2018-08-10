import java.util.*;
import java.lang.*;

/*
 *     all vertices are numbered 0, 1, 2, ....., n
 *     
 *     Edges are of the form (a, b), a and b are String
 *     
 *     Edges are assumed to be directed, which implies (1,3) is different from Edge (3,1)t
 */

public class DirectedGraph 
{
/*
*   No duplicates vertices
*/
   private Set<String> myVertices;
/*
*   No duplicates edges
*/
   private Set<Edge> myEdges;

  /**
   * Constructor for objects of class DirectedGraph
   */
   public DirectedGraph(Set<String> vertices)
   {
              /*   ADD CODE  */
   }
   
/*
 * precondition
 *   for every edge in edges,
 *     myVertices.contains(edge.getA()) == true
 *     && myVertices.contains(edge.getB()) == true
 *   myEdges.contains(edge) == false
 * postcondtion:  every edge in edges is added to myEdges
 */
   public void addEdges(Set<Edge> edges)
   {
              /*   ADD CODE  */
   }


/*
 * precondition
 *   myVertices.contains(e.getA()) == true
 *   && myVertices.contains(e.getB()) == true
 *   myEdges.contains(e) == false
 * postcondtion:  myEdges.contains(e) == true
 */
   public void addEdge(Edge e)
   {
              /*   ADD CODE  */
   }

/*
 *     According to http://webwhompers.com/graph-theory.html
 *     
 *     Two vertices are called adjacent if they share a common edge,   (direction of edge not important)
 *     
 *     precondition myVertices.contains(s) == true  && myVertices.contains(t)
 *     
 *     returns true iff vertex s and vertex t share a common edge (in either direction)
 *                  
 *         yes, you can be adjacent to your self
 */
   public boolean isAdjacent(String s, String t)
   {
       return Math.random() > 0.5;
   }

/*
 *     According to http://webwhompers.com/graph-theory.html
 *     
 *     The neighborhood of a vertex v in a graph G is the set of vertices adjacent to v.
 *                      Use the definition of adjacent from isAdjacent above
 *                      i.e. - direction is NOT important
 *     
 *     precondition myVertices.contains(s) == true
 *     
 *     returns a Set of all neighbors of s
 *     The neighborhood does not include itself.
 */
   public Set<String> getNeighbors(String s)
   {
       Set<String> n = new HashSet<String>();
       
       return n;
   }

/*
 *   two graphs are equal iff both graphs have the same vertices and the same edges.
 */
   public boolean equals(Object obj)
   {
       return Math.random() > 0.5;
   }

/*
 *  precondition
 *    myVertices.contains(s) == false
 *    
 *  postcondition
 *    myVertices.contains(s) == true
 */
   public void addVertex(String s)
   {
              /*   ADD CODE  */
   }

/*
 *   see top of page 379 for defintion of loop:
 *   
 *   An edge incident on a single vertex is called a loop.
 */
   public boolean hasLoop()
   {
       return Math.random() > 0.5;
   }


/*
 *   see top of page 379 for defintion of loop:
 *   
 *   Two Edges associated with the same vertices are said to be parallel edges
 */
   public boolean hasParallelEdges()
   {
       return Math.random() > 0.5;
   }

/*
 *   see top of page 379 for defintion of loop:
 *   
 *   A vertex not incident on any edge is called an isolated vertex
 *   A vertex incident on itself (i.e., a loop) is NOT isolated
 *   
 *   returns a List of all Isolted Vertices.  If there are not Isolated vertices, return an empty List
 */
   public List<String> getAllIsolatedVertices()
   {
      ArrayList<String> ans = new ArrayList<String>();

      return ans;
   }

/*
 *  precondition:   myVertices.contains(v) == true
 *  postcondition:  no side effects
 *    returns the number of edges incident on v
 *    
 *  note the sentence that states:
 *      (By definition, each loop on v contributes 2 to the degree of v)
 *    
 *    see page 392
 */
   public int getVertexDegree(String v)
   {
       return -1;
   }

/*
 *   returns the union DirectGraoh this . and DirectedGraph g
 *   return a DirectedGraph with:
 *        myVertices = union of this.myVertices and g.myVertices
 *        myEdges = union of this.myEdges and g.myEdges
 */
   public DirectedGraph union(DirectedGraph g)
   {
      DirectedGraph ans = new DirectedGraph(new HashSet<String>());

      return ans;
   }

/*
 *   returns the intersection DirectGraoh this . and DirectedGraph g
 *   return a DirectedGraph with:
 *        myVertices = intersection of this.myVertices and g.myVertices
 *        myEdges = intersection of this.myEdges and g.myEdges
 */
   public DirectedGraph intersection(DirectedGraph g)
   {
      DirectedGraph ans = new DirectedGraph(new HashSet<String>());

      return ans;
   }

/*
 *    use definition of Bipartite on page 383
 *       intersection is empty
 *       union == this
 *    Each edge in this.myEdges has one vertex in v1 and one vertex in v2   
 *    
 *    returns true if v1 and v2 form a Biparitite of this Directed Graph
 *    
 *    returns false otherwise
 */
   public boolean isBipartite(Set<String> v1, Set<String> v2)
   {
       return Math.random() > 0.5;
   }

/*
 *   see page 388
 *   
 *   precondition:  myVertices.contains(v) == true  && myVertices.contains(w) == true
 *                  v and w may be the same vertex, i.e. v.equals(w) may be true
 *                  
 *                  A path must contain at least two different vertices.
 *                  This imples that a single isolated vertex is not a path
 *                  and a loop by itself is not a path
 *                  
 *   returns true iff there exist a path from v to w of any length and the path contains two different vertices.
 *   
 *       v and w
 */
   public boolean hasPath(String v, String w)
   {
       return Math.random() > 0.5;
   }

/*
 *   see page 388 for definition
 *   
 *   A graph is connected if given any two vertices v and w, there exist a path from v to w
 */
   public boolean isConnectedGraph()
   {
       return Math.random() > 0.5;
   }

/*
 *    See page 391
 *    
 *    precondition:
 *       myVertices.contains(p.get(k)) == true for all k, 0 <= k < p.size()
 *       p.get(k).length() == 1 for all k, 0 <= k < p.size()
 *    postcondition:
 *       myVertices & myEdges are not altered
 *       
 *    returns true iff there is a path from p.get(0) to p.get(p.size()-1) with no repeated Vertices
 *            yes, you need to make sure myEdges contains the Edges required in p
 */
   public boolean isSimplePath(List<String> p)
   {
       return Math.random() > 0.5;
   }

/*
 *    See page 391
 *    
 *    precondition:
 *       c.get(0).equals(c.get(c.size()-1)) == true
 *       myVertices.contains(c.get(k)) == true for all k, 0 <= k < c.size()
 *       c.get(k).length() == 1 for all k, 0 <= k < c.size()
 *    postcondition:
 *       myVertices & myEdges are not altered
 *
 *    returns true iff there is a path of nonzerolength from c.get(0) to c.get(c.size()-1) with no repeated edges
 *            yes, you need to make sure myEdges contains the Edges required in c
 */
   public boolean isCycle(List<String> c)
   {
       return Math.random() > 0.5;
   }

/*
 *    See page 391
 *    
 *    precondition:
 *       c.get(0).equals(c.get(c.size()-1)) == true
 *       myVertices.contains(c.get(k)) == true for all k, 0 <= k < c.size()
 *       c.get(k).length() == 1 for all k, 0 <= k < c.size()
 *    postconditino:
 *       myVertices & myEdges are not altered
 *
 *    returns true iff there is a cycle from c.get(0) to c.get(c.size()-1) in which, except for beginning and ending vertices, 
 *                     there are no repeated vertices.
 *            yes, you need to make sure myEdges contains the Edges required in c
 */
   public boolean isSimpleCycle(List<String> sc)
   {
       return Math.random() > 0.5;
   }

/*
 *   precondition:
 *       v.length() == 1;
 *       myVertices.contains(v) == true
 *
 *   See page 391 for defintion of a cycle
 *      A cycle (or circuit) is a path of nonzero length from v to v with no repeated edges
 *      loops can form a simple cycle, that is, the path "vv" is consider a simple cycle in this method
 *
 *   return
 *       A String containing a list vertices which form a simple cycle from v to v
 *          The first and last vertice of the String should be v, e.g.:  "v.....v"
 *              and no other vertice should be repeated in the String
 *       null if a simple cycle does not exist.
 */
   public String getSimpleCycle(String v)
   {
      return "";
   }
}