package com.atguigu.cloud.resp;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * ClassName: ResultData
 * Package: com.atguigu.cloud.resp
 * Description:
 *
 * @Author cyh
 * @Create 2024/3/7 10:17
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class ResultData<T> {

    private String code;
    private String message;
    private T data;
    private long timestamp;

    private ResultData(String code, String message, T data) {
        this();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ResultData() {
        this.timestamp = System.currentTimeMillis();

    }

    public static <T> ResultData success(T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(ReturnCodeEnum.RC200.getCode());
        resultData.setMessage(ReturnCodeEnum.RC200.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static ResultData fail(String code, String message) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(code);
        resultData.setMessage(message);
        return resultData;
    }
}
