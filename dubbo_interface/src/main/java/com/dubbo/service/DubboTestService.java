package com.dubbo.service;

import com.dubbo.pojo.District;

import java.util.List;

/**
 * Created by HP on 2020/1/6.
 */
public interface DubboTestService {
    //一功能一服务-接口
    //编写功能返回helloword
    public String getHelloWord();
    //spring boot查询所有街道
    List<District> getAllDistrict();
}
