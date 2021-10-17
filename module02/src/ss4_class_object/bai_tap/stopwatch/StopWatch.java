package ss4_class_object.bai_tap.stopwatch;

public class StopWatch {
    //Trường startTime và endTime là private với phương thức
    // getter để trả về giá trị của startTime và endTime.
    //Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    //start() để reset startTime về thời gian hiện tại của hệ thống
    //stop() để thiết đặt endTime về thời gian hiện tại của hệ thống
    //getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }
    //getElapsedTime
    public long getElapsedTime(){
        return endTime-startTime;
    }


}
