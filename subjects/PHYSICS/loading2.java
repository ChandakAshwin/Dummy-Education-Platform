package subjects.PHYSICS;
public class loading2
{
    public void load()
    {
        System.out.print("\f");
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING");
        for(int i=0;i<=80;i++)
        {
            System.out.print("__");
            try{Thread.sleep(75);}catch(Exception e){}
        }
        System.out.println("\f");
    }
}
        
