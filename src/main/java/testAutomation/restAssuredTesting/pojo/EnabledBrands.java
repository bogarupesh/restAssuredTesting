package testAutomation.restAssuredTesting.pojo;

public class EnabledBrands {
	
	private String brandName;

    private String brandType;

    private String imageUrl;

    private String imageHighlightColor;

    private String selectedImageUrl;

    public String getBrandName ()
    {
        return brandName;
    }

    public void setBrandName (String brandName)
    {
        this.brandName = brandName;
    }

    public String getBrandType ()
    {
        return brandType;
    }

    public void setBrandType (String brandType)
    {
        this.brandType = brandType;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getImageHighlightColor ()
    {
        return imageHighlightColor;
    }

    public void setImageHighlightColor (String imageHighlightColor)
    {
        this.imageHighlightColor = imageHighlightColor;
    }

    public String getSelectedImageUrl ()
    {
        return selectedImageUrl;
    }

    public void setSelectedImageUrl (String selectedImageUrl)
    {
        this.selectedImageUrl = selectedImageUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [brandName = "+brandName+", brandType = "+brandType+", imageUrl = "+imageUrl+", imageHighlightColor = "+imageHighlightColor+", selectedImageUrl = "+selectedImageUrl+"]";
    }
}
