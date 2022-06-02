public class BallFactory {

    public Ball getBall(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("FOOTBALL")) return new FootBall();
        else if (shapeType.equalsIgnoreCase("BASEBALL")) return new BaseBall();
        else if (shapeType.equalsIgnoreCase("BASKETBALL")) return new BasketBall();
        else if (shapeType.equalsIgnoreCase("GOLF")) return new Golf();
        return null;
    }
}
