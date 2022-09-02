package subjects.CHEMISTRY;
import java.util.*;
import subjects.*;
public class cmenu
{
        public void cm()
     {
         System.out.println("\f");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"   WELCOME TO CHEMISTRY.WE CAN TEACH YOU THE FOLLOWING");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]THERMODYNAMICS");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]CHEMICAL BONDING");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]ORGANIC CHEMISTRY");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]TO EXIT");
         try{Thread.sleep(200);} catch(Exception e){}
         Scanner cm=new Scanner(System.in);
         int a=cm.nextInt();
         if(a==1)
         {
             loading1 op=new loading1();
             op.load();
             thermo cob=new thermo();
             cob.th();
            }
         else if(a==2)
         {
             loading1 op=new loading1();
             op.load();
             bond cob=new bond();
             cob.bd();
            }
         else if(a==3)
         {
             loading1 op=new loading1();
             op.load();
             oc cob=new oc();
             cob.oc1();
            }
         else if(a==4)
         {
             loading1 op=new loading1();
             op.load();
             menu cob=new menu();
             cob.menu();
            }
         else
         {
             System.out.println("WRONG OPTION!!! RE-ENTER");
             try{Thread.sleep(1000);} catch(Exception e){}
             System.out.println("\f");
             loading1 op=new loading1();
             op.load();
             cmenu cob=new cmenu();
             cob.cm();
            }
        }
    }
             
             
            
            