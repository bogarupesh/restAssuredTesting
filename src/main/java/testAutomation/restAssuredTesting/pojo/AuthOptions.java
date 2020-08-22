package testAutomation.restAssuredTesting.pojo;

public class AuthOptions {
	
	 private InAppPurchase inAppPurchase;

	    private Mvpd mvpd;

	    public InAppPurchase getInAppPurchase ()
	    {
	        return inAppPurchase;
	    }

	    public void setInAppPurchase (InAppPurchase inAppPurchase)
	    {
	        this.inAppPurchase = inAppPurchase;
	    }

	    public Mvpd getMvpd ()
	    {
	        return mvpd;
	    }

	    public void setMvpd (Mvpd mvpd)
	    {
	        this.mvpd = mvpd;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [inAppPurchase = "+inAppPurchase+", mvpd = "+mvpd+"]";
	    }
    
}
