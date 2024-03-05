package services;

import entities.Department;
import entities.Employee;

public class DepartmentServices {
    public static void showReport(Department dept) {

        String salary = String.format("%.2f", dept.payroll());

        StringBuilder preparation = new StringBuilder();
        preparation.append("FOLHA DE PAGAMENTO: \n");
        preparation.append("Departamento Vendas = R$ " + salary + "\n");
        preparation.append("Pagamento realizado no dia " + dept.getPayDay() + "\n");
        preparation.append("Funcionários: \n");

        for(Employee emp : dept.getEmployeeList()){
            preparation.append(emp.getName() + "\n");

        }

        preparation.append("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail() + "\n");

        System.out.println(preparation);
    }
}
