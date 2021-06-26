package com.ditcanada.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Base response object")
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class BaseResponse<T> {

    @ApiModelProperty(required = true, notes = "api status")
    @JsonProperty("success")
    private boolean success;

    @ApiModelProperty(required = false, notes = "api status code")
    @JsonProperty("error")
    private String error;


    @ApiModelProperty(required = false, notes = "API response")
    @JsonProperty("data")
    private T data;
}
