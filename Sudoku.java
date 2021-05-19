import java.util.*;
public class game {
    static int g[][] = new int[3][3];
    static int x, y, s=1;
    public static void main(String[] args) {
        int counter = 0;
        int i , j;
        Random r = new Random();
        Scanner S = new Scanner(System.in);
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
               g[i][j]=0;
            }
        }
        while(s<=8)
        {
             i=r.nextInt(3);
             j=r.nextInt(3);
             if(i==2&&j==2) continue;
             if(g[i][j]==0)
             {
                 g[i][j]=s;
                 s++;
             }
             else 
             {  
             }
        }
        i=2;j=2;
        g[i][j] = 0;
        printboard();
        while (counter < 50)
        {
            String d = S.next();
            if (d.equals("a")) {
                if (i == 0)
                {
                    System.out.println("INVALID ARGUMENT\n  TRY AGAIN!");
                } else
                    {
                    g[i][j] = g[i - 1][j];
                    g[i - 1][j] = 0;
                    i=i-1;
                    printboard();
                }
            }
            if (d.equals("d")) {
                if (i == 2) {
                    System.out.println("INVALID ARGUMENT\n  TRY AGAIN!");
                } else {
                    g[i][j] = g[i + 1][j];
                    g[i + 1][j] = 0;
                    i=i+1;
                    printboard();
                }
            }
            if (d.equals("w")) {
                if (j == 0) {
                    System.out.println("INVALID ARGUMENT\n  TRY AGAIN!");
                } else {
                    g[i][j] = g[i][j - 1];
                    g[i][j - 1] = 0;
                    j=j-1;
                    printboard();
                }
            }
            if (d.equals("s")) {
                if (j == 2) {
                    System.out.println("INVALID ARGUMENT\n  TRY AGAIN!");
                } else {
                    g[i][j] = g[i][j + 1];
                    g[i][j + 1] = 0;
                    j=j+1;
                    printboard();
                }
            }
        }
    }
    public static void printboard()
    {
        int m = 0;
        System.out.print(" ___ ___ ___");
        System.out.println();
        for (int n = 0; n < 3; n++) {
            System.out.print("|");
            for (m = 0; m < 3; m++)
            {
                if (g[m][n] == 0) {
                    System.out.print("_ _");
                    System.out.print("|");
                }
                else {
                    System.out.print("_"+ g[m][n]);
                    System.out.print("_");
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("\n~Enter ^ w ^ to go up");
        System.out.println("~Enter ^ s ^ to go down");
        System.out.println("~Enter ^ d ^ to go right");
        System.out.println("~Enter ^ a ^ to go left");
        System.out.println("\n ENTER YOUR ARGUMENT:");
    }
}


