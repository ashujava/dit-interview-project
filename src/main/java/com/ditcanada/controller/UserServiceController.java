package com.ditcanada.controller;

import com.ditcanada.api.response.DataResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserServiceController {

    @ApiOperation(value = "Retrieve user")
    @GetMapping(value = "/v1/hello")
    public DataResponse<String> getUser() {
        log.info("Get User");
        DataResponse<String> response = new DataResponse<>();
        response.setSuccess(true);
        response.setData("Hello, World!");
        return response;
    }

}


