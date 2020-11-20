package classNobject;

public class TestDrive {
    public static void main(String[] args) {
        Car car = new Car() {

            public void start() {
                System.out.println("Start the car to move");

            }


            public void stop() {
                System.out.println("Press the break to stop");

            }
        };

        car.start();
        car.stop();


        //Way number 1 to do it
        Engine engine = (num1, num2) -> {
            System.out.println(num1 + num2);
        };
        engine.fly(20,73);

        //Way number 2. Both are correct
        Cake cake = (flavor, size) -> System.out.println("The cake has a " + flavor + " flavor and it is " + size);
        cake.dessert("Carrot","Big");

    }
}
