import java.util.*;
public class citytemp
{
    public static void main()
    {
        ArrayList<String> city=new ArrayList<String>();
        ArrayList<Double> temp=new ArrayList<Double>();
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the names of 5 cities and their temperatures");
        for (int i=0;i<5;i++)
        {
            String city1=SC.next();
            city.add(i,city1);
            double temp1=SC.nextDouble();
            temp.add(i,temp1);
        }
        double max=0, min=100; 
        int maxpos=-1,minpos=-1;
        for(int i=0;i<5;i++)
        {
            if (temp.get(i)>max)
            {
                max=temp.get(i);
                maxpos=i;
            }
            if (temp.get(i)<min)
            {
                min=temp.get(i);
                minpos=i;
            }
        }
        System.out.println("The city with max temp is " + city.get(maxpos) + " with temperature "+ temp.get(maxpos));
        System.out.println("The city with min temp is " + city.get(minpos) + " with temperature " + temp.get(minpos));    
    }
}
            
        