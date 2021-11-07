package demo_chanhtran.ss8_clean_code;

public class DayInMonth {
    static final int JANUARY = 1;
    static final int FEBRUARY = 2;
    static final int MARCH = 3;
    static final int APRIL = 4;
    static final int MAY = 5;
    static final int JUN = 6;
    static final int JULY = 7;
    static final int AUGUST = 8;
    static final int SEPTEMBER = 9;
    static final int OCTOBER = 10;
    static final int NOVEMBER = 11;
    static final int DECEMBER = 12;

    public boolean isLeapYEar(int year){
        boolean isLeapYear = (year % 4 == 0 && year % 100 == 0) || year % 400 == 0;
        if (isLeapYear) {
            return  true;
        } else {
            return false;
        }
    }
    public  void showDayInMonth(int month, int year) {
        String result = "";
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                result = "tháng " + month + " có 31 ngày";
                break;
            case APRIL:
            case JUN:
            case SEPTEMBER:
            case NOVEMBER:
                result = "tháng " + month + " có 30";
                break;
            case FEBRUARY:  //
                if (isLeapYEar(year)){
                    result = "tháng " + month + " có 29";
                }else {
                    result = "tháng " + month + " có 28";
                }
                break;
            default:
                result = month + " không phải là tháng trong năm ";

        }
        System.out.println(result);

    }
}
