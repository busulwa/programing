public class ConvertToSec {
    public static void main(String[] args) {

    int sec= 86399;
    int hr;
    int min;
    int sec2;
    hr= sec/60;
    min= hr/60;
    sec2= hr*60;
    System.out.println(hr+":"+min+":"+sec2);
}
}