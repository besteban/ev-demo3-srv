package com.ev.srv.demo3.service.impl;

import com.ev.srv.demo3.service.DotCloudService;
import com.ev.srv.demo3.model.DotCloudRequestDTO;
import com.evo.api.springboot.exception.EntityNotFoundException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link DotCloudController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class DotCloudServiceImpl implements DotCloudService{

    @Override
    public byte[] createDotCloudOperationUsingPOST(DotCloudRequestDTO request) throws EntityNotFoundException{
        
        // TODO Auto-generated method stub
        return null;
     }


    @Override
    public byte[] getDotCloudOperationUsingGET(String operationId) throws EntityNotFoundException{
        
        // TODO Auto-generated method stub
        return null;
     }

}
