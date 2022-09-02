package subjects;
public class loading
{
   public void load()
   {
       System.out.println("\f");
       for(int i=0;i<10;i++)
              {
                System.out.print("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING");
                try{Thread.sleep(75);} catch(Exception e){}
                System.out.print(".");
                try{Thread.sleep(75);} catch(Exception e){}
                System.out.print(".");
                try{Thread.sleep(75);} catch(Exception e){}
                System.out.print(".");
                try{Thread.sleep(75);} catch(Exception e){}
                System.out.print("\f");
              }
              }
            }