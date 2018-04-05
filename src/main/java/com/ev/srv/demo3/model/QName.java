package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * QName
 */

@Data
@Builder
public class QName  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("localPart")
  private String localPart;
  
  @JsonProperty("namespaceURI")
  private String namespaceURI;
  
  @JsonProperty("prefix")
  private String prefix;
  
}

