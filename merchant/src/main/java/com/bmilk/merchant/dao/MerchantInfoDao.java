package com.bmilk.merchant.dao;

import com.bmilk.merchant.entry.MerchantInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MerchantInfoDao {

    /**
     * 插入一条商户信息
     * @param merchantInfo
     * @return
     */
    int insert(MerchantInfo merchantInfo);

    /**
     * 查询商户信息
     * @param merchantNo
     * @return
     */
    MerchantInfo queryByMerchantNo(@Param("merchantNo") String merchantNo);
}
