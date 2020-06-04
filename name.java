import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class name {
    Scanner in = new Scanner(System.in);
    String name;
    String t;
    String dis;

    name(){
        name = "";
        t = "";
        dis = "";
    }

    public static String timer(){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        return (dt.format(df));
    }

    public void accept(){
        System.out.println("enter your name and distination");
        name = in.nextLine();
        dis = in.nextLine();
    }

    void dis(){
        System.out.println("name: "+name);
        System.out.println("time: "+t);
        System.out.println("distination: "+dis);
    }
}