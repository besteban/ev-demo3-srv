package com.ev.srv.demo3.service;

import com.evo.api.springboot.exception.EntityNotFoundException;
import com.ev.srv.demo3.model.IncomeDTO;
import com.ev.srv.demo3.model.IncomeRequestDTO;
import com.ev.srv.demo3.model.ModelResponseEntity;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link IncomesController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface IncomesService {


 	/**
 	 * Income operation
 	 * Gets the income operation from database
     * @return
     */
    IncomeDTO getIncomeUsingGET(String operationId)  throws EntityNotFoundException;    

 	/**
 	 * Income operation
 	 * Receive the cash operation event from Correos, and generates a real-time income to the client account.
     * @return
     */
    ModelResponseEntity processIncomeUsingPOST(IncomeRequestDTO income)  throws EntityNotFoundException;    
}
