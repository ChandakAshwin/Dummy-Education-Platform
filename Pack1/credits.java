package Pack1;
import java.util.*;
public class credits
{
    public int b;
    public void cre()
    {
        System.out.println("\f");
        System.out.println("A"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"S"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"H"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"W"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"I"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"N");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"A"+"\t"+"\t"+"\t"+"\t"+"S"+"\t"+"\t"+"\t"+"\t"+"H"+"\t"+"\t"+"\t"+"\t"+"W"+"\t"+"\t"+"\t"+"\t"+"I"+"\t"+"\t"+"\t"+"\t"+"N");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"A"+"\t"+"\t"+"S"+"\t"+"\t"+"H"+"\t"+"\t"+"W"+"\t"+"\t"+"I"+"\t"+"\t"+"N");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"ASHWIN");
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\t"+"\t"+"C"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"H"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"A"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"N"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"D"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"A"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"K");
        System.out.print("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"ASHWIN");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\t"+"\t"+"\n"+"\n"+"\n"+"\n"+"C"+"\t"+"\t"+"\t"+"\t"+"H"+"\t"+"\t"+"\t"+"\t"+"A"+"\t"+"\t"+"\t"+"\t"+"N"+"\t"+"\t"+"\t"+"\t"+"D"+"\t"+"\t"+"\t"+"\t"+"A"+"\t"+"\t"+"\t"+"\t"+"K");
        System.out.print("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"ASHWIN");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\t"+"\t"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"C"+"\t"+"\t"+"H"+"\t"+"\t"+"A"+"\t"+"\t"+"N"+"\t"+"\t"+"D"+"\t"+"\t"+"A"+"\t"+"\t"+"K");
        System.out.print("\n"+"\n"+"\n"+"\n"+"ASHWIN");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"ASHWIN CHANDAK");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"CHANDAK"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"ASHWIN CHANDAK"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\f");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"PROJECT PREPARED BY"+"\t"+"\t"+"\t"+"\t"+"ASHWIN CHANDAK"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("CLASS               "+"\t"+"\t"+"\t"+"\t"+"       10/C      "+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
         try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("REGISTRATION NUMBER "+"\t"+"\t"+"\t"+"\t"+"       1****5    "+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
        System.out.println("\n"+"\n"+"\n"+"TO RATE OUR APPLICATION------>[1]"+"\n"+"TO GO BACK TO MENU------>[2]");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        b=a;
        if(a==1)
        {
            rates ob=new rates();
            ob.rate();
        }
        else if(a==2)
        {
            welcome ob=new welcome();
            ob.come();
        }
        else
        {
            System.out.println("\f");
            System.out.println("WRONG CHOICE!!!");
            try{Thread.sleep(100);}catch(Exception e){}
            credits ob=new credits();
            ob.cre();
            }
            }
        }
            
