package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        // System.out.println(ten.read());
        //System.out.println(minusFive.read());
        //  System.out.println(ten.isOn());
        // ten.setOff();
        //System.out.println(ten.isOn());
        TemperatureSensor temp = new TemperatureSensor();

        temp.setOn();
        System.out.println(temp.read());
        // temp.setOff();
        // System.out.println(temp.read());//should now throw an exception
        //--------------------------------------------------------------------
        Sensor manchester = new TemperatureSensor();
        manchester.setOn();
        System.out.println("Temperature in Manchester " + manchester.read() + " degrees Celsius");

        Sensor liverpool = new TemperatureSensor();
        liverpool.setOn();
        System.out.println("Temperature in Liverpool " + liverpool.read() + " degrees Celsius");

        Sensor burnley = new TemperatureSensor();
        burnley.setOn();
        System.out.println("Temperature in Burnley " + burnley.read() + " degrees Celsius");

        AverageSensor northWestRegion = new AverageSensor();
        northWestRegion.addSensor(burnley);
        northWestRegion.addSensor(liverpool);
        northWestRegion.addSensor(manchester);

        northWestRegion.setOn();
        System.out.println("temperature in the North West region " + northWestRegion.read() + " degrees Celsius");

        System.out.println("temperature in the North West region " + northWestRegion.read() + " degrees Celsius");
        System.out.println("temperature in the North West region " + northWestRegion.read() + " degrees Celsius");
        
        System.out.println("readings: " + northWestRegion.readings());
    }

}
