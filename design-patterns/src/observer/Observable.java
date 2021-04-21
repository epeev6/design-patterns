package observer;

public interface Observable {

	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObservers();
	
	String getUpdate(Observer obs);
	
	// Observable Notifies the observer - bi-directional Observer design pattern??
	void notifyRadar(Observer obs, int location);
}
