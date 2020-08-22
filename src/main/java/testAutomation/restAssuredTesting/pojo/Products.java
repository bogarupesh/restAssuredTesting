package testAutomation.restAssuredTesting.pojo;

public class Products{
	 private String buttonText;

	    private String subscriptionPeriod;

	    private String productId;

	    private String trialPeriod;

	    public String getButtonText ()
	    {
	        return buttonText;
	    }

	    public void setButtonText (String buttonText)
	    {
	        this.buttonText = buttonText;
	    }

	    public String getSubscriptionPeriod ()
	    {
	        return subscriptionPeriod;
	    }

	    public void setSubscriptionPeriod (String subscriptionPeriod)
	    {
	        this.subscriptionPeriod = subscriptionPeriod;
	    }

	    public String getProductId ()
	    {
	        return productId;
	    }

	    public void setProductId (String productId)
	    {
	        this.productId = productId;
	    }

	    public String getTrialPeriod ()
	    {
	        return trialPeriod;
	    }

	    public void setTrialPeriod (String trialPeriod)
	    {
	        this.trialPeriod = trialPeriod;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [buttonText = "+buttonText+", subscriptionPeriod = "+subscriptionPeriod+", productId = "+productId+", trialPeriod = "+trialPeriod+"]";
	    }
}