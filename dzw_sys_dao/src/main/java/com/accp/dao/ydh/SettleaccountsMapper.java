package com.accp.dao.ydh;

import com.accp.pojo.ydh.Settleaccounts;

public interface SettleaccountsMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Settleaccounts record);

    int insertSelective(Settleaccounts record);

    Settleaccounts selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Settleaccounts record);

    int updateByPrimaryKey(Settleaccounts record);
}