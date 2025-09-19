public class Main {
    public static void main(String[] args) {
        RestService count = new RestService();
        int Month = count.calculate(12000, 2000);
        System.out.println(Month);

    }
}
