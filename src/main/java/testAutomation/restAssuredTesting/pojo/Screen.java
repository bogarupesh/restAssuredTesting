package testAutomation.restAssuredTesting.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Screen{
	 private String templateType;

	    private String pageType;

	    private String name;
	   
	    @JsonIgnore
	    private String id;

	    private String type;

	    private String url;

	    public String getTemplateType ()
	    {
	        return templateType;
	    }

	    public void setTemplateType (String templateType)
	    {
	        this.templateType = templateType;
	    }

	    public String getPageType ()
	    {
	        return pageType;
	    }

	    public void setPageType (String pageType)
	    {
	        this.pageType = pageType;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    public String getUrl ()
	    {
	        return url;
	    }

	    public void setUrl (String url)
	    {
	        this.url = url;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [templateType = "+templateType+", pageType = "+pageType+", name = "+name+", id = "+id+", type = "+type+", url = "+url+"]";
	    }
    
}
