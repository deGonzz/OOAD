abstract class Bike
{
	String brand;
	public Bike(String brand)
	{
		this.brand = brand;
	}
	public abstract String getDescription();
}

class MountainBike extends Bike
{
	public MountainBike(String brand)
	{
		super(brand);
	}
	public String getDescription()
	{	
		return "Mountain Bike: " + brand;
	}
}

class RoadBike extends Bike
{
	public RoadBike(String brand)
	{
		super(brand);
	}
	public String getDescription()
	{	
		return "Road Bike: " + brand;
	}
}

class BikeDriver 
{
	public static void main(String[] args)
	{
		if (args.length%2 != 0 || args.length == 0)
		{
			System.out.println("Usage: java BikeDriver type brand [type brand]*");
			System.exit(-1);
		}
		Bike[] myQuiver = new Bike[args.length/2];
		int quiverIndex = 0;
		for (int i=0; i<args.length; i++, quiverIndex++)
		{
			String type = args[i++];
			String brand = args[i];
			if (type.equalsIgnoreCase("Mountain"))
				myQuiver[quiverIndex] = new MountainBike(brand);
			else if (type.equalsIgnoreCase("Road"))
				myQuiver[quiverIndex] = new RoadBike(brand);
			else
				myQuiver[quiverIndex] = new RoadBike(brand);
		}
		for( Bike bike : myQuiver)
			System.out.println(bike.getDescription());
		// code stuff with bike...
	}
}
