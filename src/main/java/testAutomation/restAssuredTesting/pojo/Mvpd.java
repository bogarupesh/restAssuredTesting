package testAutomation.restAssuredTesting.pojo;

public class Mvpd{
	private String enabled;

    public String getEnabled ()
    {
        return enabled;
    }

    public void setEnabled (String enabled)
    {
        this.enabled = enabled;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [enabled = "+enabled+"]";
    }
    
}
