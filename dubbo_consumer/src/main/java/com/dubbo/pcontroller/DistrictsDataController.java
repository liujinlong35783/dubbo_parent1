package com.dubbo.pcontroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.pojo.District;
import com.dubbo.service.DubboTestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
@RequestMapping("/page/")
public class DistrictsDataController {
    @Reference(interfaceClass = DubboTestService.class,check = false,version = "1.0.0")
    private DubboTestService dubboTestService;

    @RequestMapping("getHW3")
    @ResponseBody
    public String getHW3(){
        return "helloword33";
    }
    @RequestMapping("getAllDistrict")
//    @ResponseBody
    public String getAllDistrict(Model model){
        List<District> districtList = dubboTestService.getAllDistrict();
        model.addAttribute(districtList);
        return "index";
    }
}
