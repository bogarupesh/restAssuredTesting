package testAutomation.restAssuredTesting.pojo;

public class EndpointUrls{
	private String propertyByUrlKey;

    public String getPropertyByUrlKey ()
    {
        return propertyByUrlKey;
    }

    public void setPropertyByUrlKey (String propertyByUrlKey)
    {
        this.propertyByUrlKey = propertyByUrlKey;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [propertyByUrlKey = "+propertyByUrlKey+"]";
    }
}