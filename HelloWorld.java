import java.util.*;
public class HelloWorld{

     public static void main(String []args)
     {
         Scanner x=new Scanner(System.in);
         int add,c,i,dis;
         double cri;
         dis=0;
         String name[]=new String[100];
         int age[]=new int[100];
         String branch[]=new String[100];
         int year[]=new int[100];
         int sem[]=new int[100];
         double pp[]=new double[100];
         c=1;
        System.out.println("Enter 1 to add Data");
        System.out.println();
        add=x.nextInt();
        while(add==1)
        {
        System.out.println("Entry no.="+c);
        System.out.print("Enter name:");
        name[c]=x.next();
        System.out.println();
        System.out.print("Enter Age:");
        age[c]=x.nextInt();
        System.out.println();
        System.out.print("Enter Branch:");
        branch[c]=x.next();
        System.out.println();
        System.out.print("Enter Year(in numeral):");
        year[c]=x.nextInt();
        System.out.println();
        System.out.print("Enter Semester(in numeral):");
        sem[c]=x.nextInt();
        System.out.println();
        System.out.print("Enter previous year percentage(%)");
        pp[c]=x.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println("Enter 1 add more,0 to stop");
            add=x.nextInt();
            System.out.println();
            c++;
        }
        System.out.println("Enter 1 to display the entries, else 0");
        dis=x.nextInt();
        System.out.println();
        if(dis==1)
        {
            for(i=1;i<c;i++)
            {
                System.out.println("Entry no.="+i);
                System.out.println("Name:"+name[i]);
                System.out.println("Age:"+age[i]);
                System.out.println("Branch:"+branch[i]);
                System.out.println("Year:"+year[i]);
                System.out.println("Semester:"+sem[i]);
                System.out.println("Previous year %:"+pp[i]);
                System.out.println();
            }
            }
            System.out.print("Enter the % to filter the students with % greater than:");
            cri=x.nextInt();
            System.out.println();
            System.out.println();
            for(i=1;i<c;i++)
            {
                if(pp[i]>cri)
                {
                    System.out.println("Name:"+name[i]);
                System.out.println("Age:"+age[i]);
                System.out.println("Branch:"+branch[i]);
                System.out.println("Year:"+year[i]);
                System.out.println("Semester:"+sem[i]);
                System.out.println("Previous year %:"+pp[i]);
                System.out.println();
                }
            }
        }
}
