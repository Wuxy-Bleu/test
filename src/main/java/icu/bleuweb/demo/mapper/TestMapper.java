package icu.bleuweb.demo.mapper;

import icu.bleuweb.demo.bean.ScoreBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {

    public List<ScoreBean> getAllData(@Param(value = "list") List<String> list);
}
