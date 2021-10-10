package ss4_class_object.bai_tap;

public class StopWatch {
    //Trường startTime và endTime là private với phương thức
    // getter để trả về giá trị của startTime và endTime.
    //Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    //start() để reset startTime về thời gian hiện tại của hệ thống
    //stop() để thiết đặt endTime về thời gian hiện tại của hệ thống
    //getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

    private int startTime;
    private int endTime;

    public StopWatch() {
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void start() {
    }

    public void stop() {
    }


}
