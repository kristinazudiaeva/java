public class Primes {
    public static void main(String[] args) {
        System.out.println("Простые числа меньше 100:");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) { //метод принимает целое число и определяет, является ли оно простым
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { //деление без остатка
                return false;
            }
        }
        return true;
    }
}
