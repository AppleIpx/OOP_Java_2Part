package Task5;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventDetails) {
        System.out.println("Уведомление для " + name + ": " + eventDetails);
    }
}
