import java.util.Scanner;

public class ReverseString {

    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverse(input);
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
