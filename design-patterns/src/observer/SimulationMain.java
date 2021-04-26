package observer;


public class SimulationMain {

	public static void main(String[] args) {
		
		Radar radar = new Radar();
		Observer obs1 = new LocationTracker("Tracker 1", 100);
		Observer obs2 = new LocationTracker("Tracker 2", 200);
		Observer obs3 = new LocationTracker("Tracker 3", 300);
		
		radar.subscribe(obs1);
		radar.subscribe(obs2);
		radar.subscribe(obs3);
		
		Observer[] observers = {obs1, obs2, obs3};
		
		for(Observer obs: observers) {
			obs.setLocation(obs.getLocation()-100);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
