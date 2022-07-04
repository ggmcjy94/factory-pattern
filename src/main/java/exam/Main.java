package exam;

public class Main {

    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.getGame("스타");
        game.producer();
        game.make();

    }
}
