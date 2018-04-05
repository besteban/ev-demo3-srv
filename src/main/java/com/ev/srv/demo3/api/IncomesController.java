package com.ev.srv.demo3.api;

import com.evo.api.springboot.exception.EntityNotFoundException;
import com.ev.srv.demo3.model.IncomeDTO;
import com.ev.srv.demo3.model.IncomeRequestDTO;
import com.ev.srv.demo3.model.ModelResponseEntity;
import com.ev.srv.demo3.service.IncomesService;

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
public class IncomesController {

	@Autowired
    private IncomesService service;

	@ApiOperation(value = "Income operation", nickname = "getIncomeUsingGET", notes = "Gets the income operation from database", response = IncomeDTO.class, tags={ "correos-cash-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IncomeDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/incomes/{operationId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)

    public ResponseEntity<IncomeDTO> getIncomeUsingGET( @ApiParam(value = "Operation Id",required=true) @PathVariable("operationId") String operationId) throws EntityNotFoundException{
        return new ResponseEntity<IncomeDTO>(service.getIncomeUsingGET(operationId), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Income operation", nickname = "processIncomeUsingPOST", notes = "Receive the cash operation event from Correos, and generates a real-time income to the client account.", response = ModelResponseEntity.class, tags={ "correos-cash-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelResponseEntity.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/incomes",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)

    public ResponseEntity<ModelResponseEntity> processIncomeUsingPOST(@ApiParam(value = "Income Request" ,required=true )  @RequestBody IncomeRequestDTO income) throws EntityNotFoundException{
        return new ResponseEntity<ModelResponseEntity>(service.processIncomeUsingPOST(income), HttpStatus.NOT_IMPLEMENTED);
    }

}
