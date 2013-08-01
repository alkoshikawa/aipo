package com.aimluck.eip.cayenne.om.account.auto;

/** Class _JetspeedUserProfile was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _JetspeedUserProfile extends org.apache.cayenne.CayenneDataObject {

    public static final String COUNTRY_PROPERTY = "country";
    public static final String LANGUAGE_PROPERTY = "language";
    public static final String MEDIA_TYPE_PROPERTY = "mediaType";
    public static final String PAGE_PROPERTY = "page";
    public static final String PROFILE_PROPERTY = "profile";
    public static final String USER_NAME_PROPERTY = "userName";

    public static final String PSML_ID_PK_COLUMN = "PSML_ID";

    public void setCountry(String country) {
        writeProperty("country", country);
    }
    public String getCountry() {
        return (String)readProperty("country");
    }
    
    
    public void setLanguage(String language) {
        writeProperty("language", language);
    }
    public String getLanguage() {
        return (String)readProperty("language");
    }
    
    
    public void setMediaType(String mediaType) {
        writeProperty("mediaType", mediaType);
    }
    public String getMediaType() {
        return (String)readProperty("mediaType");
    }
    
    
    public void setPage(String page) {
        writeProperty("page", page);
    }
    public String getPage() {
        return (String)readProperty("page");
    }
    
    
    public void setProfile(byte[] profile) {
        writeProperty("profile", profile);
    }
    public byte[] getProfile() {
        return (byte[])readProperty("profile");
    }
    
    
    public void setUserName(String userName) {
        writeProperty("userName", userName);
    }
    public String getUserName() {
        return (String)readProperty("userName");
    }
    
    
}
