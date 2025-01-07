public abstract class Observer {
    protected String name; // Observer's name

    public Observer(String name) {
        this.name = name;
    }
    public abstract void Update(String forecast);
}
