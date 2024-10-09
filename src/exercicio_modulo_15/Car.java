package exercicio_modulo_15;

public abstract class Car {

	private int horsePower;
	private String fuelSource;
	private String color;
	
	public Car(int horsePower, String fuelSource, String color) {
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println(getClass().getSimpleName());
		System.out.println("The" + fuelSource + " engine has been started" + horsePower);
	}
	public void clean() {
		System.out.println("Car has been cleaned " + color.toLowerCase() + " color shines");
	}
	public void fuelCar() {
		System.out.println("Car is begin filled with " + fuelSource.toLowerCase());
	}

	public void mechanicCheck() {
		System.out.println("Car has been checked by the mechanic " + fuelSource.toLowerCase());
		
	}
}
