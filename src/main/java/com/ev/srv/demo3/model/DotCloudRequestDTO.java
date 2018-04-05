package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * DotCloudRequestDTO
 */

@Data
@Builder
public class DotCloudRequestDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("clientCode")
  private String clientCode;
  
  @JsonProperty("operationCode")
  private String operationCode;
  
  @JsonProperty("payerAddress")
  private String payerAddress;
  
  @JsonProperty("payerBirthCountryISOCode")
  private String payerBirthCountryISOCode;
  
  @JsonProperty("payerBirthDate")
  private OffsetDateTime payerBirthDate;
  
  @JsonProperty("payerCountryISOCode")
  private String payerCountryISOCode;
  
  @JsonProperty("payerDocNumber")
  private String payerDocNumber;
  
  @JsonProperty("payerDocType")
  private String payerDocType;
  
  @JsonProperty("payerExpiryDate")
  private OffsetDateTime payerExpiryDate;
  
  @JsonProperty("payerLastName1")
  private String payerLastName1;
  
  @JsonProperty("payerLastName2")
  private String payerLastName2;
  
  @JsonProperty("payerLocation")
  private String payerLocation;
  
  @JsonProperty("payerName")
  private String payerName;
  
  @JsonProperty("payerNationalityCountryISOCode")
  private String payerNationalityCountryISOCode;
  
  @JsonProperty("payerOccupationCode")
  private String payerOccupationCode;
  
  @JsonProperty("payerPhone")
  private String payerPhone;
  
  @JsonProperty("payerPostalCode")
  private Integer payerPostalCode;
  
  @JsonProperty("payerProvince")
  private String payerProvince;
  
  @JsonProperty("payerResidenceCountry")
  private String payerResidenceCountry;
  
  @JsonProperty("receiverAccountNumber")
  private String receiverAccountNumber;
  
  @JsonProperty("receiverFullName")
  private String receiverFullName;
  
}

