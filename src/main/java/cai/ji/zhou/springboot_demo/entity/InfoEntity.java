package cai.ji.zhou.springboot_demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class InfoEntity implements Serializable {
    Long userId;
    Long money;
    String cardId;
    String createTime;
    String updateTime;
}
