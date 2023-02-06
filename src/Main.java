public class Main {
    public static void main(String[] args) {
        Food f1 = new Food();
        Food f2 = new Food();

        f1.setName("John");
        f1.setPrice(18);
        f1.setProduction("Uganda");
        f1.setBBD(12);
        f1.showInfo();
        f2.showInfo();

        System.out.println("\n");

        Technique t1 = new Technique("Tractor John Deer", 21000, "USA", 7);
        t1.showInfo();

    }
}