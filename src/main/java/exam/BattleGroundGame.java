package exam;

public class BattleGroundGame implements Game{

    @Override
    public void make() {
        System.out.println(producer() + " 배틀그라운드 제작");
    }
    @Override
    public String producer() {
        return "펍지";
    }
}
