package exam;

public class StarCraftGame implements Game{
    @Override
    public void make() {
        System.out.println("스타크래프트 제작");
    }

    @Override
    public void producer() {
        System.out.println("블리자드");
    }
}
