public class ExceptionDemo3 {
    
    public static void main(String trisha[]){

try {
     int x[] = new int[5];
     x[6] = 25;
     int num = 10/5;
     System.out.print(num);
}
catch(Exception e) {
     System.out.println(e.getMessage());
}
finally {
System.out.println("This block always executes");
}
}
}
