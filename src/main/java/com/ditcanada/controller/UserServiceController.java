package com.ditcanada.controller;

import com.ditcanada.api.response.BaseResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserServiceController {

    @ApiOperation(value = "Retrieve user")
    @GetMapping(value = "/v1/hello")
    public BaseResponse<String> getUser() {
        log.info("Get User");
        BaseResponse<String> response = new BaseResponse<>();
        response.setSuccess(true);
        response.setData("Hello, World!");
        return response;
    }
}


