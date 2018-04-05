package com.ev.srv.demo3.service;

import com.ev.srv.demo3.model.DotCloudRequestDTO;
import com.evo.api.springboot.exception.EntityNotFoundException;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link DotCloudController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface DotCloudService {


 	/**
 	 * Dot cloud
 	 * Generates pdf417 barcode based on an xml obtained from input fields
     * @return
     */
    byte[] createDotCloudOperationUsingPOST(DotCloudRequestDTO request)  throws EntityNotFoundException;    

 	/**
 	 * Dot cloud
 	 * Retrieves the pdf417 barcode based on an xml obtained from database recorded request
     * @return
     */
    byte[] getDotCloudOperationUsingGET(String operationId)  throws EntityNotFoundException;    
}
