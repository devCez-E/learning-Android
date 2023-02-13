public class Browser implements OnDownloadListenr{
    public void imgClick(){
        DownloadMch loader = new DownloadMch(this);
        loader.Start();
    }

    @Override
    public void onDownFinish() {
        System.out.println("Browser : onDownFinish()");
        
    }

    @Override
    public void onDownFailed() {
        System.out.println("Browser : onDownFailed()");
    }
}
