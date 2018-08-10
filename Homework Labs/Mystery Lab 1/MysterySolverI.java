import java.util.*;

public class MysterySolverI implements MysterySolverInterfaceI
{
    public String mystery1(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        while (strTok.hasMoreTokens())
        {
            s.push(strTok.nextToken());
        }
        while (!s.empty())
        {
            str+=s.pop();
            str+=" ";
        }
        return str.substring(0, str.length()-1);
    }

    public String mystery2(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        String str = new String();
        while (strTok.hasMoreTokens())
        {
            s.push(strTok.nextToken());
        }
        while (!s.empty())
        {
            String x=s.pop();
            if (Integer.parseInt(x)%2!=0)
            {
                str+=x;
                str+=" ";
            }
            else
            {
                s2.push(x);
            }
        }
        while (!s2.empty())
        {
            str+=s2.pop();
            str+=" ";
        }
        System.out.println(str);
        return str.substring(0, str.length()-1);
    }

    public String mystery3(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        String str = new String();
        String x = "";
        while (strTok.hasMoreTokens())
        {
            s.push(strTok.nextToken());
        }
        while (!s.empty())
        {
            x = s.pop();
            str+=(int)Math.pow(Integer.parseInt(x), 2);
            str+=" ";
        }
        return str.substring(0, str.length()-1);
    }

    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }

    public String mystery4(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String str = new String();
        while (strTok.hasMoreTokens())
        {
            q.add(strTok.nextToken());
        }
        while (!q.isEmpty())
        {
            if (s.empty())
            {
                s.push(1*Integer.parseInt(q.remove())+"");
            }
            else
            {
                s.push(Integer.parseInt(s.peek())*Integer.parseInt(q.remove())+"");
            }
        }
        while (!s.empty())
        {
            q.add(s.pop());
        }
        while (!q.isEmpty())
        {
            str+=q.remove();
            str+=" ";
        }
        System.out.println(str);
        return str.substring(0,str.length()-1);
    }

    public String mystery5(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        String str = "";
        str = mystery4(input);
        str = mystery1(str);
        return str;
    }
}