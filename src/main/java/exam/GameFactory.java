package exam;

public class GameFactory {

    public Game getGame(String gameName) {
        if (gameName.equals("스타")) {
            return new StarCraftGame();
        } else if (gameName.equals("배그")) {
            return new BattleGroundGame();
        } else if (gameName.equals("롤")) {
            return new LolGame();
        } else {
            return null;
        }
    }
}
