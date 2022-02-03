package com.mzh.base.domain;

/**
 * 返回DTO值
 */
public class ResponseDTO<T> {
    private String code;
    private String msg;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static<T> ResponseDTO success(T data) {
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setCode("200");
        responseDTO.setMsg("操作成功");
        responseDTO.setData(data);
        return responseDTO;
    }

    public static<T> ResponseDTO success(String code,String msg) {
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setCode(code);
        responseDTO.setMsg(msg);
        return responseDTO;
    }

    public static<T> ResponseDTO fail(String code,String msg,T data) {
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setCode(code);
        responseDTO.setMsg(msg);
        responseDTO.setData(data);
        return responseDTO;
    }
}
