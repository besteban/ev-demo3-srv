package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demo3.model.QName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * XMLGregorianCalendar
 */

@Data
@Builder
public class XMLGregorianCalendar  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("day")
  private Integer day;
  
  @JsonProperty("eon")
  private Integer eon;
  
  @JsonProperty("eonAndYear")
  private Integer eonAndYear;
  
  @JsonProperty("fractionalSecond")
  private BigDecimal fractionalSecond;
  
  @JsonProperty("hour")
  private Integer hour;
  
  @JsonProperty("millisecond")
  private Integer millisecond;
  
  @JsonProperty("minute")
  private Integer minute;
  
  @JsonProperty("month")
  private Integer month;
  
  @JsonProperty("second")
  private Integer second;
  
  @JsonProperty("timezone")
  private Integer timezone;
  
  @JsonProperty("valid")
  private Boolean valid;
  
  @JsonProperty("xmlschemaType")
  private QName xmlschemaType;
  
  @JsonProperty("year")
  private Integer year;
  
}

