class Employee {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

public class Program5_Employee {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.havedata(101, "Rahul", 20000, 5000, 3000);
        e.dispdata();
    }
}