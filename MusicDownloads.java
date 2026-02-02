public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    for(DownloadInfo x: downloadList)
    {
      if(x.getTitle().equals(title))
        return x;
    }
    return null;
  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    for(DownloadInfo x: titles)
    {
      if(downloadList.get)
    }


  }
}
