package subjects.MATHS;
import subjects.*; 
import java.util.*;
public class mmenu
{
    public void mm()
    { 
           System.out.println("\f");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  WELCOME TO MATHEMATICS.WE CAN TEACH YOU THE FOLLOWING");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]GST(GOODS & SERVICES TAX)");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]TRIGONOMETRY");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]HEIGHTS AND DISTANCES");
           try{Thread.sleep(200);} catch(Exception e){}
           System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]TO EXIT");
           try{Thread.sleep(200);} catch(Exception e){}
           Scanner mm=new Scanner(System.in);
         int a=mm.nextInt();
         if(a==1)
         {
             loading3 op=new loading3();
             op.load();
             GST mob=new GST();
             mob.gs();
            }
         else if(a==2)
         {
             loading3 op=new loading3();
             op.load();
             trigo mob=new trigo();
             mob.tri();
            }
         else if(a==3)
         {
             loading3 op=new loading3();
             op.load();
             hd mob=new hd();
             mob.hand();
            }
            else if(a==4)
         {
             loading3 op=new loading3();
             op.load();
             menu mob=new menu();
             mob.menu();
            }
         else
         {
             System.out.println("WRONG OPTION!!! RE-ENTER");
             try{Thread.sleep(200);} catch(Exception e){}
             System.out.println("\f");
             loading3 op=new loading3();
             op.load();
             mmenu mob=new mmenu();
             mob.mm();
            }
        }
    }