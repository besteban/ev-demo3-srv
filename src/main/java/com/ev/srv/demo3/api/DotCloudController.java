package com.ev.srv.demo3.api;

import com.ev.srv.demo3.model.DotCloudRequestDTO;
import com.evo.api.springboot.exception.EntityNotFoundException;
import com.ev.srv.demo3.service.DotCloudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.evo.api.springboot.exception.ApiException;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class DotCloudController {

	@Autowired
    private DotCloudService service;

	@ApiOperation(value = "Dot cloud", nickname = "createDotCloudOperationUsingPOST", notes = "Generates pdf417 barcode based on an xml obtained from input fields", response = byte[].class, tags={ "correos-cash-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/dot-cloud",
        produces = { "image/png" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)

    public ResponseEntity<byte[]> createDotCloudOperationUsingPOST(@ApiParam(value = "DotCloud Request" ,required=true )  @RequestBody DotCloudRequestDTO request) throws EntityNotFoundException{
        return new ResponseEntity<byte[]>(service.createDotCloudOperationUsingPOST(request), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Dot cloud", nickname = "getDotCloudOperationUsingGET", notes = "Retrieves the pdf417 barcode based on an xml obtained from database recorded request", response = byte[].class, tags={ "correos-cash-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/dot-cloud/{operationId}",
        produces = { "image/png" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)

    public ResponseEntity<byte[]> getDotCloudOperationUsingGET( @ApiParam(value = "DotCloud Request Operation Id",required=true) @PathVariable("operationId") String operationId) throws EntityNotFoundException{
        return new ResponseEntity<byte[]>(service.getDotCloudOperationUsingGET(operationId), HttpStatus.NOT_IMPLEMENTED);
    }

}
