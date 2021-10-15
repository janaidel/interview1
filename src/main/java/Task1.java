public class Task1 {

    public int compute(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return compute(n - 1) + compute(n - 2);
    }
}
