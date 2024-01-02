package division;

public class Mitosis implements AsexualDivision {
    public Integer[] getVideoTimeStamp(){
        return new Integer[] {0, 3, 9, 15, 22, 30, 34, 42};
    }
    public String getVideoDirectory(){
        return "/resources/video/Mitosis.mp4";
    }
    public String getDivision(){
        return "Mitosis";
    }

}
