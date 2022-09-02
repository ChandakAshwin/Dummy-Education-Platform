package Pack1;
import java.io.*;
public class exit
{
    public void ex()
    {
        String s="";
        System.out.print("\f");
        for(int i=0;i<=20;i++)
        {
            System.out.print("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"EXITING");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.print(".");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.print(".");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.print("\f");
        }
        try
        {
            System.out.println("\f");
            FileReader fr=new FileReader("exit.txt");
            BufferedReader br=new BufferedReader(fr);
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
                Thread.sleep(200);
            }
        }
        catch(Exception e)
        {
            System.out.println("FILE NOT FOUND!!!");
        }
        }
    }