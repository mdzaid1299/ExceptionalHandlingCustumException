public class mkl {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int sum = 0;
        try {
            sum = num1 + num2;
            if (sum < 100) {
                throw new MyFirstException("kam hai");

            }
            System.out.println(sum);

        } catch (MyFirstException e) {
            System.out.println("e = " + e);
        }
    }

}
