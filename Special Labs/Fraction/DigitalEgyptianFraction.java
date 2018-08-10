import java.util.*;

public class DigitalEgyptianFraction extends Fraction
{
    public DigitalEgyptianFraction(int b)
    {
        super(1,b);
    }

    public static Fraction addAllDigitalEgyptianFractionsInList(List<DigitalEgyptianFraction> efs)
    {
        Fraction ans = new Fraction(0, 1);
        int n = 0;
        while(n<efs.size()){
            ans.add(efs.get(n));
            n++;
        }
        return ans;
    }

    //         Fraction ans = new Fraction(efs.get(0).getTop(), efs.get(0).getBottom());
    //         for(DigitalEgyptianFraction baka : efs){
    //             Fraction f = new Fraction(baka.getTop(),baka.getBottom());
    //             ans.add(f);
    //         }
    //         return ans;

    public static List<DigitalEgyptianFraction> getListOfDigitalEgyptianFractions(Fraction f)
    {
        List<DigitalEgyptianFraction> ans = new ArrayList<DigitalEgyptianFraction>();
        int bottom=2;
        while(f.getTop()!=1&&f.getBottom()!=0){
            if(1./bottom<=f.getDecimal()){
                Fraction fc = new Fraction(1,bottom);
                DigitalEgyptianFraction temp = new DigitalEgyptianFraction(bottom);
                ans.add(temp);
                f.subtract(fc);
            }
            bottom=bottom*2;
            System.out.println(ans);
        }
        DigitalEgyptianFraction temp = new DigitalEgyptianFraction(f.getBottom());
        ans.add(temp);
        return ans;
    }
    //subtract digital fractions
}