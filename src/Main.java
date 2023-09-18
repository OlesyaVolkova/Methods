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
        System.out.println("Факториал числа %d -> %d".formatted(a, Math.Fact(a)));
        System.out.println("%d в %d степени = %d".formatted(a, b, Math.Power(a, b)));
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

    static int Fact(int a) {
        //Factorial
        int fact = 1;
        for (int x = 1; x <= a; x++) {
            fact *= x;
        }
        return fact;
    }

    static int Power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}

