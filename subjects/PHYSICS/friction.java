package subjects.PHYSICS;
import java.util.*;
import java.io.*;
public class friction
{
    String s="";
    String que="";
    public void fric()
    {
        System.out.println("\f");
        try
        {
            System.out.println("\f");
            FileReader fr=new FileReader("fric1.txt");
            BufferedReader br=new BufferedReader(fr);
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println("FILE NOT FOUND!!!");
        }
            System.out.println("FOR QUESTIONS PRESS[1]"+"\n"+"TO RETURN TO MENU PRESS[2]");
        Scanner q=new Scanner(System.in);
        int ques=q.nextInt();
        if(ques==1)
        {
            try
         {
            System.out.println("\f");
            loading2 op=new loading2();
             op.load();
            FileReader fr=new FileReader("fricq.txt");
            BufferedReader br=new BufferedReader(fr);
            while((que=br.readLine())!=null)
            {
                System.out.println(que);
                Thread.sleep(200);
            }
        }
        catch(Exception e)
        {
            System.out.println("FILE NOT FOUND!!!");
        }
        System.out.println("TO EXIT PRESS[0]");
        int e=q.nextInt();
        if(e==0)
        {
            System.out.println("\f");
            loading2 op=new loading2();
             op.load();
            pmenu qu=new pmenu();
            qu.pm();
        }
        else{}
    }
    else if(ques==2)
    {
        System.out.println("\f");
        loading2 op=new loading2();
             op.load();
            pmenu qu=new pmenu();
            qu.pm();
        }
        else{}
    }
}
        
        
        
