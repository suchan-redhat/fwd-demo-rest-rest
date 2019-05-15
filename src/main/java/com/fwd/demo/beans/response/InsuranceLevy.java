
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
    "LevyAmount",
    "LevyCap",
    "LevyRate",
    "LevyEffectiveDate",
    "LevyEffectiveDateStr"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InsuranceLevy {

	
	@XmlElement
    @JsonProperty("LevyAmount")
    private Double levyAmount;
	
	@XmlElement
    @JsonProperty("LevyCap")
    private Double levyCap;
	
	@XmlElement
    @JsonProperty("LevyRate")
    private Double levyRate;
	
	@XmlElement
    @JsonProperty("LevyEffectiveDate")
    private String levyEffectiveDate;
	
	@XmlElement
    @JsonProperty("LevyEffectiveDateStr")
    private String levyEffectiveDateStr;
	
	@XmlTransient
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LevyAmount")
    public Double getLevyAmount() {
        return levyAmount;
    }

    @JsonProperty("LevyAmount")
    public void setLevyAmount(Double levyAmount) {
        this.levyAmount = levyAmount;
    }

    @JsonProperty("LevyCap")
    public Double getLevyCap() {
        return levyCap;
    }

    @JsonProperty("LevyCap")
    public void setLevyCap(Double levyCap) {
        this.levyCap = levyCap;
    }

    @JsonProperty("LevyRate")
    public Double getLevyRate() {
        return levyRate;
    }

    @JsonProperty("LevyRate")
    public void setLevyRate(Double levyRate) {
        this.levyRate = levyRate;
    }

    @JsonProperty("LevyEffectiveDate")
    public String getLevyEffectiveDate() {
        return levyEffectiveDate;
    }

    @JsonProperty("LevyEffectiveDate")
    public void setLevyEffectiveDate(String levyEffectiveDate) {
        this.levyEffectiveDate = levyEffectiveDate;
    }

    @JsonProperty("LevyEffectiveDateStr")
    public String getLevyEffectiveDateStr() {
        return levyEffectiveDateStr;
    }

    @JsonProperty("LevyEffectiveDateStr")
    public void setLevyEffectiveDateStr(String levyEffectiveDateStr) {
        this.levyEffectiveDateStr = levyEffectiveDateStr;
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
