import java.util.Scanner;

public class calcu{

    Scanner in = new Scanner(System.in);
    double num1,num2;
    int n,num,sum;
    double a,b;
    char op = 'y';
  
    public calcu() {
        
    while(op =='y'){
    
    System.out.println("Choose your oprater");
   System.out.println("1. Addition"); 
   System.out.println("2. Subtraction");
   System.out.println("3. Division");
   System.out.println("4. Multiplication");
   System.out.println("5. Square ");
   System.out.println("6. Exponential function");
   System.out.println("7. Cube");
   System.out.println("8. Sin function");
   System.out.println("9. Cos function");
   System.out.println("10. Tan function");
   System.out.println("11. Log function");
   System.out.println("12. Natural Log function");
   System.out.println("12. Natural Log function");


                 System.out.print("Your Choice: ");
             
          int choice ;
         choice =in.nextInt();
         
            switch (choice){

            case 1 :
            System.out.println("Resualt is: " + add(n, num, sum));

               break;
            case 2:
            System.out.println("Resualt is: "+ sub(num1, num2));

               break;
            case 3:
            System.out.println("Resualt is: "+ dev(num1, num2));
   
                break;
            case 4:
            System.out.println("Resualt is: " + mul(n, num, sum));

               break;
            case 5:
            System.out.println("Resualt is: " + Squar());
   
               break;
            case 7:
            System.out.println("Resualt is: " + Cube());
     
                break;
            case 8:
            System.out.println("Resualt is: " + sin());
     
                break;
            case 9:
            System.out.println("Resualt is: " + Cos());
     
                break;
            case 10:
            System.out.println("Resualt is: " + Tan());
     
                break;
            case 6:
            System.out.println("Resualt is: " + PWO());
     
                break;
            case 11:
            System.out.println("Resualt is: " + Log());
              
                break;
            case 12:
            System.out.println("Resualt is: " + Log10());
                  
                break;
     
            }
        
         System.out.print("Do you want to exit Yes=y ,No=n : ");
        
          op = in.next().charAt(0);
        }
    }
    
    
    

public int add(int n, int num , int sum) {
    
    sum = 0;
        System.out.print("How many nubers do you want to add: ");
        n = in.nextInt();
        for(int i = 1; i <= n;i++ ){
            num = in.nextInt();
            sum = sum + num;
        }
        return sum;

}

public int mul(int n, int num , int sum) {

    sum = 1;
        System.out.print("How many nubers do you want to multiply: ");
        n = in.nextInt();
        for(int i = 1; i <= n;i++ ){
            num = in.nextInt();
            sum = sum * num;
        }
        return sum;

}

public double sub(Double num1 , Double num2){
  
    System.out.println("Enter frist number: ");
    num1=in.nextDouble();
    System.out.println("Enter frist number: ");
    num2=in.nextDouble();

    return num1 - num2;
}

public double dev(Double num1, Double num2){
  
    System.out.println("Enter frist number: ");
    num1=in.nextDouble();
    System.out.println("Enter frist number: ");
    num2=in.nextDouble();
    if(num2 !=0){
        return num1 /num2;
    }
    else
    return 0;
}

public double Squar(){
    
    System.out.println("Square of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.sqrt(a);
}

public double Cube(){
    
    System.out.println("Cuberoot of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.cbrt(a);
}

public double PWO(){
    
    System.out.println("Exponent of a number");
    System.out.print("Enter base number: ");
    a = in.nextDouble();
    System.out.print("Enter Power of number: ");
    b = in.nextDouble();
    return Math.pow(a, b);
}

public double sin(){
  
    System.out.println("Sin of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble(); 
    return Math.sin(a);
}

public double Cos(){

    System.out.println("Cos of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.cos(a);
}

public double Tan(){
 
    System.out.println("Sin of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.tan(a);
}

public double Log(){
 
    System.out.println("Logarithmic Value of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.log(a);

}
public double Log10(){
    System.out.println("Logarithmic Value of a number");
    System.out.print("Enter a number: ");
    a = in.nextDouble();
    return Math.log10(a);

}
    
    public static void main(String args [])
    {
        new calcu();
    }

}
