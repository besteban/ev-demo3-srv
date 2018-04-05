package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * ReceiverDTO
 */

@Data
@Builder
public class ReceiverDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("codigoPostal")
  private String codigoPostal;
  
  @JsonProperty("direccion")
  private String direccion;
  
  @JsonProperty("iban")
  private String iban;
  
  @JsonProperty("localidad")
  private String localidad;
  
  @JsonProperty("nombre")
  private String nombre;
  
  @JsonProperty("telefono")
  private String telefono;
  
}

