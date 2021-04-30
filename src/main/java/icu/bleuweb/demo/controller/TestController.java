package icu.bleuweb.demo.controller;

import icu.bleuweb.demo.bean.ScoreBean;
import icu.bleuweb.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestMapper mapper;

    @GetMapping("/getdata")
    public List<ScoreBean> getAllData() {

        List<String> list = new ArrayList<>();
        list.add("101");
        list.add("103");
        List<ScoreBean> res = mapper.getAllData(list);

        return res;
    }
}
