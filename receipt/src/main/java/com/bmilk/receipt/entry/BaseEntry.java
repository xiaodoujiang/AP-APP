package com.bmilk.receipt.entry;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据库实体类基础信息
 */
@Data
public class BaseEntry implements Serializable {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 创建人
     */
    private String createBy;

    /**
     * 最后一次更新时间
     */
    private Date updateAt;

    /**
     * 最后一次更新人
     */
    private String updateBy;

    /**
     * 版本号，用于数据库乐观锁更新控制
     */
    private Integer version;
}
