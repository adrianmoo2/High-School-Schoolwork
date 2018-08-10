import java.util.*;

public class RPSSL 
{
    public String playRound(Player p1, Player p2)
    {
        //if (p1.getName().equals("Sheldon") && p2.getName().equals("Bernadette")) return "TIE";
        //if (p1.getName().equals("Sheldon") && p2.getName().equals("Howard")) return "Sheldon";

        //if (p1.getName().equals("Raj") && p2.getName().equals("Penny")) return "Penny";
        //if (p1.getName().equals("Amy") && p2.getName().equals("Leonard")) return "Leonard";

        //return "How did I get here";
        String name1 = p1.getName();
        String name2 = p2.getName();
        String choice1 = p1.getChoice();
        String choice2 = p2.getChoice();

        if (choice1 == "rock")
        {
            if (choice2 == "paper" || choice2 == "spock")
            {
                return name2;
            }
            else
            {
                if (choice2 == "lizard" || choice2 == "scissors")
                {
                    return name1;
                }
                else
                {
                    return "TIE";
                }
            }
        }
        else
        {
            if (choice1 == "lizard")
            {
                if (choice2 == "rock" || choice2 == "scissors")
                {
                    return name2;
                }
                else
                {
                    if (choice2 == "spock" || choice2 == "paper")
                    {
                        return name1;
                    }
                    else
                    {
                        return "TIE";
                    }
                }
            }
            else
            {
                if (choice1 == "spock")
                {
                    if (choice2 == "lizard" || choice2 == "paper")
                    {
                        return name2;
                    }
                    else
                    {
                        if (choice2 == "rock" || choice2 == "scissors")
                        {
                            return name1;
                        }
                        else
                        {
                            return "TIE";
                        }
                    }
                }
                else
                {
                    if (choice1 == "scissors")
                    {
                        if (choice2 == "paper" || choice2 == "lizard")
                        {
                            return name1;
                        }
                        else
                        {
                            if (choice2 == "rock" && choice2 == "spock")
                            {
                                return name2;
                            }
                            else
                            {
                                return "TIE";
                            }
                        }
                    }
                    else
                    {
                        if (choice1 == "paper")
                        {
                            if (choice2 == "rock" || choice2 == "spock")
                            {
                                return name1;
                            }
                            else
                            {
                                if (choice2 == "lizard" || choice2 == "scissors")
                                {
                                    return name2;
                                }
                                else
                                {
                                    return "TIE";
                                }
                            }
                        }

                    }
                }
            }
        }
        return "";
    }
}