package observer;

public interface Observer {
	
	void update();
	void setObservable(Observable topic);
	int getLocation();
	void setLocation(int i);
	
}
