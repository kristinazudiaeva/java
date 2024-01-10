public class Palindrome {
    public static String reverseString(String s) { //метод принимает строку и возвращает ее обратно
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) { //цикл идет от последнего индекса до превого, в обратном порядке
            reversed.append(s.charAt(i));
        }
        return reversed.toString();//возвращение перевернутой строки
    }

    public static boolean isPalindrome(String s) { // проверка строки на палиндром
        s = s.replaceAll("\s", "").toLowerCase(); //удаление пробелов и приведение к нижнему регистру
        String reversed = reverseString(s); //вызов изменненой строки и сохранение в переменную

        return s.equals(reversed);
    }

    public static void main(String[] q) {
        for (int i = 0; i < q.length; i++) {
            String s = q[i];
            if (isPalindrome(s)) { //метод проверки, является ли строка палиндромом
                System.out.println(s + " является палиндромом.");
            } else {
                System.out.println(s + " не является палиндромом.");
            }
        }
    }
}
