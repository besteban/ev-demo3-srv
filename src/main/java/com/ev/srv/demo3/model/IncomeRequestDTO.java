package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demo3.model.EventDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * IncomeRequestDTO
 */

@Data
@Builder
public class IncomeRequestDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cashEvent")
  private EventDTO cashEvent;
  
}

