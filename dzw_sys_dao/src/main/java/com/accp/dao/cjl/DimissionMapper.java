package com.accp.dao.cjl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Dimission;
import com.accp.vo.EmpAndBumenAndZhiweiAndLizhi;

public interface DimissionMapper {
    int deleteByPrimaryKey(@Param("employeeno")String employeeno);

    int insert(Dimission record);

    int insertSelective(Dimission record);

    Dimission selectByPrimaryKey(Integer dimissionid);

    int updateByPrimaryKeySelective(Dimission record);

    int updateByPrimaryKey(Dimission record);
    
    List<EmpAndBumenAndZhiweiAndLizhi> lizhiVo();
    /**
     * 修改状态为1
     * @param Empno
     * @return
     */
    int EmpZhuangTai(@Param("Empno")String Empno);
    /**
     * 修改状态为0
     * @param Empno
     * @return
     */
    int EmpZhuangTai1(@Param("Empno")String Empno);
}