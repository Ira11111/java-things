package src.bikeproject;

public class Bike implements BikeParts{

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;


	public Bike(){
		this.make = company_name;
	}//end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = company_name;
	}//end constructor

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

	@Override
	public String getHandleBars() {
		return this.handleBars;
	}

	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	@Override
	public String getFrame() {
		return this.frame;
	}

	@Override
	public void setFrame(String newValue) {
		this.frame = newValue;
	}

	@Override
	public String getTyres() {
		return this.tyres;
	}

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	@Override
	public String getSeatType() {
		return this.seatType;
	}

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	@Override
	public int getNumGears() {
		return this.NumGears;
	}

	@Override
	public void setNumGears(int newValue) {
		this.NumGears = newValue;
	}
}//end class Bike
	
	

