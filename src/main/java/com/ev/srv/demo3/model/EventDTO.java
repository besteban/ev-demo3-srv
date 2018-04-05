package com.ev.srv.demo3.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demo3.model.OperationDTO;
import com.ev.srv.demo3.model.PayerDTO;
import com.ev.srv.demo3.model.ReceiverDTO;
import com.ev.srv.demo3.model.XMLGregorianCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * EventDTO
 */

@Data
@Builder
public class EventDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("descripcion")
  private String descripcion;
  
  @JsonProperty("destinatario")
  private ReceiverDTO destinatario;
  
  @JsonProperty("idEvento")
  private String idEvento;
  
  @JsonProperty("importe")
  private Double importe;
  
  @JsonProperty("operacion")
  private OperationDTO operacion;
  
  @JsonProperty("ordenante")
  private PayerDTO ordenante;
  
  @JsonProperty("timestampEvento")
  private XMLGregorianCalendar timestampEvento;
  
  @JsonProperty("tipo")
  private String tipo;
  
}

