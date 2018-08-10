import java.util.*;

public class MysterySolver4AB implements MysterySolverInterface4AB
{
    public String mysteryPreFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */      
        return "";
    }

    public String mysteryPostFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */      
        return "";
    }

    public String mysteryP(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        String str = "";
        for (int i=0;i<Integer.parseInt(input);i++)
        {
            
            q.add(""+findNextPrime(Integer.parseInt(q.remove())));
            str+=q.peek()+" ";
        }
        return str.substring(0,str.length()-1);
    }

    public int findNextPrime(int x)
    {
        int n=x+1;
        while (!isPrime(n))
        {
            n++;
        }
        return n;
    }
    
    public boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public String mysteryS(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String str="";
        while (strTok.hasNextToken())
        {
            q.add(strTok.nextToken());
        }
        return "";
    }  

    public String mystery10(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */      
        return "";
    }

    public String mysteryC(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */      
        return "";
    }
}