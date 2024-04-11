class Aeroplane {
    public void disp() {
        System.out.println("this is Aeroplane");
    }
}

class Cargoplane extends Aeroplane {
    public void disp() {
        System.out.println("this is cargoplane");
    }
}

class PassengerPlane extends Aeroplane {
    public void disp() {
        System.out.println("this is PassengerPlane");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Cargoplane obj = new Cargoplane();
        obj.disp();
        PassengerPlane obj2 = new PassengerPlane();
        obj2.disp();
    }
}
