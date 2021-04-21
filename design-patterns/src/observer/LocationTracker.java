package observer;

public class LocationTracker implements Observer {
	
	private String name;
	private int location;
	private Observable radar;
	
	public LocationTracker(String name, int location) {
		this.name = name;
		this.location = location;
	}

	@Override
	public void update() {
		
		if(this.radar == null) {
			System.out.println(this.getName() + " is not detected by any radar.");
			return;
		}
		String newLocation = this.radar.getUpdate(this);
		System.out.println(this.getName() + " is " + location + " meters away from the radar.");
		
	}

	@Override
	public void setObservable(Observable radar) {
		this.radar = radar;
	}

	public String getName() {
		return name;
	}
	
	public void setLocation(int location) {
		this.location = location;
		radar.notifyRadar(this, location);
	}
	
	public int getLocation() {
		return this.location;
	}

}
