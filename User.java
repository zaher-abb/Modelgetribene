public class User extends Observer {

	private String name;

	public User(String name) {
		this.name = name;
	}
	public void Update(String state) {
		System.out.println(name + " received the weather update: " + state);
	}

}