package com.ditcanada.controller;

import com.ditcanada.api.request.UserLoginRequest;
import com.ditcanada.api.response.BaseResponse;
import com.ditcanada.api.response.DataResponse;
import com.ditcanada.model.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserServiceController {

    @ApiOperation(value = "Greet the world")
    @GetMapping(value = "/v1/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public DataResponse<String> sayHello() {
        log.info("Hello, world!! ");
        DataResponse<String> response = new DataResponse<>();
        response.setSuccess(true);
        response.setData("Hello, World!");
        return response;
    }

    @ApiOperation(value = "Create user", response = DataResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully created user"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found")})
    @PostMapping(value = "/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataResponse<User>> addUser(@RequestBody User user) {
        log.info("Add User");
        return null;
    }

    @ApiOperation(value = "Login User based on username and password", response = DataResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successfully reserved the AvailableVas Detail "),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found")})
    @PostMapping(value = "/v1/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> loginUser(@RequestBody UserLoginRequest request) {
        log.info("Login User");
        if((null == request.getUsername() || "".equalsIgnoreCase(request.getUsername()))
                || (null == request.getPassword()) ||"".equalsIgnoreCase(request.getPassword())){
            return new ResponseEntity<>(new BaseResponse(false, "Either username or password is wrong"), HttpStatus.BAD_REQUEST);
        }
        DataResponse<String> response = new DataResponse<>();
        response.setSuccess(true);
        response.setData("Hello, World!");
        return new ResponseEntity<>(response, HttpStatus.OK );
    }

}


