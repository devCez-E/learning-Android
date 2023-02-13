import java.lang.Thread;

public class DownloadMch {
    private OnDownloadListenr mListenr;

    public DownloadMch(OnDownloadListenr listenr){
        mListenr = listenr;
    }

    void Start(){
        System.out.println("Download Start");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        mListenr.onDownFinish();
    }
}
