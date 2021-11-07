package demo_chanhtran.ss7_abstract_interface.abstract_class;

public class Panda extends DongVatAnCo implements Climb{
    @Override
    public void howToEat() {
        System.out.println("ăn lá trúc");
    }

    @Override
    public void goToBy() {
        System.out.println("di chuyển bằng cách bò");
    }

    @Override
    public void canClimb() {
        System.out.println("Panda có thể leo cây");
    }
}
