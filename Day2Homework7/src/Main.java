public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        //Interihance

        customer.age=19;
        customer.firstName="Beyza";
        customer.lastName="Ceylan";
        customer.email="ceylanbeyza1327@gmail.com";

        //Different Classes But Same Attribute

        employee.age=20;
        employee.firstName="Ali Burak";
        employee.lastName= "Tıkıç";
        employee.salary=9000;

    }
}