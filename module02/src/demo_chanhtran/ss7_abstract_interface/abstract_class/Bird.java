package demo_chanhtran.ss7_abstract_interface.abstract_class;

public class Bird extends Animal implements EnableFly,Climb {
    @Override
    public void goToBy() {

    }
    @Override
    public void fly() {
        System.out.println("chim bay");
    }

    @Override
    public void canClimb() {

    }

}
