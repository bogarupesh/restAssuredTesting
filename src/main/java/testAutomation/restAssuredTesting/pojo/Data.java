package testAutomation.restAssuredTesting.pojo;

public class Data{
	private AppConfiguration appConfiguration;

    public AppConfiguration getAppConfiguration ()
    {
        return appConfiguration;
    }

    public void setAppConfiguration (AppConfiguration appConfiguration)
    {
        this.appConfiguration = appConfiguration;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [appConfiguration = "+appConfiguration+"]";
    }
    
}