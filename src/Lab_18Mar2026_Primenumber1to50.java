public class Lab_18Mar2026_Primenumber1to50 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");
        for (int num = 1; num <= 50; num++)
        {
            boolean isPrime = true;
            if (num == 1)
            {
                isPrime = false;
            } else
            {
                for (int i = 2; i <= num / 2; i++)
                {
                    if (num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
            {
                System.out.print(num + " ");
            }
        }
    }
}
