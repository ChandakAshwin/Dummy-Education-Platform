package subjects.PHYSICS;
import java.util.*;
import subjects.*;
public class pmenu
{
        public void pm()
     {
         System.out.println("\f");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"   WELCOME TO PHYSICS.WE CAN TEACH YOU THE FOLLOWING");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]FRICTION");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]LAWS OF MOTION");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]PROJECTILE MOTION");
         try{Thread.sleep(200);} catch(Exception e){}
         System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]TO EXIT");
         try{Thread.sleep(200);} catch(Exception e){}
         Scanner cm=new Scanner(System.in);
         int a=cm.nextInt();
         if(a==1)
         {
             loading2 op=new loading2();
             op.load();
             friction pob=new friction();
             pob.fric();
            }
         else if(a==2)
         {
             loading2 op=new loading2();
             op.load();
             lom pob=new lom();
             pob.laws();
            }
         else if(a==3)
         {
             loading2 op=new loading2();
             op.load();
             prj pob=new prj();
             pob.proj();
            }
         else if(a==4)
         {
             loading2 op=new loading2();
             op.load();
             menu pob=new menu();
             pob.menu();
            }
         else
         {
             System.out.println("WRONG OPTION!!! RE-ENTER");
             try{Thread.sleep(1000);} catch(Exception e){}
             System.out.println("\f");
             loading2 op=new loading2();
             op.load();
             pmenu pob=new pmenu();
             pob.pm();
            }
        }
    }
             
             
            
            
