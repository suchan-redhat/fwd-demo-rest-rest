
package com.fwd.demo.beans.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.xml.bind.annotation.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "__type",
    "GrossPremium",
    "DirectDiscount",
    "DirectDAmount",
    "SaleDiscount",
    "SaleDAmount",
    "Commission",
    "CommissionAmount",
    "TotalDue",
    "AfterCoupon",
    "CommissionChange",
    "DirectDiscountChange",
    "GroupDAmount",
    "GroupDiscount",
    "GroupDiscountChange",
    "Levy",
    "LevyAmount",
    "NetPremium",
    "Tax",
    "TaxAmount",
    "CouponAmount",
    "InsuranceLevy"
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PriceInfo {

	@XmlElement
    @JsonProperty("__type")
    private String type;
	
	@XmlElement
    @JsonProperty("GrossPremium")
    private Integer grossPremium;
	
	@XmlElement
	@JsonProperty("DirectDiscount")
    private Integer directDiscount;
    
	@XmlElement
	@JsonProperty("DirectDAmount")
    private Integer directDAmount;
    
	@XmlElement
	@JsonProperty("SaleDiscount")
    private Integer saleDiscount;
    
	@XmlElement
	@JsonProperty("SaleDAmount")
    private Integer saleDAmount;
   
	@XmlElement
	@JsonProperty("Commission")
    private Double commission;
    
	@XmlElement
	@JsonProperty("CommissionAmount")
    private Double commissionAmount;
    
	@XmlElement
	@JsonProperty("TotalDue")
    private Double totalDue;
    
	@XmlElement
	@JsonProperty("AfterCoupon")
    private Integer afterCoupon;
    
	@XmlElement
	@JsonProperty("CommissionChange")
    private Double commissionChange;
    
	@XmlElement
	@JsonProperty("DirectDiscountChange")
    private Integer directDiscountChange;
    
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
	@JsonProperty("Tax")
    private Integer tax;
    
	@XmlElement
	@JsonProperty("TaxAmount")
    private Integer taxAmount;
    
	@XmlElement
	@JsonProperty("CouponAmount")
    private Integer couponAmount;
    
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

    @JsonProperty("GrossPremium")
    public Integer getGrossPremium() {
        return grossPremium;
    }

    @JsonProperty("GrossPremium")
    public void setGrossPremium(Integer grossPremium) {
        this.grossPremium = grossPremium;
    }

    @JsonProperty("DirectDiscount")
    public Integer getDirectDiscount() {
        return directDiscount;
    }

    @JsonProperty("DirectDiscount")
    public void setDirectDiscount(Integer directDiscount) {
        this.directDiscount = directDiscount;
    }

    @JsonProperty("DirectDAmount")
    public Integer getDirectDAmount() {
        return directDAmount;
    }

    @JsonProperty("DirectDAmount")
    public void setDirectDAmount(Integer directDAmount) {
        this.directDAmount = directDAmount;
    }

    @JsonProperty("SaleDiscount")
    public Integer getSaleDiscount() {
        return saleDiscount;
    }

    @JsonProperty("SaleDiscount")
    public void setSaleDiscount(Integer saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    @JsonProperty("SaleDAmount")
    public Integer getSaleDAmount() {
        return saleDAmount;
    }

    @JsonProperty("SaleDAmount")
    public void setSaleDAmount(Integer saleDAmount) {
        this.saleDAmount = saleDAmount;
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

    @JsonProperty("TotalDue")
    public Double getTotalDue() {
        return totalDue;
    }

    @JsonProperty("TotalDue")
    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    @JsonProperty("AfterCoupon")
    public Integer getAfterCoupon() {
        return afterCoupon;
    }

    @JsonProperty("AfterCoupon")
    public void setAfterCoupon(Integer afterCoupon) {
        this.afterCoupon = afterCoupon;
    }

    @JsonProperty("CommissionChange")
    public Double getCommissionChange() {
        return commissionChange;
    }

    @JsonProperty("CommissionChange")
    public void setCommissionChange(Double commissionChange) {
        this.commissionChange = commissionChange;
    }

    @JsonProperty("DirectDiscountChange")
    public Integer getDirectDiscountChange() {
        return directDiscountChange;
    }

    @JsonProperty("DirectDiscountChange")
    public void setDirectDiscountChange(Integer directDiscountChange) {
        this.directDiscountChange = directDiscountChange;
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

    @JsonProperty("CouponAmount")
    public Integer getCouponAmount() {
        return couponAmount;
    }

    @JsonProperty("CouponAmount")
    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
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
