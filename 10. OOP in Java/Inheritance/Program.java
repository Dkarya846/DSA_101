class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }

    public String printInfo(){
        return "No of gears are: "+this.gear + "\nSpeed is: " + this.speed;
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    MountainBike(int speed, int gear, int seatHeight){
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    @Override
    public String printInfo(){
        return super.printInfo() + "\nSeat Height is: " + this.seatHeight;
    }
}

public class Program {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(4, 4, 2);
        System.out.println(mb.printInfo() + "\n");

        mb.speedUp(30);
        System.out.println(mb.printInfo() + "\n");

        mb.setHeight(30);
        System.out.println(mb.printInfo() + "\n");

        Bicycle bicycle = new MountainBike(10, 20, 30); //Upcasting


        MountainBike bike = (MountainBike)bicycle;  //Downcating

        bicycle.speedUp(30);
        bike.setHeight(30);

        System.out.println(mb.printInfo() + "\n");



    }    
}
