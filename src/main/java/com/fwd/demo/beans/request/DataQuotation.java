
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
    "DiscountParty",
    "ChildCover",
    "ChildInput",
    "CommencementDateStr",
    "ExpiryDateStr",
    "InsuredSummary",
    "OtherInput",
    "Plan",
    "PlanB",
    "PlanBPriceInfo",
    "SelfCover",
    "SpouseCover"
})
public class DataQuotation {

    @JsonProperty("__type")
    private String type;
    @JsonProperty("DiscountParty")
    private DiscountParty discountParty;
    @JsonProperty("ChildCover")
    private Boolean childCover;
    @JsonProperty("ChildInput")
    private Integer childInput;
    @JsonProperty("CommencementDateStr")
    private String commencementDateStr;
    @JsonProperty("ExpiryDateStr")
    private String expiryDateStr;
    @JsonProperty("InsuredSummary")
    private InsuredSummary insuredSummary;
    @JsonProperty("OtherInput")
    private Integer otherInput;
    @JsonProperty("Plan")
    private String plan;
    @JsonProperty("PlanB")
    private String planB;
    @JsonProperty("PlanBPriceInfo")
    private PlanBPriceInfo planBPriceInfo;
    @JsonProperty("SelfCover")
    private Boolean selfCover;
    @JsonProperty("SpouseCover")
    private Boolean spouseCover;
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

    @JsonProperty("DiscountParty")
    public DiscountParty getDiscountParty() {
        return discountParty;
    }

    @JsonProperty("DiscountParty")
    public void setDiscountParty(DiscountParty discountParty) {
        this.discountParty = discountParty;
    }

    @JsonProperty("ChildCover")
    public Boolean getChildCover() {
        return childCover;
    }

    @JsonProperty("ChildCover")
    public void setChildCover(Boolean childCover) {
        this.childCover = childCover;
    }

    @JsonProperty("ChildInput")
    public Integer getChildInput() {
        return childInput;
    }

    @JsonProperty("ChildInput")
    public void setChildInput(Integer childInput) {
        this.childInput = childInput;
    }

    @JsonProperty("CommencementDateStr")
    public String getCommencementDateStr() {
        return commencementDateStr;
    }

    @JsonProperty("CommencementDateStr")
    public void setCommencementDateStr(String commencementDateStr) {
        this.commencementDateStr = commencementDateStr;
    }

    @JsonProperty("ExpiryDateStr")
    public String getExpiryDateStr() {
        return expiryDateStr;
    }

    @JsonProperty("ExpiryDateStr")
    public void setExpiryDateStr(String expiryDateStr) {
        this.expiryDateStr = expiryDateStr;
    }

    @JsonProperty("InsuredSummary")
    public InsuredSummary getInsuredSummary() {
        return insuredSummary;
    }

    @JsonProperty("InsuredSummary")
    public void setInsuredSummary(InsuredSummary insuredSummary) {
        this.insuredSummary = insuredSummary;
    }

    @JsonProperty("OtherInput")
    public Integer getOtherInput() {
        return otherInput;
    }

    @JsonProperty("OtherInput")
    public void setOtherInput(Integer otherInput) {
        this.otherInput = otherInput;
    }

    @JsonProperty("Plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("Plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("PlanB")
    public String getPlanB() {
        return planB;
    }

    @JsonProperty("PlanB")
    public void setPlanB(String planB) {
        this.planB = planB;
    }

    @JsonProperty("PlanBPriceInfo")
    public PlanBPriceInfo getPlanBPriceInfo() {
        return planBPriceInfo;
    }

    @JsonProperty("PlanBPriceInfo")
    public void setPlanBPriceInfo(PlanBPriceInfo planBPriceInfo) {
        this.planBPriceInfo = planBPriceInfo;
    }

    @JsonProperty("SelfCover")
    public Boolean getSelfCover() {
        return selfCover;
    }

    @JsonProperty("SelfCover")
    public void setSelfCover(Boolean selfCover) {
        this.selfCover = selfCover;
    }

    @JsonProperty("SpouseCover")
    public Boolean getSpouseCover() {
        return spouseCover;
    }

    @JsonProperty("SpouseCover")
    public void setSpouseCover(Boolean spouseCover) {
        this.spouseCover = spouseCover;
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
