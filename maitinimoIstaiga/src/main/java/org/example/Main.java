package org.example;
import java.util.Scanner;

public class Main {
    public static void main ( String []args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        foodController bookController = new foodController();
        System.out.println("Iveskie vartotojo varda");
        String username = scanner.nextLine();
        System.out.println("iveskite slaptazodi");
        String pasword = scanner.nextline();

        if (userController.auhenticateUse (username, password)) {
            System.out.println("Prisijungimas sekmingas.")
            String role = userController.getUserRole(username);

            if ("administratorius". equals(role)) {
                System.out.println(" iveskite maitinimo istaigos pavadinima");
                System.out.println("iveskite adresa");
                String title = scanner.nextLine();
                System.out.println("pridekite patiekala i pasirinkta valgiarasti");
                String summary = scanner.nextLine();
                System.out.println("Patvirtinkite arba atsaukite");

            }
        }

    }
}