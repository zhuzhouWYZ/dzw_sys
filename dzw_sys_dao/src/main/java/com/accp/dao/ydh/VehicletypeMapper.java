package com.accp.dao.ydh;

import java.util.List;

import com.accp.pojo.ydh.Vehicletype;

public interface VehicletypeMapper {
    int deleteByPrimaryKey(Integer vtypeid);

    int insert(Vehicletype record);

    int insertSelective(Vehicletype record);
/**
 * ≤È—Ø≥µ¡æ∆∑≈∆
 * @return
 */
   List< Vehicletype >selectByPrimaryKey();

    int updateByPrimaryKeySelective(Vehicletype record);

    int updateByPrimaryKey(Vehicletype record);
}