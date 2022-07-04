package exam;

public class LolGame implements Game{
    @Override
    public void make() {
        System.out.println(producer() + " 리그오브레전드 제작");
    }

    @Override
    public String producer() {
        return "라이엇";
    }
}
