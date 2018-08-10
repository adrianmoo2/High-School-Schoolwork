import java.util.*;

public class MysterySolverII implements MysterySolverInterfaceII
{
  public String mystery6(String input)
  {
    StringTokenizer strTok = new StringTokenizer(input);    
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    String str = "";
    int m = 0;
    while (strTok.hasMoreTokens())
    {
        q.add(strTok.nextToken());
    }
    while (!q.isEmpty())
    {
        m+=Integer.parseInt(q.remove());
        str+=(m+" ");
    }
    return str.substring(0,str.length()-1);
  }

  public String mystery7(String input)
  {
    StringTokenizer strTok = new StringTokenizer(input);
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    String str = "";
    int m = 0;
    while (strTok.hasMoreTokens())
    {
        q.add(strTok.nextToken());
    }
    while (!q.isEmpty())
    {
        m+=Integer.parseInt(q.remove());
        for (int i=0;i<m;i++)
        {
            str+=m+" ";
        }
        str = str.substring(0, str.length()-1);
        str+="\n";
    }
    System.out.println(str);
    return str.substring(0,str.length()-1);
  }
  
  public String mystery8(String input)
  {
    StringTokenizer strTok = new StringTokenizer(input);    
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    String str = "";
    int m = 0;
    while (strTok.hasMoreTokens())
    {
        s.push(strTok.nextToken());
    }
    while (!s.empty())
    {
        m+=Integer.parseInt(s.pop());
        str+=(m+" ");
    }
    return str.substring(0,str.length()-1);
  }
  
  public String mystery9(String input)
  {
    StringTokenizer strTok = new StringTokenizer(input);
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    String str = "";
    while (strTok.hasMoreTokens())
    {
        q.add(strTok.nextToken());
    }
    while (!q.isEmpty())
    {
        String x = q.remove();
        if (Integer.parseInt(x)%2!=0)
        {
            str+=x;
            str+=" ";
        }
        else
        {
            s.push(x);
        }
    }
    while (!s.empty())
    {
        str+=s.pop();
        str+=" ";
    }
    return str.substring(0, str.length()-1);
  }
  
  public String mysteryF(String input)
  {
    StringTokenizer strTok = new StringTokenizer(input);
    Stack<String> s = new Stack<String>();
    Queue<String> q = new LinkedList<String>();
    String str = "";
    int m = 0;
    for (int i=0;i<Integer.parseInt(input);i++)
    {
    }
    return str;
  }
}