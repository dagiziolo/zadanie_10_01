import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Toy[] toy = new Toy[3];

        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (i < toy.length) {
            System.out.println("Podaj nazwę zabawki i id zabawki");
            Toy[] toy_tmp = new Toy[1];
            toy_tmp[0] = new Toy(scan.nextLine(), scan.nextLong());
            scan.nextLine();

            boolean ifIs = false;
            for (int j = 0; j < toy.length; j++) {
                if (toy_tmp[0].equals(toy[j])) {
                    System.out.println("Duplikat! Zabawka jest w systemie");
                    ifIs = true;
                    break;
                }

            }
            if (!ifIs) {
                toy[i] = toy_tmp[0];
                i++;
            }
        }

        for (i = 0; i < toy.length; i++) {
            System.out.println(toy[i].toString());
        }
    }
}