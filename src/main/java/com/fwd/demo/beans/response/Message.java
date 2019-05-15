
package com.fwd.demo.beans.response;

import java.util.HashMap;
import java.util.List;
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
    "ErrorAction",
    "ErrorFlag",
    "ErrorMessage",
    "ErrorCode",
    "InformationFlag",
    "InformationMessage",
    "WarningFlag",
    "WarningMessage"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

	
	@XmlElement
    @JsonProperty("ErrorAction")
    private List<Object> errorAction = null;
	
	@XmlElement
    @JsonProperty("ErrorFlag")
    private Boolean errorFlag;
	
	@XmlElement
    @JsonProperty("ErrorMessage")
    private List<Object> errorMessage = null;
    
    @XmlElement
    @JsonProperty("ErrorCode")
    private List<Object> errorCode = null;
    
    @XmlElement
    @JsonProperty("InformationFlag")
    private Boolean informationFlag;
    
    @XmlElement
    @JsonProperty("InformationMessage")
    private List<Object> informationMessage = null;
    
    @XmlElement
    @JsonProperty("WarningFlag")
    private Boolean warningFlag;
    
    @XmlElement
    @JsonProperty("WarningMessage")
    private List<Object> warningMessage = null;
    
    @XmlTransient
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ErrorAction")
    public List<Object> getErrorAction() {
        return errorAction;
    }

    @JsonProperty("ErrorAction")
    public void setErrorAction(List<Object> errorAction) {
        this.errorAction = errorAction;
    }

    @JsonProperty("ErrorFlag")
    public Boolean getErrorFlag() {
        return errorFlag;
    }

    @JsonProperty("ErrorFlag")
    public void setErrorFlag(Boolean errorFlag) {
        this.errorFlag = errorFlag;
    }

    @JsonProperty("ErrorMessage")
    public List<Object> getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("ErrorMessage")
    public void setErrorMessage(List<Object> errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("ErrorCode")
    public List<Object> getErrorCode() {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(List<Object> errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("InformationFlag")
    public Boolean getInformationFlag() {
        return informationFlag;
    }

    @JsonProperty("InformationFlag")
    public void setInformationFlag(Boolean informationFlag) {
        this.informationFlag = informationFlag;
    }

    @JsonProperty("InformationMessage")
    public List<Object> getInformationMessage() {
        return informationMessage;
    }

    @JsonProperty("InformationMessage")
    public void setInformationMessage(List<Object> informationMessage) {
        this.informationMessage = informationMessage;
    }

    @JsonProperty("WarningFlag")
    public Boolean getWarningFlag() {
        return warningFlag;
    }

    @JsonProperty("WarningFlag")
    public void setWarningFlag(Boolean warningFlag) {
        this.warningFlag = warningFlag;
    }

    @JsonProperty("WarningMessage")
    public List<Object> getWarningMessage() {
        return warningMessage;
    }

    @JsonProperty("WarningMessage")
    public void setWarningMessage(List<Object> warningMessage) {
        this.warningMessage = warningMessage;
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
