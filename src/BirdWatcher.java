public class BirdWatcher {
    public BirdWatcher() {
    }

    public void watchFlyingBird(Flyable bird) {
        bird.fly();
    }

    public void watchSwimmingBird(Swimmable bird) {
        bird.swim();
    }
}
