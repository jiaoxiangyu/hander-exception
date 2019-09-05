package cn.lookk.handerexception.exception;


import cn.lookk.handerexception.constants.ResultEnum;
import cn.lookk.handerexception.util.ResultUtil;
import cn.lookk.handerexception.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ExceptionHandler
 * @Description: 统一异常处理
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    private static int code= ResultEnum.SERVER_ERROR.getCode();
    private String msg = ResultEnum.SERVER_ERROR.getMsg();

    /**
     * @title:  handleAssertException
     * @description:  处理AssertException
     * @param request
     * @param e
     * @return  cn.jxy.httptest.vo.Result
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(AssertException.class)
    public Result handleAssertException(HttpServletRequest request, AssertException e){
       logger.error("AssertException code:{}, msg:{}", e.getCode(), e.getMsg());
        return ResultUtil.error(e.getCode(), e.getMsg());
    }

    /**
     * @title:  handleException
     * @description:  处理Exception
     * @param request
     * @param e
     * @return  cn.jxy.httptest.vo.Result
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Result handleException(HttpServletRequest request, Exception e){
        logger.error("ServerException code:{}, msg:{}", code, msg, e);
        return ResultUtil.error(code, msg);
    }

}
