import java.util.Scanner;

class SimpleConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String s = in.next();
        System.out.println(s);

        // Print numbers forwards
        /*int n = 1;
        while (n <= 500)
        {
            System.out.print(n);
            if (n != 500)
            {
                System.out.print(" | ");
            }
            n++;
        }*/

        // Print numbers backwards
        /*int n = 500;
        while (n >= 1)
        {
            System.out.print(n);
            if (n != 1)
            {
                System.out.print(" | ");
            }
            n--;
        }*/

        // Print numbers forwards with skipping every 3rd number (1 | 2 | 4 | 5 | 7 | ...)
        int n = 1;
        while (n <= 500)
        {
            if (n % 3 != 0) {
                System.out.print(n);
                if (n != 500)
                {
                    System.out.print(" | ");
                }
            }
            n++;
        }
    }
}
