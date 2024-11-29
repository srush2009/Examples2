
class Car {
	private int numOfTires;
	private String bodyType;
	
	public Car() {}
	
	public int getNumOfTires() {
		return numOfTires;
	}
	public void setNumOfTires(int numOfTires) {
		this.numOfTires = numOfTires;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
}
	class BMW extends Car {
		private String modelName;
		
		public BMW() {}
		
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public void reverseGear() {
			System.out.println("Reverse gear is applied.");
		}
		public void switchOnHeadLight() {
			System.out.println("HeadLights are turned on");
		}
		public void topSpeed() {
			System.out.println("Top speed is 200 kmph");
		}
	
}
public class CarMasterBMW{
	public static void main(String[] args) {
		BMW bmwCar=new BMW();
		bmwCar.setNumOfTires(4);
		bmwCar.setBodyType("Sedan");
		bmwCar.setModelName("BMW X5");
		System.out.println("---Car Details---");
		System.out.println("Model Name: "+bmwCar.getModelName());
		System.out.println("Number of Tires: "+bmwCar.getNumOfTires());
		System.out.println("BodyType: "+bmwCar.getBodyType());
		bmwCar.reverseGear();
		bmwCar.switchOnHeadLight();
		bmwCar.topSpeed();

	}
}


