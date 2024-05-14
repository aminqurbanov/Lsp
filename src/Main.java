public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher();
        Duck duck = new Duck();
        birdWatcher.watchFlyingBird(duck);
        birdWatcher.watchSwimmingBird(duck);
        Penguin penguin = new Penguin();
        birdWatcher.watchSwimmingBird(penguin);
        new Ostrich();
    }
}
