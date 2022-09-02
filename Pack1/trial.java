package Pack1;
import java.util.*;
import subjects.*;
import subjects.MATHS.*;
import subjects.PHYSICS.*;
import subjects.CHEMISTRY.*;
public class trial
{
   public void free()
   {
            System.out.println("\f");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  WELCOME TO THE TRIAL..YOU CAN TRY ONE OF THESE:");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]TRIGONOMETRY-MATHEMATICS");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]LAWS OF MOTION-PHYSICS");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]THERMODYNAMICS-CHEMISTRY");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]TO EXIT");
            try{Thread.sleep(200);} catch(Exception e){}
        
        
        Scanner choice=new Scanner(System.in);
        int c=choice.nextInt();
        if(c==1)
        {
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            trigo ob=new trigo();
            ob.tri();
        }
        else if(c==2)
        {
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            lom ob=new lom();
            ob.laws();
        }
        else if(c==3)
        {
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            thermo ob=new thermo();
            ob.th();
        }
        else if(c==4)
        {
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            welcome ob=new welcome();
            ob.come();
        }
        else
        {
            System.out.println("SOMETHING WENT WRONG ...LETS TRY AGAIN");
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            trial ob=new trial();
            ob.free();
        }
    }
}
    
       