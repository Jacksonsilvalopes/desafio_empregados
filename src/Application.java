import entities.Address;
import entities.Department;
import entities.Employee;
import services.DepartmentServices;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Nome do departamento: ");
        String name = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String phone = sc.nextLine();


        Department department = new Department(name,payDay,new Address(email, phone));
        System.out.println("");

        System.out.print("Quantos funcionários tem o departamento? ");
        int quantidade = sc.nextInt();


        for (int i = 0; i < quantidade; i++) {


            System.out.println();
            int n = 1 + i;
            System.out.println("Dados do funcionário " + n + ":");
            sc.nextLine();

            System.out.print("Nome: ");
            String names = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();


            department.addEmployee(new Employee(names, salary));

        }

        System.out.println();

        DepartmentServices.showReport(department);
        sc.close();
    }

}