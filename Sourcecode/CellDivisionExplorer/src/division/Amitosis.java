package division;

public class Amitosis implements AsexualDivision{
	@Override
    public Integer[] getVideoTimeStamp(){
        return new Integer[] {0, 12, 17, 33, 42, 52};
        // the time stamp of the phases of the video in seconds
    }
    @Override
    public String getVideoDirectory(){
        return "/resource/video/Amitosis.mp4";
        // the path to the video in the src folder
    }
    @Override
    public String getDivision(){
        return "Amitosis";
    }

}
