package subjects.CHEMISTRY;
public class loading1
{
    public void load()
    {
        for(int i=10;i>=0;i--)
        {
            System.out.println("THE FILE WILL LOAD IN..." + i +"seconds");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("\f");
        }
    }
}