import java.util.Scanner ;
public class VatCalculate {
    public static void main(String[] args) {
        double amount , vatRate, priceWithoutVat, priceWithVat ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please write Fee Amount : ");
        amount = input.nextDouble();
        if(0 < amount && amount <= 1000){
            vatRate = 0.18 ;
        }
        else{
            vatRate = 0.08 ;
        }
        double vatAmount = amount * vatRate ;
        double amountWithVat = amount + vatAmount ;

        System.out.println("Amount Without VAT : " + amount);
        System.out.println("VAT Rate : " + vatRate);
        System.out.println("VAT Amount : " + vatAmount); 
        System.out.println("Amount With VAT : " + amountWithVat);

    }
}
