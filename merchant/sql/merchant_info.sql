CREATE TABLE `merchant_info` (
     `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
     `create_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
     `create_by` varchar(64) NOT NULL DEFAULT 'SYS' COMMENT '创建人',
     `update_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次更新时间',
     `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'SYS' COMMENT '最后一次更新人',
     `version` tinyint NOT NULL DEFAULT '0' COMMENT '版本号',
     `idem_id` bigint NOT NULL COMMENT '幂等表ID',
     `merchant_no` varchar(32) NOT NULL COMMENT '商户号',
     `mobile_no` varchar(11) NOT NULL COMMENT '商户手机号',
     `is_valid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商户状态',
     `is_real_name` varchar(1) NOT NULL COMMENT '是否实名，0-未实名，1-已实名',
     `registry_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
     `remark` varchar(255) DEFAULT NULL COMMENT '备注',
     PRIMARY KEY (`id`),
     UNIQUE KEY `UK_MER_MERCHANT_NO` (`merchant_no`) USING BTREE COMMENT '商户号',
     KEY `IDX_MER_CREATE_TIME` (`create_at`) USING BTREE COMMENT '创建时间'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;