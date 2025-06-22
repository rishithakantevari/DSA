public class tribonacci {
  public int tribonacci(int n) {
        int a[] = new int[n + 1];

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        a[0] = 0;
        a[1] = 1;  // <- Corrected semicolon
        a[2] = 1;

        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2] + a[i - 3];
        }

        return a[n];
    }
}

