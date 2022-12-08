import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Person{
    String Name;
    String Surname;
    String Street;
    String ZipCode;
    String City;

    public void initialize() throws IOException{
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter data about a person.");
        System.out.println("Enter name:"); Name = scanner.readLine();
        System.out.println("Enter surname:"); Surname = scanner.readLine();
        System.out.println("Enter street:"); Street = scanner.readLine();
        System.out.println("Enter Zipcode:"); ZipCode = scanner.readLine();
        System.out.println("Enter City:"); City = scanner.readLine();
    }

    public void print(){
        System.out.println("Showing stored data.");
        System.out.println("Name: " + Name);
        System.out.println("Surname: " + Surname);
        System.out.println("Street: " + Street);
        System.out.println("Zipcode: " + ZipCode);
        System.out.println("City: " + City);
    }
}

class Staff extends Person implements salary{
    String Education;
    String Position;

    public void initialize1() throws IOException {
        this.initialize();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Education: ");
        Education = scanner.readLine();
        System.out.println("Position: ");
        Position = scanner.readLine();
    }

    public void print1(){
        this.print();

        System.out.println("Education: " + Education);
        System.out.println("Position: " + Position);
    }

    @Override
    public float salaryToPay(float payPerHour, int numberOfHours){ //podać w wywołaniu oba
        if (numberOfHours <= 160){
            return payPerHour * numberOfHours;
        }
        else{
            return payPerHour * 160 + salaryForOvertime(payPerHour, 10);
        }
    }

    @Override
    public float salaryForOvertime(float payPerHour, int extraHours){ //podać w wywołaniu oba
        return payPerHour * extraHours * 2;
    }
}

class HR{
    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();

        //employee.initialize();
        //employee.print();

        //employee.initialize1();
        //employee.print1();

        System.out.println("Payout for employee: " + employee.salaryToPay(30, 250));
        System.out.println("Payout for overtime: " + employee.salaryForOvertime(30, 10));
        System.out.println("Bonus payout: " + salary.bonusYesOrNo(2));
    }
}