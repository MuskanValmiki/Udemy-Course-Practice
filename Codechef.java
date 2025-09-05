import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
                int A = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }
                int B = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }
                int C = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }
                int D = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }
                int E = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }
                int F = input.nextInt();
                if (!input.hasNextInt()) {
                    throw new java.util.InputMismatchException();
                }

                if (A * A + B * B == C * C || D * D + E * E == F * F || A * A + C * C == B * B || D * D + F * F == E * E || B * B + C * C == A * A || E * E + F * F == D * D) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
        }
    }
}
