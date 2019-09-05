package cn.lookk.handerexception.exception;


import cn.lookk.handerexception.constants.ResultEnum;

/**
 * @ClassName: AssertException
 * @Description: 断言异常
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
public class AssertException extends RuntimeException {

    private int code= ResultEnum.SERVER_ERROR.getCode();
    private String msg;



    public AssertException() {

    }

    public AssertException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public AssertException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
