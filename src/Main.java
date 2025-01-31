import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
       Student javaStudent1 = new Student();
       javaStudent1.setName("John");
       javaStudent1.setCourse("Java");

       Student webStudent1=new Student("Ann","web");
        System.out.println(webStudent1.getName() +" "+ webStudent1.getCourse());

        OrdinaryStudent pythonStudent1 = new OrdinaryStudent("Peter","Python");
        pythonStudent1.toString();
    }

}
