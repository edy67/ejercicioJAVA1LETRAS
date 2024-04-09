package lab12;
import java.util.Scanner;
public class ejercicio2 {
    static int contarpal(String w)
    {
        int cp=0,lon,i;
        String y;
        w=w+" ";
        lon=w.length();
        for(i=1;i<=lon;i++)
        {
            y=w.substring(i-1, i);
            if (y.compareTo(" ")==0)
            {
                cp=cp+1;
            }



        }
        return cp;

    }
    static String sacarpal( String w,int k)
    {
        int cp=0,lon,i;
        String y, v=" ",z=" ";w=w+" ";
        lon = w.length();
        for (i=1;i<=lon;i++)
        {
            y=w.substring(i-1,i);
            if(y.compareTo(" ")==0)
            {
                cp=cp+1;
                if (cp==k)
                {
                    z=v;
                }
                v=" ";
            }
            else
            {
                v=v+y;

            }
        }
        return z;
    }

    public static void main(String[] args) {
        int cp,i,k;
        String b,v=" ",n=" ",pal;
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE LA FRASE POR FAVOR :");
        b = sc.nextLine();
        System.out.println("INTRO LA K-ESIMA APALABRA A ELIMINAR: ");
        k= sc.nextInt();
        
        cp=contarpal(b);
        for (i=1;i<=cp;i++)
        {
            pal= sacarpal(b, i);
            if (i==k)
            {
                pal=n ;
            }
            v=v+pal+" ";

        }
        System.out.println(" LA NUEVA FRASE ES :"+v);

    }
    
}
