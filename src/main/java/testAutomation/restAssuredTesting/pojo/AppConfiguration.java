package testAutomation.restAssuredTesting.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AppConfiguration{
	private String helpshiftEnabled;

    private String abTestsPrefetchUrl;

    private String searchPredictiveServiceEnabled;

    private String pageSize;

    @JsonIgnore
    private String contentBuckets;

    private String facebookAnalyticsEnabled;

    private String ageGatePass;

    private String gdprEnabled;
    
    @JsonIgnore
    private String templateZones;

    private String tuneEnabled;

    private String copyrightNoticeUrl;

    private String eulaUrl;

    private String fetchPlayheads;

    private String principalEnabled;

    private String displayTVEPromptAtStartup;

    private String eventMGID;

    private String trendingSearchUrl;

    private String playlistMGID;

    private String backgroundServiceEP;

    private String id;

    private String contentItemsUrl;

    private String refundFaqUrl;

    private String voiceControlEnabled;

    private String allShowsEnabled;

    private String searchPredictiveServiceUrl;

    private String movieMGID;

    private String rokuMarketingFrameworkEnabled;

    private AuthOptions authOptions;

    private String termsOfServiceUrl;

    private String accentColor;

    private String imageServer;

    private String appsFlyerEnabled;

    private String videoPlayerAutoHideTime;

    private String searchServiceEnabled;

    private EventCollector eventCollector;

    private String seriesMGID;

    private String ratingsRegulationUrl;

    private String imageEP;

    private String imageMGID;

    private String imageStage;

    private String upNextOverlayEnabled;

    private String displayLocksEnabled;

    private String availabilityServiceUrl;

    private String showOnboarding;

    private String abTestsNotifyUrl;

    private String displayLiveTVForAllUsers;

    private String backgroundServiceURL;

    private String chromeCastEnabled;

    private String brazeEnabled;

    private String customerSupportEmail;

    private String tvRatingsUrl;

    private String uvpPlayerEnabled;

    private EndpointUrls endpointUrls;

    private Screens[] screens;

    private String closedCaptionSupportUrl;

    private String moatEnabled;

    private String searchServiceUrl;

    private String liveMGID;

    private String marketingEnabled;

    private String privacyPolicyChangesUrl;

    private String videoMGID;

    private String videogameMGID;

    private String canSkipSubscriptionScreen;

    private String appName;

    private String tveAuthenticationEnabled;

    private EnabledBrands[] enabledBrands;

    private String adjustEnabled;

    private String propertyFeedUrl;

    private String backgroundServiceVideoEnabled;

    private String adChoicesDisclosureUrl;

    private String privacyPolicyUrl;

    private String urlKey;

    private String episodeMGID;

    private List<String> searchTypes;

    private String airplayEnabled;

    private String euDsmEnabled;

    private String balaLatestUpdatedTimeStamp;

    private String shortForm;

    private String ebookMGID;

    private String privacyPolicyFaqsUrl;

    private String apptentiveEnabled;

    private String clipPrerollsEnabled;

    public String getHelpshiftEnabled ()
    {
        return helpshiftEnabled;
    }

    public void setHelpshiftEnabled (String helpshiftEnabled)
    {
        this.helpshiftEnabled = helpshiftEnabled;
    }

    public String getAbTestsPrefetchUrl ()
    {
        return abTestsPrefetchUrl;
    }

    public void setAbTestsPrefetchUrl (String abTestsPrefetchUrl)
    {
        this.abTestsPrefetchUrl = abTestsPrefetchUrl;
    }

    public String getSearchPredictiveServiceEnabled ()
    {
        return searchPredictiveServiceEnabled;
    }

    public void setSearchPredictiveServiceEnabled (String searchPredictiveServiceEnabled)
    {
        this.searchPredictiveServiceEnabled = searchPredictiveServiceEnabled;
    }

    public String getPageSize ()
    {
        return pageSize;
    }

    public void setPageSize (String pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getContentBuckets ()
    {
        return contentBuckets;
    }

    public void setContentBuckets (String contentBuckets)
    {
        this.contentBuckets = contentBuckets;
    }

    public String getFacebookAnalyticsEnabled ()
    {
        return facebookAnalyticsEnabled;
    }

    public void setFacebookAnalyticsEnabled (String facebookAnalyticsEnabled)
    {
        this.facebookAnalyticsEnabled = facebookAnalyticsEnabled;
    }

    public String getAgeGatePass ()
    {
        return ageGatePass;
    }

    public void setAgeGatePass (String ageGatePass)
    {
        this.ageGatePass = ageGatePass;
    }

    public String getGdprEnabled ()
    {
        return gdprEnabled;
    }

    public void setGdprEnabled (String gdprEnabled)
    {
        this.gdprEnabled = gdprEnabled;
    }

    public String getTemplateZones ()
    {
        return templateZones;
    }

    public void setTemplateZones (String templateZones)
    {
        this.templateZones = templateZones;
    }

    public String getTuneEnabled ()
    {
        return tuneEnabled;
    }

    public void setTuneEnabled (String tuneEnabled)
    {
        this.tuneEnabled = tuneEnabled;
    }

    public String getCopyrightNoticeUrl ()
    {
        return copyrightNoticeUrl;
    }

    public void setCopyrightNoticeUrl (String copyrightNoticeUrl)
    {
        this.copyrightNoticeUrl = copyrightNoticeUrl;
    }

    public String getEulaUrl ()
    {
        return eulaUrl;
    }

    public void setEulaUrl (String eulaUrl)
    {
        this.eulaUrl = eulaUrl;
    }

    public String getFetchPlayheads ()
    {
        return fetchPlayheads;
    }

    public void setFetchPlayheads (String fetchPlayheads)
    {
        this.fetchPlayheads = fetchPlayheads;
    }

    public String getPrincipalEnabled ()
    {
        return principalEnabled;
    }

    public void setPrincipalEnabled (String principalEnabled)
    {
        this.principalEnabled = principalEnabled;
    }

    public String getDisplayTVEPromptAtStartup ()
    {
        return displayTVEPromptAtStartup;
    }

    public void setDisplayTVEPromptAtStartup (String displayTVEPromptAtStartup)
    {
        this.displayTVEPromptAtStartup = displayTVEPromptAtStartup;
    }

    public String getEventMGID ()
    {
        return eventMGID;
    }

    public void setEventMGID (String eventMGID)
    {
        this.eventMGID = eventMGID;
    }

    public String getTrendingSearchUrl ()
    {
        return trendingSearchUrl;
    }

    public void setTrendingSearchUrl (String trendingSearchUrl)
    {
        this.trendingSearchUrl = trendingSearchUrl;
    }

    public String getPlaylistMGID ()
    {
        return playlistMGID;
    }

    public void setPlaylistMGID (String playlistMGID)
    {
        this.playlistMGID = playlistMGID;
    }

    public String getBackgroundServiceEP ()
    {
        return backgroundServiceEP;
    }

    public void setBackgroundServiceEP (String backgroundServiceEP)
    {
        this.backgroundServiceEP = backgroundServiceEP;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getContentItemsUrl ()
    {
        return contentItemsUrl;
    }

    public void setContentItemsUrl (String contentItemsUrl)
    {
        this.contentItemsUrl = contentItemsUrl;
    }

    public String getRefundFaqUrl ()
    {
        return refundFaqUrl;
    }

    public void setRefundFaqUrl (String refundFaqUrl)
    {
        this.refundFaqUrl = refundFaqUrl;
    }

    public String getVoiceControlEnabled ()
    {
        return voiceControlEnabled;
    }

    public void setVoiceControlEnabled (String voiceControlEnabled)
    {
        this.voiceControlEnabled = voiceControlEnabled;
    }

    public String getAllShowsEnabled ()
    {
        return allShowsEnabled;
    }

    public void setAllShowsEnabled (String allShowsEnabled)
    {
        this.allShowsEnabled = allShowsEnabled;
    }

    public String getSearchPredictiveServiceUrl ()
    {
        return searchPredictiveServiceUrl;
    }

    public void setSearchPredictiveServiceUrl (String searchPredictiveServiceUrl)
    {
        this.searchPredictiveServiceUrl = searchPredictiveServiceUrl;
    }

    public String getMovieMGID ()
    {
        return movieMGID;
    }

    public void setMovieMGID (String movieMGID)
    {
        this.movieMGID = movieMGID;
    }

    public String getRokuMarketingFrameworkEnabled ()
    {
        return rokuMarketingFrameworkEnabled;
    }

    public void setRokuMarketingFrameworkEnabled (String rokuMarketingFrameworkEnabled)
    {
        this.rokuMarketingFrameworkEnabled = rokuMarketingFrameworkEnabled;
    }

    public AuthOptions getAuthOptions ()
    {
        return authOptions;
    }

    public void setAuthOptions (AuthOptions authOptions)
    {
        this.authOptions = authOptions;
    }

    public String getTermsOfServiceUrl ()
    {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl (String termsOfServiceUrl)
    {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getAccentColor ()
    {
        return accentColor;
    }

    public void setAccentColor (String accentColor)
    {
        this.accentColor = accentColor;
    }

    public String getImageServer ()
    {
        return imageServer;
    }

    public void setImageServer (String imageServer)
    {
        this.imageServer = imageServer;
    }

    public String getAppsFlyerEnabled ()
    {
        return appsFlyerEnabled;
    }

    public void setAppsFlyerEnabled (String appsFlyerEnabled)
    {
        this.appsFlyerEnabled = appsFlyerEnabled;
    }

    public String getVideoPlayerAutoHideTime ()
    {
        return videoPlayerAutoHideTime;
    }

    public void setVideoPlayerAutoHideTime (String videoPlayerAutoHideTime)
    {
        this.videoPlayerAutoHideTime = videoPlayerAutoHideTime;
    }

    public String getSearchServiceEnabled ()
    {
        return searchServiceEnabled;
    }

    public void setSearchServiceEnabled (String searchServiceEnabled)
    {
        this.searchServiceEnabled = searchServiceEnabled;
    }

    public EventCollector getEventCollector ()
    {
        return eventCollector;
    }

    public void setEventCollector (EventCollector eventCollector)
    {
        this.eventCollector = eventCollector;
    }

    public String getSeriesMGID ()
    {
        return seriesMGID;
    }

    public void setSeriesMGID (String seriesMGID)
    {
        this.seriesMGID = seriesMGID;
    }

    public String getRatingsRegulationUrl ()
    {
        return ratingsRegulationUrl;
    }

    public void setRatingsRegulationUrl (String ratingsRegulationUrl)
    {
        this.ratingsRegulationUrl = ratingsRegulationUrl;
    }

    public String getImageEP ()
    {
        return imageEP;
    }

    public void setImageEP (String imageEP)
    {
        this.imageEP = imageEP;
    }

    public String getImageMGID ()
    {
        return imageMGID;
    }

    public void setImageMGID (String imageMGID)
    {
        this.imageMGID = imageMGID;
    }

    public String getImageStage ()
    {
        return imageStage;
    }

    public void setImageStage (String imageStage)
    {
        this.imageStage = imageStage;
    }

    public String getUpNextOverlayEnabled ()
    {
        return upNextOverlayEnabled;
    }

    public void setUpNextOverlayEnabled (String upNextOverlayEnabled)
    {
        this.upNextOverlayEnabled = upNextOverlayEnabled;
    }

    public String getDisplayLocksEnabled ()
    {
        return displayLocksEnabled;
    }

    public void setDisplayLocksEnabled (String displayLocksEnabled)
    {
        this.displayLocksEnabled = displayLocksEnabled;
    }

    public String getAvailabilityServiceUrl ()
    {
        return availabilityServiceUrl;
    }

    public void setAvailabilityServiceUrl (String availabilityServiceUrl)
    {
        this.availabilityServiceUrl = availabilityServiceUrl;
    }

    public String getShowOnboarding ()
    {
        return showOnboarding;
    }

    public void setShowOnboarding (String showOnboarding)
    {
        this.showOnboarding = showOnboarding;
    }

    public String getAbTestsNotifyUrl ()
    {
        return abTestsNotifyUrl;
    }

    public void setAbTestsNotifyUrl (String abTestsNotifyUrl)
    {
        this.abTestsNotifyUrl = abTestsNotifyUrl;
    }

    public String getDisplayLiveTVForAllUsers ()
    {
        return displayLiveTVForAllUsers;
    }

    public void setDisplayLiveTVForAllUsers (String displayLiveTVForAllUsers)
    {
        this.displayLiveTVForAllUsers = displayLiveTVForAllUsers;
    }

    public String getBackgroundServiceURL ()
    {
        return backgroundServiceURL;
    }

    public void setBackgroundServiceURL (String backgroundServiceURL)
    {
        this.backgroundServiceURL = backgroundServiceURL;
    }

    public String getChromeCastEnabled ()
    {
        return chromeCastEnabled;
    }

    public void setChromeCastEnabled (String chromeCastEnabled)
    {
        this.chromeCastEnabled = chromeCastEnabled;
    }

    public String getBrazeEnabled ()
    {
        return brazeEnabled;
    }

    public void setBrazeEnabled (String brazeEnabled)
    {
        this.brazeEnabled = brazeEnabled;
    }

    public String getCustomerSupportEmail ()
    {
        return customerSupportEmail;
    }

    public void setCustomerSupportEmail (String customerSupportEmail)
    {
        this.customerSupportEmail = customerSupportEmail;
    }

    public String getTvRatingsUrl ()
    {
        return tvRatingsUrl;
    }

    public void setTvRatingsUrl (String tvRatingsUrl)
    {
        this.tvRatingsUrl = tvRatingsUrl;
    }

    public String getUvpPlayerEnabled ()
    {
        return uvpPlayerEnabled;
    }

    public void setUvpPlayerEnabled (String uvpPlayerEnabled)
    {
        this.uvpPlayerEnabled = uvpPlayerEnabled;
    }

    public EndpointUrls getEndpointUrls ()
    {
        return endpointUrls;
    }

    public void setEndpointUrls (EndpointUrls endpointUrls)
    {
        this.endpointUrls = endpointUrls;
    }

    public Screens[] getScreens ()
    {
        return screens;
    }

    public void setScreens (Screens[] screens)
    {
        this.screens = screens;
    }

    public String getClosedCaptionSupportUrl ()
    {
        return closedCaptionSupportUrl;
    }

    public void setClosedCaptionSupportUrl (String closedCaptionSupportUrl)
    {
        this.closedCaptionSupportUrl = closedCaptionSupportUrl;
    }

    public String getMoatEnabled ()
    {
        return moatEnabled;
    }

    public void setMoatEnabled (String moatEnabled)
    {
        this.moatEnabled = moatEnabled;
    }

    public String getSearchServiceUrl ()
    {
        return searchServiceUrl;
    }

    public void setSearchServiceUrl (String searchServiceUrl)
    {
        this.searchServiceUrl = searchServiceUrl;
    }

    public String getLiveMGID ()
    {
        return liveMGID;
    }

    public void setLiveMGID (String liveMGID)
    {
        this.liveMGID = liveMGID;
    }

    public String getMarketingEnabled ()
    {
        return marketingEnabled;
    }

    public void setMarketingEnabled (String marketingEnabled)
    {
        this.marketingEnabled = marketingEnabled;
    }

    public String getPrivacyPolicyChangesUrl ()
    {
        return privacyPolicyChangesUrl;
    }

    public void setPrivacyPolicyChangesUrl (String privacyPolicyChangesUrl)
    {
        this.privacyPolicyChangesUrl = privacyPolicyChangesUrl;
    }

    public String getVideoMGID ()
    {
        return videoMGID;
    }

    public void setVideoMGID (String videoMGID)
    {
        this.videoMGID = videoMGID;
    }

    public String getVideogameMGID ()
    {
        return videogameMGID;
    }

    public void setVideogameMGID (String videogameMGID)
    {
        this.videogameMGID = videogameMGID;
    }

    public String getCanSkipSubscriptionScreen ()
    {
        return canSkipSubscriptionScreen;
    }

    public void setCanSkipSubscriptionScreen (String canSkipSubscriptionScreen)
    {
        this.canSkipSubscriptionScreen = canSkipSubscriptionScreen;
    }

    public String getAppName ()
    {
        return appName;
    }

    public void setAppName (String appName)
    {
        this.appName = appName;
    }

    public String getTveAuthenticationEnabled ()
    {
        return tveAuthenticationEnabled;
    }

    public void setTveAuthenticationEnabled (String tveAuthenticationEnabled)
    {
        this.tveAuthenticationEnabled = tveAuthenticationEnabled;
    }

    public EnabledBrands[] getEnabledBrands ()
    {
        return enabledBrands;
    }

    public void setEnabledBrands (EnabledBrands[] enabledBrands)
    {
        this.enabledBrands = enabledBrands;
    }

    public String getAdjustEnabled ()
    {
        return adjustEnabled;
    }

    public void setAdjustEnabled (String adjustEnabled)
    {
        this.adjustEnabled = adjustEnabled;
    }

    public String getPropertyFeedUrl ()
    {
        return propertyFeedUrl;
    }

    public void setPropertyFeedUrl (String propertyFeedUrl)
    {
        this.propertyFeedUrl = propertyFeedUrl;
    }

    public String getBackgroundServiceVideoEnabled ()
    {
        return backgroundServiceVideoEnabled;
    }

    public void setBackgroundServiceVideoEnabled (String backgroundServiceVideoEnabled)
    {
        this.backgroundServiceVideoEnabled = backgroundServiceVideoEnabled;
    }

    public String getAdChoicesDisclosureUrl ()
    {
        return adChoicesDisclosureUrl;
    }

    public void setAdChoicesDisclosureUrl (String adChoicesDisclosureUrl)
    {
        this.adChoicesDisclosureUrl = adChoicesDisclosureUrl;
    }

    public String getPrivacyPolicyUrl ()
    {
        return privacyPolicyUrl;
    }

    public void setPrivacyPolicyUrl (String privacyPolicyUrl)
    {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public String getUrlKey ()
    {
        return urlKey;
    }

    public void setUrlKey (String urlKey)
    {
        this.urlKey = urlKey;
    }

    public String getEpisodeMGID ()
    {
        return episodeMGID;
    }

    public void setEpisodeMGID (String episodeMGID)
    {
        this.episodeMGID = episodeMGID;
    }

    public List<String>  getSearchTypes ()
    {
        return searchTypes;
    }

    public void setSearchTypes (List<String> searchTypes)
    {
        this.searchTypes = searchTypes;
    }

    public String getAirplayEnabled ()
    {
        return airplayEnabled;
    }

    public void setAirplayEnabled (String airplayEnabled)
    {
        this.airplayEnabled = airplayEnabled;
    }

    public String getEuDsmEnabled ()
    {
        return euDsmEnabled;
    }

    public void setEuDsmEnabled (String euDsmEnabled)
    {
        this.euDsmEnabled = euDsmEnabled;
    }

    public String getBalaLatestUpdatedTimeStamp ()
    {
        return balaLatestUpdatedTimeStamp;
    }

    public void setBalaLatestUpdatedTimeStamp (String balaLatestUpdatedTimeStamp)
    {
        this.balaLatestUpdatedTimeStamp = balaLatestUpdatedTimeStamp;
    }

    public String getShortForm ()
    {
        return shortForm;
    }

    public void setShortForm (String shortForm)
    {
        this.shortForm = shortForm;
    }

    public String getEbookMGID ()
    {
        return ebookMGID;
    }

    public void setEbookMGID (String ebookMGID)
    {
        this.ebookMGID = ebookMGID;
    }

    public String getPrivacyPolicyFaqsUrl ()
    {
        return privacyPolicyFaqsUrl;
    }

    public void setPrivacyPolicyFaqsUrl (String privacyPolicyFaqsUrl)
    {
        this.privacyPolicyFaqsUrl = privacyPolicyFaqsUrl;
    }

    public String getApptentiveEnabled ()
    {
        return apptentiveEnabled;
    }

    public void setApptentiveEnabled (String apptentiveEnabled)
    {
        this.apptentiveEnabled = apptentiveEnabled;
    }

    public String getClipPrerollsEnabled ()
    {
        return clipPrerollsEnabled;
    }

    public void setClipPrerollsEnabled (String clipPrerollsEnabled)
    {
        this.clipPrerollsEnabled = clipPrerollsEnabled;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [helpshiftEnabled = "+helpshiftEnabled+", abTestsPrefetchUrl = "+abTestsPrefetchUrl+", searchPredictiveServiceEnabled = "+searchPredictiveServiceEnabled+", pageSize = "+pageSize+", contentBuckets = "+contentBuckets+", facebookAnalyticsEnabled = "+facebookAnalyticsEnabled+", ageGatePass = "+ageGatePass+", gdprEnabled = "+gdprEnabled+", templateZones = "+templateZones+", tuneEnabled = "+tuneEnabled+", copyrightNoticeUrl = "+copyrightNoticeUrl+", eulaUrl = "+eulaUrl+", fetchPlayheads = "+fetchPlayheads+", principalEnabled = "+principalEnabled+", displayTVEPromptAtStartup = "+displayTVEPromptAtStartup+", eventMGID = "+eventMGID+", trendingSearchUrl = "+trendingSearchUrl+", playlistMGID = "+playlistMGID+", backgroundServiceEP = "+backgroundServiceEP+", id = "+id+", contentItemsUrl = "+contentItemsUrl+", refundFaqUrl = "+refundFaqUrl+", voiceControlEnabled = "+voiceControlEnabled+", allShowsEnabled = "+allShowsEnabled+", searchPredictiveServiceUrl = "+searchPredictiveServiceUrl+", movieMGID = "+movieMGID+", rokuMarketingFrameworkEnabled = "+rokuMarketingFrameworkEnabled+", authOptions = "+authOptions+", termsOfServiceUrl = "+termsOfServiceUrl+", accentColor = "+accentColor+", imageServer = "+imageServer+", appsFlyerEnabled = "+appsFlyerEnabled+", videoPlayerAutoHideTime = "+videoPlayerAutoHideTime+", searchServiceEnabled = "+searchServiceEnabled+", eventCollector = "+eventCollector+", seriesMGID = "+seriesMGID+", ratingsRegulationUrl = "+ratingsRegulationUrl+", imageEP = "+imageEP+", imageMGID = "+imageMGID+", imageStage = "+imageStage+", upNextOverlayEnabled = "+upNextOverlayEnabled+", displayLocksEnabled = "+displayLocksEnabled+", availabilityServiceUrl = "+availabilityServiceUrl+", showOnboarding = "+showOnboarding+", abTestsNotifyUrl = "+abTestsNotifyUrl+", displayLiveTVForAllUsers = "+displayLiveTVForAllUsers+", backgroundServiceURL = "+backgroundServiceURL+", chromeCastEnabled = "+chromeCastEnabled+", brazeEnabled = "+brazeEnabled+", customerSupportEmail = "+customerSupportEmail+", tvRatingsUrl = "+tvRatingsUrl+", uvpPlayerEnabled = "+uvpPlayerEnabled+", endpointUrls = "+endpointUrls+", screens = "+screens+", closedCaptionSupportUrl = "+closedCaptionSupportUrl+", moatEnabled = "+moatEnabled+", searchServiceUrl = "+searchServiceUrl+", liveMGID = "+liveMGID+", marketingEnabled = "+marketingEnabled+", privacyPolicyChangesUrl = "+privacyPolicyChangesUrl+", videoMGID = "+videoMGID+", videogameMGID = "+videogameMGID+", canSkipSubscriptionScreen = "+canSkipSubscriptionScreen+", appName = "+appName+", tveAuthenticationEnabled = "+tveAuthenticationEnabled+", enabledBrands = "+enabledBrands+", adjustEnabled = "+adjustEnabled+", propertyFeedUrl = "+propertyFeedUrl+", backgroundServiceVideoEnabled = "+backgroundServiceVideoEnabled+", adChoicesDisclosureUrl = "+adChoicesDisclosureUrl+", privacyPolicyUrl = "+privacyPolicyUrl+", urlKey = "+urlKey+", episodeMGID = "+episodeMGID+", searchTypes = "+searchTypes+", airplayEnabled = "+airplayEnabled+", euDsmEnabled = "+euDsmEnabled+", balaLatestUpdatedTimeStamp = "+balaLatestUpdatedTimeStamp+", shortForm = "+shortForm+", ebookMGID = "+ebookMGID+", privacyPolicyFaqsUrl = "+privacyPolicyFaqsUrl+", apptentiveEnabled = "+apptentiveEnabled+", clipPrerollsEnabled = "+clipPrerollsEnabled+"]";
    }
    
}
