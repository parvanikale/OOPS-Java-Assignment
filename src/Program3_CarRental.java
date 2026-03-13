class CarRental {

    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {

        if (CarType.equals("Small"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else if (CarType.equals("SUV"))
            Rent = 2500;

        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

public class Program3_CarRental {
    public static void main(String[] args) {

        CarRental c = new CarRental();

        c.GetCar(1, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}