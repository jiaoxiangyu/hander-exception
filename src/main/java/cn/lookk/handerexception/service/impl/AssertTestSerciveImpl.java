package cn.lookk.handerexception.service.impl;

import cn.lookk.handerexception.constants.ResultEnum;
import cn.lookk.handerexception.exception.Assert;
import cn.lookk.handerexception.service.IAssertTestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AssertTestSerciveImpl
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2019/9/5
 * @Version 1.0
 * @Since JDK1.8
 */
@Service
public class AssertTestSerciveImpl implements IAssertTestService {
    
    /**
     * @title:  testServiceException
     * @description:  TODO
     * @param 
     * @return  void
     */
    @Override
    public void testServiceException() {
        Assert.isBlank("", ResultEnum.STRING_NULL);
    }
}
