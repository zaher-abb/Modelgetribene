public class WeatherStation extends Subject {

	private String state;

	public String GetState() {
		return this.state;
	}

	public void SetState(String state) {
		this.state = state;
		this.Notify(state);
	}

}