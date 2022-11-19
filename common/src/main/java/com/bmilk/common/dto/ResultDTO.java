package com.bmilk.common.dto;

import com.bmilk.common.domain.Result;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

@Data
public class ResultDTO<T> implements Serializable {

    private String restCode;

    private String retMsg;

    private T data;

    public ResultDTO() {
    }

    public ResultDTO(Result result) {
        this(result, null);
    }

    public ResultDTO(Result result, T data) {
        this(result, null, data);
    }

    public ResultDTO(Result result, String errMsg, T data) {
       this(result.getCode(), StringUtils.isBlank(errMsg)? result.getMsg():errMsg, data);
    }

    private ResultDTO(String restCode, String retMsg, T data) {
        this.restCode = restCode;
        this.retMsg = retMsg;
        this.data = data;
    }

}
