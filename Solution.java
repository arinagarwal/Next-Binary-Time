import java.util.*;
import java.io.*;
import java.math.*;

public class HelloWorld{



/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        int hour = Integer.parseInt(T.substring(0,2));
        int minute = Integer.parseInt(T.substring(3));
        String h = null;
        String m = null;
    
        if(hour < 10 && hour > 1)
        {
            h = "10";
        }
        else if(hour > 11)
        {
            h = "01";
        }
        if(hour == 10)
        {
          h ="10"
        }
         if(hour == 11)
        {
          h ="11"
        }
         if(hour == 1)
        {
          h ="01"
        }
        if (minute > 01 && minute < 10)
        {
            m = "10";
        }
        else if(minute > 11)
        {
            m = "00";
            if(h.equals( "01"))
            {
                h = "10";
            }
            if(h.equals( "10"))
            {
                h = "11";
            }
            if(h.equals( "11"))
            {
                h = "01";
            }
        }
        if(minute == 11)
        {
          m = "11"
        }
        if(minute == 10)
        {
          m = "10"
        }
        if(minute == 1)
        {
          m = "01"
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(h + ":" + m);
    }
}
}   
