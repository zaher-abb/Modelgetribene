public class Person extends Observer {

    public Person(String name) {
        super(name);
    }

    @Override
    public void Update(String forecast) {
        System.out.println(name + " received the weather update: " + forecast);
    }
}
