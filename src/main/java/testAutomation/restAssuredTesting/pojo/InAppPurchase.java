package testAutomation.restAssuredTesting.pojo;

public class InAppPurchase{
	 private Products[] products;

	    public Products[] getProducts ()
	    {
	        return products;
	    }

	    public void setProducts (Products[] products)
	    {
	        this.products = products;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [products = "+products+"]";
	    }
    
}
