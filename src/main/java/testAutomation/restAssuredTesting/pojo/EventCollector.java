package testAutomation.restAssuredTesting.pojo;

public class EventCollector {
	
	private String videoHeartbeatInterval;

    private String appName;

    private String[] deletePathsFromEvent;

    private String brand;
    private String mainUrl;

    public String getVideoHeartbeatInterval ()
    {
        return videoHeartbeatInterval;
    }

    public void setVideoHeartbeatInterval (String videoHeartbeatInterval)
    {
        this.videoHeartbeatInterval = videoHeartbeatInterval;
    }

    public String getAppName ()
    {
        return appName;
    }

    public void setAppName (String appName)
    {
        this.appName = appName;
    }

    public String[] getDeletePathsFromEvent ()
    {
        return deletePathsFromEvent;
    }

    public void setDeletePathsFromEvent (String[] deletePathsFromEvent)
    {
        this.deletePathsFromEvent = deletePathsFromEvent;
    }

    public String getBrand ()
    {
        return brand;
    }

    public void setBrand (String brand)
    {
        this.brand = brand;
    }

    public String getMainUrl ()
    {
        return mainUrl;
    }

    public void setMainUrl (String mainUrl)
    {
        this.mainUrl = mainUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [videoHeartbeatInterval = "+videoHeartbeatInterval+", appName = "+appName+", deletePathsFromEvent = "+deletePathsFromEvent+", brand = "+brand+", mainUrl = "+mainUrl+"]";
    }
    

}
