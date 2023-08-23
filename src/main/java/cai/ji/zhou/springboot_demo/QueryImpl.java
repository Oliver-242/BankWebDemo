package cai.ji.zhou.springboot_demo;

import cai.ji.zhou.springboot_demo.entity.InfoEntity;
import cai.ji.zhou.springboot_demo.mapper.JiZhouMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.annotation.Resource;

@Service
@Slf4j
public class QueryImpl{
    @Resource
    private JiZhouMapper mapper;

//    @Override
    public List<InfoEntity> query() {
        return mapper.selectAll1();
    }
}
