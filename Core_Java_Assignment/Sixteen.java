public class Sixteen {
    public static void main(String[] args) {

        FactoryEmployee fe1 = new FactoryEmployee(101, "Arpit", 20000, 12, "ABC jn");

        System.out.println("Bus No : " + fe1.getBusNo());
        System.out.println("Boards company bus : " + fe1.getBoardingPoint());

        FactoryEmployee fe2 = new FactoryEmployee(101, "Kunal", 12, "PQR jn");

        System.out.println("Bus No : " + fe2.getBusNo());
        System.out.println("Boards company bus : " + fe2.getBoardingPoint());

    }
}
