public class Client {

    public static void main(String[] args) {
        BallFactory factory = new BallFactory();
        Ball football = factory.getBall("FOOTBALL");
        football.make();
    }
}
