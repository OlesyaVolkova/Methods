import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        int c = Math.Sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Math.Quot(a, b)));
    }
}

class Math {
    static int Sum(int a, int b) {
        //Sum - сумма
        int c = a + b;
        return c;
    }

    static int Diff(int a, int b) {
        //Difference - разность
        return a - b;
    }

    static int Prod(int a, int b) {
        //Product - произведение
        return a * b;
    }

    static double Quot(int a, int b) {
        //Quotient - частное
        return (double) a / b;
    }
}