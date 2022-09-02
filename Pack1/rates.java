package Pack1;
import java.util.*;
import Pack1.*;
public class rates 
{
    public void rate()
    {
        
            System.out.println("\f");
            System.out.println("\t"+"\t"+"\t"+"##############################################################");
            System.out.println("\t"+"\t"+"\t"+"                       PLEASE RATE US:                        ");
            System.out.println("\t"+"\t"+"\t"+"##############################################################");
            System.out.println("\t"+"\t"+"\t"+"EXCELLENT------>[1]");
            System.out.println("\t"+"\t"+"\t"+"GOOD----------->[2]");
            System.out.println("\t"+"\t"+"\t"+"SATISFACTORY--->[3]");
            System.out.println("\t"+"\t"+"\t"+"BAD------------>[4]");
            System.out.println("\t"+"\t"+"\t"+"VERY BAD------->[5]");
            Scanner sc=new Scanner(System.in);
            int c=sc.nextInt();
            System.out.println("\n"+"\n"+"\n");
            if(c==1)
            {
                System.out.println("WE ARE PLEASED TO GET SUCH AN AWSOME RATING!!!! THANK YOU :)");
                try{Thread.sleep(500); System.out.println("\f \f \f \f \f");} catch(Exception e){}
                System.out.println("PRESS ANY KEY TO GO BACK TO HOME PAGE");
                int h=sc.nextInt();
                if(h==1)
                {
                    welcome ob = new welcome();
                    ob.come();
                }
                else
                {
                    welcome ob = new welcome();
                    ob.come();
                }
            }
            else if(c!=1)
            {
                System.out.println("WE COULD'VE GOTTEN A BETTER REVIEW");
                try{Thread.sleep(1000);System.out.println("\f");}catch(Exception e){}
                rates ob=new rates();
                ob.rate();
            }
            else
            {
                 System.out.println("WRONG ENTRY!!! TRY AGAIN");
                try{Thread.sleep(1000);System.out.println("\f");}catch(Exception e){}
                rates ob=new rates();
                ob.rate();
            }
            }
          
            }
        
                    
        
