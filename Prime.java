public class PrimeNumber {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = num > 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}