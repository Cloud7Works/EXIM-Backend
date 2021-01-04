package com.cloud7works.exim.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CompanyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-01T19:16:31.836Z[GMT]")


public class CompanyRequest   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("naicsCode")
  private String naicsCode = null;

  @JsonProperty("dunsNumber")
  private String dunsNumber = null;

  public CompanyRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   **/
    @NotNull
    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CompanyRequest addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
   **/
    public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public CompanyRequest addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
   **/
    public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public CompanyRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CompanyRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CompanyRequest zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   **/
    public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public CompanyRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CompanyRequest naicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
    return this;
  }

  /**
   * Get naicsCode
   * @return naicsCode
   **/
   @NotNull
    public String getNaicsCode() {
    return naicsCode;
  }

  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }

  public CompanyRequest dunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
    return this;
  }

  /**
   * Get dunsNumber
   * @return dunsNumber
   **/
   @NotNull
    public String getDunsNumber() {
    return dunsNumber;
  }

  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyRequest companyRequest = (CompanyRequest) o;
    return Objects.equals(this.companyName, companyRequest.companyName) &&
        Objects.equals(this.addressLine1, companyRequest.addressLine1) &&
        Objects.equals(this.addressLine2, companyRequest.addressLine2) &&
        Objects.equals(this.city, companyRequest.city) &&
        Objects.equals(this.state, companyRequest.state) &&
        Objects.equals(this.zipCode, companyRequest.zipCode) &&
        Objects.equals(this.country, companyRequest.country) &&
        Objects.equals(this.naicsCode, companyRequest.naicsCode) &&
        Objects.equals(this.dunsNumber, companyRequest.dunsNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, addressLine1, addressLine2, city, state, zipCode, country, naicsCode, dunsNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyRequest {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
