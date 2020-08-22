/**
 * 
 */
package testAutomation.restAssuredTesting.pojo;


/**
 * @author user
 *
 */
public class Root{
	 private Envelope envelope;

	    private Data data;

	    private String generated;

	    private Messages messages;

	    private Status status;

	    public Envelope getEnvelope ()
	    {
	        return envelope;
	    }

	    public void setEnvelope (Envelope envelope)
	    {
	        this.envelope = envelope;
	    }

	    public Data getData ()
	    {
	        return data;
	    }

	    public void setData (Data data)
	    {
	        this.data = data;
	    }

	    public String getGenerated ()
	    {
	        return generated;
	    }

	    public void setGenerated (String generated)
	    {
	        this.generated = generated;
	    }

	    public Messages getMessages ()
	    {
	        return messages;
	    }

	    public void setMessages (Messages messages)
	    {
	        this.messages = messages;
	    }

	    public Status getStatus ()
	    {
	        return status;
	    }

	    public void setStatus (Status status)
	    {
	        this.status = status;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [envelope = "+envelope+", data = "+data+", generated = "+generated+", messages = "+messages+", status = "+status+"]";
	    }
    
    
}