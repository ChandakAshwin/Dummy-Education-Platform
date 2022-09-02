package Pack1;
import java.util.*;
public class about
{
    void bout()
    {
        System.out.println("\f");
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"THIS IS A TUTORIAL APPLICATION");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"PREPARED BY");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"ASHWIN CHANDAK");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"THROUG THIS APPLICATION YOU CAN ");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LEARN THE");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"FOLLOWING TOPICS");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"MATHEMATICS:GST(GOODS AND SERVICE TAX),TRIGONOMETRY & HEIGHTS AND DISTANCES");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"PHYSICS:LAWS OF MOTION,PTOJECTLE MOTION & FRICTION");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"CHEMISTRY:THERMODYNAMICS,BONDING & ORGANIC CHEMISTRY");
        try{Thread.sleep(80);} catch(Exception e){}
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"TO GO BACK TO MAIN MENU PRESS[0]");
        try{Thread.sleep(80);} catch(Exception e){}
        Scanner xy=new Scanner(System.in);
        int ex=xy.nextInt();
        if(ex==0)
        {
            System.out.println("\f");
            for(int i=0;i<100;i++)
            {
                System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"LOADING..."+i+"%");
                try{Thread.sleep(100);} catch(Exception e){}
                System.out.println("\f");
            }
            welcome ob=new welcome();
            ob.come();
        }
    }
}
                
        
        
