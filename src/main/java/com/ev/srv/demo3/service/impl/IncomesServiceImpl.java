package com.ev.srv.demo3.service.impl;

import com.ev.srv.demo3.service.IncomesService;
import com.evo.api.springboot.exception.EntityNotFoundException;
import com.ev.srv.demo3.model.IncomeDTO;
import com.ev.srv.demo3.model.IncomeRequestDTO;
import com.ev.srv.demo3.model.ModelResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link IncomesController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class IncomesServiceImpl implements IncomesService{

    @Override
    public IncomeDTO getIncomeUsingGET(String operationId) throws EntityNotFoundException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public ModelResponseEntity processIncomeUsingPOST(IncomeRequestDTO income) throws EntityNotFoundException{
        
        // TODO Auto-generated method stub
        return null;
     }

}
