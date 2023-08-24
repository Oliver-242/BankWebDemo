package cai.ji.zhou.springboot_demo.mapper;

import cai.ji.zhou.springboot_demo.entity.InfoEntity;
import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QueryMapper {
    List<InfoEntity> selectAll();
}
