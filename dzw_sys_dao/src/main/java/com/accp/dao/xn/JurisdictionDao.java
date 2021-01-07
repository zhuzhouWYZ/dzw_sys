package com.accp.dao.xn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Jurisdiction;

public interface JurisdictionDao {

	/**
	 * 查询所有角色信息
	 * 
	 * @return
	 */
	List<Jurisdiction> queryAlljJurisdictions();

	/**
	 * 新增角色信息
	 * 
	 * @param jurisdiction
	 * @return
	 */
	Integer addJurisdiction(@Param("jurisdiction") Jurisdiction jurisdiction);

	/**
	 * 修改角色信息
	 * 
	 * @param jurisdiction
	 * @return
	 */
	Integer updateJurisdiction(@Param("jurisdiction") Jurisdiction jurisdiction);

	/**
	 * 删除角色信息
	 * 
	 * @param jurisdictionid
	 * @return
	 */
	Integer delJurisdiction(@Param("jurisdictionid") String jurisdictionid);
}
