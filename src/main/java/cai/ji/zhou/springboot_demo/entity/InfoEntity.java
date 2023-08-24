package cai.ji.zhou.springboot_demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author caijizhou
 * @date 2023/08/24 10:10
 */
@Data
public class InfoEntity implements Serializable {
    Long userId;
    String userName;
    Long money;
    String cardId;
    String createTime;
    String updateTime;
}
