public class Lab_18Mar2026_AbstractionUsingInterface {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay();
    }
}
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay()
    {
        System.out.println("Paid via UPI");
    }
}
class CreditCard implements Payment{
    public void pay()
    {
        System.out.println("Paid via Credit Card");
    }
}