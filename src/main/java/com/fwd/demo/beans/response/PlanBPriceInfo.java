
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
    "__type",
    "AfterCoupon",
    "Commission",
    "CommissionAmount",
    "CommissionChange",
    "CouponAmount",
    "DirectDAmount",
    "DirectDiscount",
    "DirectDiscountChange",
    "GrossPremium",
    "GroupDAmount",
    "GroupDiscount",
    "GroupDiscountChange",
    "Levy",
    "LevyAmount",
    "NetPremium",
    "SaleDAmount",
    "SaleDiscount",
    "Tax",
    "TaxAmount",
    "TotalDue",
    "InsuranceLevy"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanBPriceInfo {

	@XmlElement
    @JsonProperty("__type")
    private String type;
	
	@XmlElement
    @JsonProperty("AfterCoupon")
    private Integer afterCoupon;
	
	@XmlElement
    @JsonProperty("Commission")
    private Double commission;
	
	@XmlElement
    @JsonProperty("CommissionAmount")
    private Double commissionAmount;
	
	@XmlElement
    @JsonProperty("CommissionChange")
    private Double commissionChange;
	
	@XmlElement
    @JsonProperty("CouponAmount")
    private Integer couponAmount;
	
	@XmlElement
    @JsonProperty("DirectDAmount")
    private Integer directDAmount;
	
	@XmlElement
    @JsonProperty("DirectDiscount")
    private Integer directDiscount;
	
	@XmlElement
    @JsonProperty("DirectDiscountChange")
    private Integer directDiscountChange;
	
	@XmlElement
    @JsonProperty("GrossPremium")
    private Integer grossPremium;
    
    @XmlElement
    @JsonProperty("GroupDAmount")
    private Integer groupDAmount;
    
    @XmlElement
    @JsonProperty("GroupDiscount")
    private Integer groupDiscount;
    
    @XmlElement
    @JsonProperty("GroupDiscountChange")
    private Integer groupDiscountChange;
    
    @XmlElement
    @JsonProperty("Levy")
    private Integer levy;
    
    @XmlElement
    @JsonProperty("LevyAmount")
    private Integer levyAmount;
    
    @XmlElement
    @JsonProperty("NetPremium")
    private Double netPremium;
    
    @XmlElement
    @JsonProperty("SaleDAmount")
    private Integer saleDAmount;
    
    @XmlElement
    @JsonProperty("SaleDiscount")
    private Integer saleDiscount;
    
    @XmlElement
    @JsonProperty("Tax")
    private Integer tax;
    
    @XmlElement
    @JsonProperty("TaxAmount")
    private Integer taxAmount;
    
    @XmlElement
    @JsonProperty("TotalDue")
    private Double totalDue;
    
    @XmlElement
    @JsonProperty("InsuranceLevy")
    private InsuranceLevy insuranceLevy;
    
    @XmlTransient
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

    @JsonProperty("AfterCoupon")
    public Integer getAfterCoupon() {
        return afterCoupon;
    }

    @JsonProperty("AfterCoupon")
    public void setAfterCoupon(Integer afterCoupon) {
        this.afterCoupon = afterCoupon;
    }

    @JsonProperty("Commission")
    public Double getCommission() {
        return commission;
    }

    @JsonProperty("Commission")
    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @JsonProperty("CommissionAmount")
    public Double getCommissionAmount() {
        return commissionAmount;
    }

    @JsonProperty("CommissionAmount")
    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    @JsonProperty("CommissionChange")
    public Double getCommissionChange() {
        return commissionChange;
    }

    @JsonProperty("CommissionChange")
    public void setCommissionChange(Double commissionChange) {
        this.commissionChange = commissionChange;
    }

    @JsonProperty("CouponAmount")
    public Integer getCouponAmount() {
        return couponAmount;
    }

    @JsonProperty("CouponAmount")
    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    @JsonProperty("DirectDAmount")
    public Integer getDirectDAmount() {
        return directDAmount;
    }

    @JsonProperty("DirectDAmount")
    public void setDirectDAmount(Integer directDAmount) {
        this.directDAmount = directDAmount;
    }

    @JsonProperty("DirectDiscount")
    public Integer getDirectDiscount() {
        return directDiscount;
    }

    @JsonProperty("DirectDiscount")
    public void setDirectDiscount(Integer directDiscount) {
        this.directDiscount = directDiscount;
    }

    @JsonProperty("DirectDiscountChange")
    public Integer getDirectDiscountChange() {
        return directDiscountChange;
    }

    @JsonProperty("DirectDiscountChange")
    public void setDirectDiscountChange(Integer directDiscountChange) {
        this.directDiscountChange = directDiscountChange;
    }

    @JsonProperty("GrossPremium")
    public Integer getGrossPremium() {
        return grossPremium;
    }

    @JsonProperty("GrossPremium")
    public void setGrossPremium(Integer grossPremium) {
        this.grossPremium = grossPremium;
    }

    @JsonProperty("GroupDAmount")
    public Integer getGroupDAmount() {
        return groupDAmount;
    }

    @JsonProperty("GroupDAmount")
    public void setGroupDAmount(Integer groupDAmount) {
        this.groupDAmount = groupDAmount;
    }

    @JsonProperty("GroupDiscount")
    public Integer getGroupDiscount() {
        return groupDiscount;
    }

    @JsonProperty("GroupDiscount")
    public void setGroupDiscount(Integer groupDiscount) {
        this.groupDiscount = groupDiscount;
    }

    @JsonProperty("GroupDiscountChange")
    public Integer getGroupDiscountChange() {
        return groupDiscountChange;
    }

    @JsonProperty("GroupDiscountChange")
    public void setGroupDiscountChange(Integer groupDiscountChange) {
        this.groupDiscountChange = groupDiscountChange;
    }

    @JsonProperty("Levy")
    public Integer getLevy() {
        return levy;
    }

    @JsonProperty("Levy")
    public void setLevy(Integer levy) {
        this.levy = levy;
    }

    @JsonProperty("LevyAmount")
    public Integer getLevyAmount() {
        return levyAmount;
    }

    @JsonProperty("LevyAmount")
    public void setLevyAmount(Integer levyAmount) {
        this.levyAmount = levyAmount;
    }

    @JsonProperty("NetPremium")
    public Double getNetPremium() {
        return netPremium;
    }

    @JsonProperty("NetPremium")
    public void setNetPremium(Double netPremium) {
        this.netPremium = netPremium;
    }

    @JsonProperty("SaleDAmount")
    public Integer getSaleDAmount() {
        return saleDAmount;
    }

    @JsonProperty("SaleDAmount")
    public void setSaleDAmount(Integer saleDAmount) {
        this.saleDAmount = saleDAmount;
    }

    @JsonProperty("SaleDiscount")
    public Integer getSaleDiscount() {
        return saleDiscount;
    }

    @JsonProperty("SaleDiscount")
    public void setSaleDiscount(Integer saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    @JsonProperty("Tax")
    public Integer getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @JsonProperty("TaxAmount")
    public Integer getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("TaxAmount")
    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("TotalDue")
    public Double getTotalDue() {
        return totalDue;
    }

    @JsonProperty("TotalDue")
    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    @JsonProperty("InsuranceLevy")
    public InsuranceLevy getInsuranceLevy() {
        return insuranceLevy;
    }

    @JsonProperty("InsuranceLevy")
    public void setInsuranceLevy(InsuranceLevy insuranceLevy) {
        this.insuranceLevy = insuranceLevy;
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
