package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.Result;
import com.example.demo.model.ResultUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("service/outbound/")
public class TestController {

    @PostMapping("createOutboundOrder")
    public Result<?> createOutboundOrder(HttpServletRequest request, @RequestBody DDSs model)
    {
        log.debug(JSON.toJSONString(model));
        return ResultUtils.success();
    }

    @Data
    public static class DDSs
    {
        private String e1;
        private String exsf;

        private String eBaysf;

        private String eBdf;
    }

}
