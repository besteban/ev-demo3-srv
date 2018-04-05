package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demo3.model.XMLGregorianCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * OperationDTO
 */

@Data
@Builder
public class OperationDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("codigoAgrupacion")
  private String codigoAgrupacion;
  
  @JsonProperty("codigoOficina")
  private String codigoOficina;
  
  @JsonProperty("fecha")
  private XMLGregorianCalendar fecha;
  
  @JsonProperty("idCliente")
  private String idCliente;
  
  @JsonProperty("idExtOperacion")
  private String idExtOperacion;
  
  @JsonProperty("idTransaccion")
  private String idTransaccion;
  
  @JsonProperty("nombreOficina")
  private String nombreOficina;
  
}

