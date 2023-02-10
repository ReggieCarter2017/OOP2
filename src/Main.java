public class Main {
    public static void main(String[] args) {
        Food f1 = new Food();
        Food f2 = new Food("Oranges", 20, "Turkey", 1);

        f1.setName("Apples");
        f1.setPrice(20);


        System.out.println("\n");


        NewInter<Integer> comp = (n, m) -> (n < m);
        NewInter<Integer> comp2 = (n, m) -> (n == m);

        if (comp.compaire(f1.getPrice(), f2.getPrice())) System.out.printf("%s дороже, чем %s",  f2.getName(), f1.getName());
        else if (comp2.compaire(f1.getPrice(), f2.getPrice())) System.out.printf("%s и %s стоят одинаково", f1.getName(), f2.getName());
        else System.out.printf("%s дороже, чем %s",   f1.getName(), f2.getName());

    }
}