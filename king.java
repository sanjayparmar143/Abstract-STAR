import java.util.Scanner;

public class king{

    public static void main(String[] args) {
        
        Bank bank = new hdfc();
        bank.Rates_of_Interest();

        bank = new axis();
        bank.Rates_of_Interest();
        
        bank = new sbi();
        bank.Rates_of_Interest();
        
        bank = new bob();
        bank.Rates_of_Interest();
    }
}
abstract class Bank{

    Double Rates_of_Interest;

    abstract void Rates_of_Interest();

}

class axis extends Bank{

    void Rates_of_Interest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter axis Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("Axis Bank Interest rate = "+(a*2*5/100));
        System.out.println("-----------------------------------------");
        
    } 
}

class bob extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BOB Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("BOB Bank Interest rate = "+(a*2*5/100));
        System.out.println("-----------------------------------------");
    } 
}
class sbi extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SBI Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("SBI Bank Interest rate = "+(a*2*5/100));
        System.out.println("-----------------------------------------");
    } 
}
class hdfc extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hdfc Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("hdfc Bank Interest rate = "+(a*2*5/100));
        System.out.println("-----------------------------------------");
    } 
}