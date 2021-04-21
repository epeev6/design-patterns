package observer;

public interface Observable {

	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObservers();
	
	String getUpdate(Observer obs);
	void notifyRadar(Observer obs, int location);
}
