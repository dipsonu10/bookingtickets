import java.io.*;
import java.util.*;

public class booking extends name {

    int f, r;
    String que[];

    booking() {
        f = -1;
        r = -1;
        que = new String[10];
    }

    void push(String v) {
        if (f == -1 && r == -1) {
            f = 0;
            que[++r] = v;
        } else {
            que[++r] = v;
        }
    }

    boolean check() {
        if (r == 9)
            return false;
        else
            return true;
    }

    void create() throws IOException {
        File f=new File("data.csv");

        if(f.exists())
        {
            FileWriter a=new FileWriter("data.csv", true);
            BufferedWriter b=new BufferedWriter(a);
            PrintWriter c=new PrintWriter(b);
            //String head="NAME, DISTINATION, BOOKING_TIME";
            //c.println(head);
            for (int i = 0; i <= r; i++) {
                c.println(que[i]);
            }
            c.close();
        }
        else{
            FileWriter a=new FileWriter("data.csv", true);
            BufferedWriter b=new BufferedWriter(a);
            PrintWriter c=new PrintWriter(b);
            String head="NAME, DISTINATION, BOOKING_TIME";
            c.println(head);
            for (int i = 0; i <= r; i++) {
                c.println(que[i]);
            }
            c.close();
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        booking ob1 = new booking();
        while(true){
            System.out.println("Enter (y) to book and (n) to quit");
            char cae = in.next().charAt(0);
            switch(cae){
                case 'y': 
                    if (ob1.check()){
                        name ob = new name();
                        ob.accept();
                        ob.t = timer();
                        ob.dis();
                        String x = ob.name+", "+ob.dis+", "+ob.t;
                        ob1.push(x);
                    }
                    else{
                        System.out.println("SORRY! no seats available");
                    }
                    break;
                case 'n': System.out.println("===========\nthank you !\n============");
                    System.out.println("tickets booked: " + (ob1.r + 1));
                    ob1.create();
                    System.exit(0);
                    break;
            }
        }
    }
}