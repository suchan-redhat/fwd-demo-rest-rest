
package com.fwd.demo.beans.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "__type",
    "AppFrom",
    "Channel",
    "Company",
    "Lang",
    "ProductName",
    "System",
    "UserID",
    "Source",
    "DataQuotation"
})
public class InternalRequest {

    @JsonProperty("__type")
    private String type;
    @JsonProperty("AppFrom")
    private String appFrom;
    @JsonProperty("Channel")
    private String channel;
    @JsonProperty("Company")
    private String company;
    @JsonProperty("Lang")
    private String lang;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("System")
    private String system;
    @JsonProperty("UserID")
    private String userID;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("DataQuotation")
    private DataQuotation dataQuotation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("__type")
    public String getType() {
        return type;
    }

    @JsonProperty("__type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("AppFrom")
    public String getAppFrom() {
        return appFrom;
    }

    @JsonProperty("AppFrom")
    public void setAppFrom(String appFrom) {
        this.appFrom = appFrom;
    }

    @JsonProperty("Channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("Channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("Company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("Company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("Lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("Lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("System")
    public String getSystem() {
        return system;
    }

    @JsonProperty("System")
    public void setSystem(String system) {
        this.system = system;
    }

    @JsonProperty("UserID")
    public String getUserID() {
        return userID;
    }

    @JsonProperty("UserID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("DataQuotation")
    public DataQuotation getDataQuotation() {
        return dataQuotation;
    }

    @JsonProperty("DataQuotation")
    public void setDataQuotation(DataQuotation dataQuotation) {
        this.dataQuotation = dataQuotation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
