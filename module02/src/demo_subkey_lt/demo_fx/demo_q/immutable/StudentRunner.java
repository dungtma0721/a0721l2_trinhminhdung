package demo_subkey_lt.demo_fx.demo_q.immutable;

import java.util.Date;

public class StudentRunner {
    public static void main(String[] args) {
        Date myDOB = new Date();
        ImmutableClass student = new ImmutableClass("Manh", "Tien", myDOB);
    }
}
