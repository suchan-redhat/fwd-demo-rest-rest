
package com.fwd.demo.beans.response;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "systemError",
    "IsSystemError",
    "Result",
    "Message",
    "DataQuotation"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InternalResponse {

	
	@XmlElement
    @JsonProperty("systemError")
    private Boolean systemError;
	
	@XmlElement
    @JsonProperty("IsSystemError")
    private Boolean isSystemError;
	
	@XmlElement
    @JsonProperty("Result")
    private Boolean result;
	
	@XmlElement
    @JsonProperty("Message")
    private Message message;
	
	@XmlElement
    @JsonProperty("DataQuotation")
    private DataQuotation dataQuotation;
	
	@XmlTransient
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("systemError")
    public Boolean getSystemError() {
        return systemError;
    }

    @JsonProperty("systemError")
    public void setSystemError(Boolean systemError) {
        this.systemError = systemError;
    }

    @JsonProperty("IsSystemError")
    public Boolean getIsSystemError() {
        return isSystemError;
    }

    @JsonProperty("IsSystemError")
    public void setIsSystemError(Boolean isSystemError) {
        this.isSystemError = isSystemError;
    }

    @JsonProperty("Result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    @JsonProperty("Message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Message message) {
        this.message = message;
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
