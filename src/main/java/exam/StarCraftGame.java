package exam;

public class StarCraftGame implements Game{
    @Override
    public void make() {
        System.out.println(producer() + " 스타크래프트 제작");
    }

    @Override
    public String producer() {
        return "블리자드";
    }
}
