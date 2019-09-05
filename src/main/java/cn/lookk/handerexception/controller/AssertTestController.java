package cn.lookk.handerexception.controller;


import cn.lookk.handerexception.constants.ResultEnum;
import cn.lookk.handerexception.exception.Assert;
import cn.lookk.handerexception.util.ResultUtil;
import cn.lookk.handerexception.vo.Result;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AssertTestController
 * @Description: 测试断言处理
 * @Author jiaoxiangyu
 * @Date 2019/9/4
 * @Version 1.0
 * @Since JDK1.8
 */
@RestController
@RequestMapping(value = "/assert")
public class AssertTestController {

    @RequestMapping(value = "success", method = RequestMethod.GET)
    public Result success(){
        return ResultUtil.success("正常");
    }

    /**
     * @title:  serverError
     * @description:  test serverError
     * @param
     * @return  cn.jxy.httptest.vo.Result
     */
    @RequestMapping(value = "serverError", method = RequestMethod.GET)
    public Result serverError(){
        int i=1/0;
        return ResultUtil.success();
    }

    /**
     * @title:  isBlank
     * @description:  test isBlank
     * @param
     * @return  cn.jxy.httptest.vo.Result
     */
    @RequestMapping(value = "isBlank", method = RequestMethod.GET)
    public Result isBlank(){
        String param="";
        Assert.isBlank(param, ResultEnum.STRING_NULL);
        return ResultUtil.success();
    }

    /**
     * @title:  isNull
     * @description:  test isNull
     * @param
     * @return  cn.jxy.httptest.vo.Result
     */
    @RequestMapping(value = "isNull", method = RequestMethod.GET)
    public Result isNull(){
        Object param=null;
        Assert.isNull(param, ResultEnum.OBJECT_NULL);
        return ResultUtil.success();
    }


}
