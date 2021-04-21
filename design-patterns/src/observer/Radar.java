package observer;

import java.util.ArrayList;
import java.util.List;

public class Radar implements Observable {
	
	private List<Observer> trackers;
	private String topic;
	private int distance;
	
	public Radar() {
		this.trackers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.trackers.add(observer);
		observer.setObservable(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.trackers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: this.trackers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate(Observer obs) {
		int distance = calculateDistance(obs);
		return String.valueOf(distance);
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}
	
	public List<Observer> getTrackers() {
		return this.trackers;
	}
	

	@Override
	public void notifyRadar(Observer tracker, int location) {
		notifyObservers();
	}

	public int calculateDistance(Observer obs) {
		//int index = trackers.indexOf(obs);
		return obs.getLocation();
	}
	
}
