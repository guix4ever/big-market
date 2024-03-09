package org.guix.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class Strategy {


    private Long id;
    private Long strtegyid;
    private String strategyDesc;
    private Date createTime;
    private String updateTime;
}
