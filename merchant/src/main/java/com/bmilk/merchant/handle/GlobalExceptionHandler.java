package com.bmilk.merchant.handle;

import com.bmilk.common.domain.Result;
import com.bmilk.common.dto.ResultDTO;
import com.bmilk.common.exception.NotFundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * NotFundException异常处理器类
     * @param ne NotFundException
     * @return ResultDTO
     */
    @ExceptionHandler(value = NotFundException.class)
    public ResultDTO<Void> notFundExceptionHandler(NotFundException ne){
        log.warn("happend not fund exception, ne:[{}]", ne.getMessage(), ne);
        return new ResultDTO<>(Result.NOT_FUND, ne.getMessage(), null);
    }


    @ExceptionHandler(value = Exception.class)
    public ResultDTO<Void> exceptionHandler(Exception e){
        log.error("happend  exception, e:[{}]", e.getMessage(), e);
        return new ResultDTO<>(Result.SYSTEM_ERROR);
    }

}
