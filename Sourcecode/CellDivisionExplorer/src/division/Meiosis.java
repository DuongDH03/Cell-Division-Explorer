package division;

public class Meiosis implements SexualDivision {
    public Integer[] getVideoTimeStamp(){
        return new Integer[] {0, 16, 25, 40, 53, 54, 56, 59, 62, 64};
    }
    public String getVideoDirectory(){
        return "/resources/video/Meiosis.mp4";
    }
    public String getDivision(){
        return "Meiosis";
    }

}
