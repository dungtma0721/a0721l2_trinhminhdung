package demo_chanhtran.ss7_abstract_interface.abstract_class;

public  class Monkey extends Animal implements Climb{
    @Override
    public void goToBy() {
        System.out.println("dùng tay và chân");
    }

    @Override
    public void canClimb() {
        System.out.println("Khi leo cây bằng tay và chân");
    }
}
