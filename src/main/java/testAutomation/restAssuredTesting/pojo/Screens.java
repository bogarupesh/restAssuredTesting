package testAutomation.restAssuredTesting.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Screens{
	
	@JsonIgnore
	private Screens screen;

    public Screens getScreen ()
    {
        return screen;
    }

    public void setScreen (Screens screen)
    {
        this.screen = screen;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [screen = "+screen+"]";
    }
}