import java.io.*;
public class ExceptionDemo6 {
   public static void main(String trisha[]) {
   Scanner sc = new Scanner(System.in);

System.out.print("Enter student name: ");
String name = sc.nextLine();

double total = 0;
     for (int i=1; i<=3;){
     try{
         System.out.print("Enter grade " + i + ": ");
double grade = nextDouble(sc.next());

   if (grade < 0) 
        throw new Exception("Negative grade");
total += grade;
i++; }
   catch (Exception e){
         System.out.println("Invalid grade input");
}
}
System.out.printf("%s's Average: %.2f\n", name, (total/3));
sc.close();
}
}

