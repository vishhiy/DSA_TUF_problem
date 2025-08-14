class Main {
    public static int SumOfNum(int n) {
        if (n == 0) return 0; // base case
        return SumOfNum(n - 1) + n; // recursive case
    }

    public static void main(String[] args) {
        int result = SumOfNum(5); // value store karo
        System.out.println(result); // print karo
    }
}
