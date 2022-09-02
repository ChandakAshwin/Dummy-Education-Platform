package Pack1;
import java.util.*;
public class login
{
    
    Scanner sc=new Scanner(System.in);
    public String user[]={"top_123","AshwinChandak","SnehRaj"};
    public String pass[]={"gun","I'MBATMAN","Sneh11"};
    public int conf;
    public void A()
    {    
        System.out.println("\f");
        System.out.print("Enter Username:");
        String password;
        String username=sc.nextLine();
        if(username.equals(user[0]))
        {
            System.out.print("Enter Password:");
            password=sc.nextLine();
            if(password.equals(pass[0]))
            {
                for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"SIGNED IN");
                conf++;
            }
            else
            {
                System.out.println("\f");
                System.out.println("Wrong password");
                System.out.println("RETURNING TO MAIN SCREEN");
                try{Thread.sleep(200);}catch(Exception e){}
                System.out.println("\f");
                welcome w=new welcome();
                w.come();
            }
        }
        else if(username.equals(user[1]))
        {
            System.out.print("Enter Password:");
            password=sc.nextLine();
            if(password.equals(pass[1]))
            {
                for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"SIGNED IN");
                conf++;
            }
            else
            {
                System.out.println("\f");
                System.out.println("Wrong password");
                System.out.println("RETURNING TO MAIN SCREEN");
                try{Thread.sleep(200);}catch(Exception e){}
                System.out.println("\f");
                welcome w=new welcome();
                w.come();
            }
        }
        else if(username.equals(user[2]))
        {
            System.out.print("Enter Passwo:");
            password=sc.nextLine();
            if(password.equals(pass[2]))
            {
                for(int i=0;i<100;i++)
              {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
              }
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"SIGNED IN");
                conf++;
            }
            else
            {
                System.out.println("\f");
                System.out.println("Wrong password");
                System.out.println("RETURNING TO MAIN SCREEN");
                try{Thread.sleep(200);}catch(Exception e){}
                welcome w=new welcome();
                w.come();
            }
        }
        else
        {
                System.out.println("\f");
                System.out.println("Wrong Username");
                System.out.println("RETURNING TO MAIN SCREEN");
                try{Thread.sleep(200);}catch(Exception e){}
                System.out.println("\f");
                welcome w=new welcome();
                w.come();
        }
    }
    public static void main(String args[]) throws Exception
    {
        login ob=new login();
        ob.A();
    }
}
        
            
            
