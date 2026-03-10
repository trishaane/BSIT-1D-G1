import java.util.Scanner;
public class SGCalcEH {
   public static void main(String trisha[]) {
   Scanner input = new Scanner(System.in);

System.out.print("Enter student name: ");
String name = input.nextLine();

     double total = 0;
     int i = 1;
     while (i<=3) {
     try {
         System.out.print("Enter grade " + i + ": ");
double grade = scanner.nextDouble(sc.next());

   if (grade < 0) {
        throw new Exception();
     }
     total += grade;
     i++; 
  }catch (Exception e){
         System.out.println("\nInvalid grade input");
         return
}
}
System.out.println("\nAverage: " + (total/3));
input.close();
}
}

