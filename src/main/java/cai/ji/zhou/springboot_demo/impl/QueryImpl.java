package cai.ji.zhou.springboot_demo.impl;

import cai.ji.zhou.springboot_demo.entity.InfoEntity;
import cai.ji.zhou.springboot_demo.interf.Query;
import cai.ji.zhou.springboot_demo.mapper.QueryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.annotation.Resource;

@Service
@Slf4j
public class QueryImpl implements Query {
    @Resource
    private QueryMapper mapper;

    @Override
    public List<InfoEntity> queryAll() {
        return mapper.selectAll();
    }
}
