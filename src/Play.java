public class Play {
    public static void playAge(int a, int b) throws MyFirstException {
        int mul = a * b;
        if (mul < 100) {
            throw new MyFirstException("Error Aa Gai");
        } else {
            System.out.println(mul);
        }
    }

    public static void main(String[] args) {
        Play play = new Play();
        try {
            play.playAge(100,3);
        } catch (MyFirstException e) {
           e.printStackTrace();
        }
    }
}
