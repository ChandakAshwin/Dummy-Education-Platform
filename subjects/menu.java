package subjects;
import subjects.*;
import Pack1.*;
import subjects.MATHS.*;
import subjects.PHYSICS.*;
import subjects.CHEMISTRY.*;
import java.util.*;
import java.io.*;
public class menu extends Pack1.login
{
    public void menu()
    {
        System.out.println("\f");
        do
        {
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"  WELCOME TO THE TUTORIAL.WE CAN TEACH YOU THE FOLLOWING");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"**********************************************************");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[1]MATHS");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[2]PHYSICS");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[3]CHEMISTRY");
            try{Thread.sleep(200);} catch(Exception e){}
            System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"[4]TO EXIT");
            try{Thread.sleep(200);} catch(Exception e){}
        }
        while(conf>0);
        Scanner choice=new Scanner(System.in);
        int c=choice.nextInt();
        if(c==1)
        {
            loading op=new loading();
            op.load();
            mmenu ob=new mmenu();
            ob.mm();
        }
        else if(c==2)
        {
            loading op=new loading();
            op.load();
            pmenu ob=new pmenu();
            ob.pm();
        }
        else if(c==3)
        {
            loading op=new loading();
            op.load();
            cmenu ob=new cmenu();
            ob.cm();
        }
        else if(c==4)
        {
            loading op=new loading();
            op.load();
            welcome ob=new welcome();
            ob.come();
        }
        else
        {
            System.out.println("SOMETHING WENT WRONG ...LETS TRY AGAIN");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\f");
            loading op=new loading();
            op.load();
            menu ob=new menu();
            ob.menu();
        }
    }
}
    