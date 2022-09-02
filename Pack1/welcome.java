package Pack1;
import subjects.*;
import java.util.*;
public class welcome
{
    
    public void come()
    {
        System.out.println("\f");
        Scanner z=new Scanner(System.in);
        System.out.println("\t"+"             ####        ####    ###########    ####            ############    ############    ####        ####    ###########");  
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             ####        ####    ###            ####            ############    ############    #### ##  ## ####    ###         ");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             ####        ####    ###########    ####            ###             ###      ###    ####   ##   ####    ###########");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             ####        ####    ###########    ####            ###             ###      ###    ####        ####    ###########");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             ####   ##   ####    ###            ####            ###             ###      ###    ####        ####    ###        ");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             #### ##  ## ####    ###########    ############    ############    ############    ####        ####    ###########");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\t"+"             ####        ####    ###########    ############    ############    ############    ####        ####    ###########");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println("\f");
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"PLEASE SELECT AN OPTION:");
        try{Thread.sleep(100);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]LOGIN");
        try{Thread.sleep(100);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]TO LEARN ABOUT THE APPLICATION");
        try{Thread.sleep(100);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]FOR A FREE TRIAL");
        try{Thread.sleep(100);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]CREDITS");
        try{Thread.sleep(100);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[5]TO EXIT");
        try{Thread.sleep(100);} catch(Exception e){}
         try
        {int opt=z.nextInt();
        if(opt==1)
        {
            try{Thread.sleep(100);} catch(Exception e){}
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            login l=new login();
            l.A();
            menu mn=new menu();
            mn.menu();
        }
        else if(opt==2)
        {
            try{Thread.sleep(100);} catch(Exception e){}
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            about a=new about();
            a.bout();
        }
            else if(opt==3)
        {
            try{Thread.sleep(100);} catch(Exception e){}
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            trial a=new trial();
            a.free();
        }
             else if(opt==4)
        {
            try{Thread.sleep(100);} catch(Exception e){}
             for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
            credits a=new credits();
            a.cre();
        }
        else if(opt==5)
        {
            try{Thread.sleep(100);} catch(Exception e){}
            exit a=new exit();
            a.ex();
        }
        else
        {
            System.out.println("\f");
            System.out.println("WRONG CHOICE!!");
            try{Thread.sleep(100);} catch(Exception e){}
            System.out.println("Exiting");
            try{Thread.sleep(100);} catch(Exception e){}
            System.out.println("\f");
        }
        }
        catch(Exception e)
       {
        System.out.println("Something went wrong...Lets tr again");
        welcome q=new welcome();
        q.come();
       }
   }
}
            
            
    

    
       