package com.blazemaple.common;

import com.blazemaple.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 912
 * @description
 * @date 2023/4/3 13:59
 */
@RestControllerAdvice
public class ExceptionAdaptController {
    @ExceptionHandler({RuntimeException.class})
    public Result runTimeException(RuntimeException exception){
        exception.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler({Exception.class})
    public Result exception(Exception exception){
        exception.printStackTrace();
        return Result.fail();
    }
}
