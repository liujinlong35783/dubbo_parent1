package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.mapper.DistrictMapper;
import com.dubbo.pojo.District;
import com.dubbo.pojo.DistrictExample;
import com.dubbo.service.DubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HP on 2020/1/6.
 */
@Service(version = "1.0.0",timeout = 1000,interfaceClass = DubboTestService.class)   //表示可以远程调用
@Component  //创建本地bean
public class DubboTestServiceImpl implements DubboTestService {
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Override
    public String getHelloWord() {
        return "Helloword";
    }
    @Override
    public List<District> getAllDistrict() {
        DistrictExample example = new DistrictExample();
        return districtMapper.selectByExample(example);
    }
}
