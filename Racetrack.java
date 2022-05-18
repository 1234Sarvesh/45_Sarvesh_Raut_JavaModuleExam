class Racetrack{
public static void main(String... args){
	Car c = new Car(2000,"Creta",120.0);
	System.out.println("Car Make Year: "+c.getYear());
	System.out.println("Car Make: "+c.getMake());
	System.out.println("Car Speed Before: "+c.getSpeed());
	c.Accelerate();
	System.out.println("Car Speed After: "+c.getSpeed());
}
}