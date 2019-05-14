
package com.fwd.demo.beans.response;

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
    "BusinessSource",
    "DiscountParty",
    "Intermediary",
    "IsCommissionOverride",
    "PolicyEndorsement",
    "PolicyRenewal",
    "PriceInfo",
    "RequestVer",
    "System",
    "TransactionStatus",
    "eWalletFlag",
    "ApproveDateStr",
    "ChildCover",
    "ChildInput",
    "CommencementDateStr",
    "Corporate",
    "ExpiryDateStr",
    "InsuredSummary",
    "IssueDateStr",
    "Noofday",
    "OtherInput",
    "Plan",
    "PlanB",
    "PlanBPriceInfo",
    "SelfCover",
    "SpouseCover",
    "TransactionDateStr"
})
public class DataQuotation {

    @JsonProperty("__type")
    private String type;
    @JsonProperty("BusinessSource")
    private Integer businessSource;
    @JsonProperty("DiscountParty")
    private DiscountParty discountParty;
    @JsonProperty("Intermediary")
    private Intermediary intermediary;
    @JsonProperty("IsCommissionOverride")
    private Boolean isCommissionOverride;
    @JsonProperty("PolicyEndorsement")
    private Integer policyEndorsement;
    @JsonProperty("PolicyRenewal")
    private Integer policyRenewal;
    @JsonProperty("PriceInfo")
    private PriceInfo priceInfo;
    @JsonProperty("RequestVer")
    private Integer requestVer;
    @JsonProperty("System")
    private String system;
    @JsonProperty("TransactionStatus")
    private Integer transactionStatus;
    @JsonProperty("eWalletFlag")
    private Boolean eWalletFlag;
    @JsonProperty("ApproveDateStr")
    private String approveDateStr;
    @JsonProperty("ChildCover")
    private Boolean childCover;
    @JsonProperty("ChildInput")
    private Integer childInput;
    @JsonProperty("CommencementDateStr")
    private String commencementDateStr;
    @JsonProperty("Corporate")
    private Boolean corporate;
    @JsonProperty("ExpiryDateStr")
    private String expiryDateStr;
    @JsonProperty("InsuredSummary")
    private InsuredSummary insuredSummary;
    @JsonProperty("IssueDateStr")
    private String issueDateStr;
    @JsonProperty("Noofday")
    private Integer noofday;
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
    @JsonProperty("TransactionDateStr")
    private String transactionDateStr;
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

    @JsonProperty("BusinessSource")
    public Integer getBusinessSource() {
        return businessSource;
    }

    @JsonProperty("BusinessSource")
    public void setBusinessSource(Integer businessSource) {
        this.businessSource = businessSource;
    }

    @JsonProperty("DiscountParty")
    public DiscountParty getDiscountParty() {
        return discountParty;
    }

    @JsonProperty("DiscountParty")
    public void setDiscountParty(DiscountParty discountParty) {
        this.discountParty = discountParty;
    }

    @JsonProperty("Intermediary")
    public Intermediary getIntermediary() {
        return intermediary;
    }

    @JsonProperty("Intermediary")
    public void setIntermediary(Intermediary intermediary) {
        this.intermediary = intermediary;
    }

    @JsonProperty("IsCommissionOverride")
    public Boolean getIsCommissionOverride() {
        return isCommissionOverride;
    }

    @JsonProperty("IsCommissionOverride")
    public void setIsCommissionOverride(Boolean isCommissionOverride) {
        this.isCommissionOverride = isCommissionOverride;
    }

    @JsonProperty("PolicyEndorsement")
    public Integer getPolicyEndorsement() {
        return policyEndorsement;
    }

    @JsonProperty("PolicyEndorsement")
    public void setPolicyEndorsement(Integer policyEndorsement) {
        this.policyEndorsement = policyEndorsement;
    }

    @JsonProperty("PolicyRenewal")
    public Integer getPolicyRenewal() {
        return policyRenewal;
    }

    @JsonProperty("PolicyRenewal")
    public void setPolicyRenewal(Integer policyRenewal) {
        this.policyRenewal = policyRenewal;
    }

    @JsonProperty("PriceInfo")
    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    @JsonProperty("PriceInfo")
    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    @JsonProperty("RequestVer")
    public Integer getRequestVer() {
        return requestVer;
    }

    @JsonProperty("RequestVer")
    public void setRequestVer(Integer requestVer) {
        this.requestVer = requestVer;
    }

    @JsonProperty("System")
    public String getSystem() {
        return system;
    }

    @JsonProperty("System")
    public void setSystem(String system) {
        this.system = system;
    }

    @JsonProperty("TransactionStatus")
    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("TransactionStatus")
    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @JsonProperty("eWalletFlag")
    public Boolean getEWalletFlag() {
        return eWalletFlag;
    }

    @JsonProperty("eWalletFlag")
    public void setEWalletFlag(Boolean eWalletFlag) {
        this.eWalletFlag = eWalletFlag;
    }

    @JsonProperty("ApproveDateStr")
    public String getApproveDateStr() {
        return approveDateStr;
    }

    @JsonProperty("ApproveDateStr")
    public void setApproveDateStr(String approveDateStr) {
        this.approveDateStr = approveDateStr;
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

    @JsonProperty("Corporate")
    public Boolean getCorporate() {
        return corporate;
    }

    @JsonProperty("Corporate")
    public void setCorporate(Boolean corporate) {
        this.corporate = corporate;
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

    @JsonProperty("IssueDateStr")
    public String getIssueDateStr() {
        return issueDateStr;
    }

    @JsonProperty("IssueDateStr")
    public void setIssueDateStr(String issueDateStr) {
        this.issueDateStr = issueDateStr;
    }

    @JsonProperty("Noofday")
    public Integer getNoofday() {
        return noofday;
    }

    @JsonProperty("Noofday")
    public void setNoofday(Integer noofday) {
        this.noofday = noofday;
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

    @JsonProperty("TransactionDateStr")
    public String getTransactionDateStr() {
        return transactionDateStr;
    }

    @JsonProperty("TransactionDateStr")
    public void setTransactionDateStr(String transactionDateStr) {
        this.transactionDateStr = transactionDateStr;
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
