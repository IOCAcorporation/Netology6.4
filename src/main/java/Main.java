public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(120_000, 40_000);
        System.out.println(Month / 3);

    }
}
