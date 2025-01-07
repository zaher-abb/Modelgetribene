import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observer_list = new ArrayList<>();

	public void Attach(Observer o) {

		observer_list.add(o);
	}
	public void Detach(Observer o) {
		observer_list.remove(o);
	}

	public void Notify(String state) {
		for (Observer observer : observer_list) {
			observer.Update(state);
		}

	}

}