public class Main {
    public static void main(String[] args) {
        ArithmeticAndGeometricAverage arithmeticAndGeometricAverage = new ArithmeticAndGeometricAverage();
        System.out.println(arithmeticAndGeometricAverage.calculateArithmeticAverage(new int []{170,160}));
        System.out.println(arithmeticAndGeometricAverage.calculateGeometricAverage(new int []{1,3,7,4,6}));

        Department department1 = new Department(1,"IT","ss",1000);
        Department department2 = new Department(2,"HR","ee",5000);


        System.out.println("Compare if department1 equals to department2: " + department1.equals(department2));
    }
}