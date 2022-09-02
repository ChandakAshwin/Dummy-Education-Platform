package subjects.CHEMISTRY;
import java.util.*;
import java.io.*;
public class thermo
{
    String s="";
    String que="";
    public void th()
    {
        System.out.println("\f");
        try
        {
            
            System.out.println("\f");
            FileReader fr=new FileReader("thermo.txt");
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
            System.out.println("\n"+"\n"+"FOR QUESTIONS PRESS[1]"+"\n"+"TO RETURN TO MENU PRESS[2]");
        Scanner q=new Scanner(System.in);
        int ques=q.nextInt();
        if(ques==1)
        {
            try
         {
            System.out.println("\f");
            loading1 op=new loading1();
             op.load();
            FileReader fr=new FileReader("thermoq.txt");
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
            loading1 op=new loading1();
             op.load();
            cmenu qu=new cmenu();
            qu.cm();
        }
        else{}
       }
       else if(ques==2)
      {
        System.out.println("\f");
        loading1 op=new loading1();
             op.load();
            cmenu qu=new cmenu();
            qu.cm();
       }
        else{}
    }
}
       