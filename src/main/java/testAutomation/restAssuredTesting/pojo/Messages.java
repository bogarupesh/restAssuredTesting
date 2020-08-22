package testAutomation.restAssuredTesting.pojo;

public class Messages{
	 private String[] notices;

	    public String[] getNotices ()
	    {
	        return notices;
	    }

	    public void setNotices (String[] notices)
	    {
	        this.notices = notices;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [notices = "+notices+"]";
	    }
    
}
