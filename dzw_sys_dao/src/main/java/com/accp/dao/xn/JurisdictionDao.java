package com.accp.dao.xn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Jurisdiction;

public interface JurisdictionDao {

	/**
	 * ��ѯ���н�ɫ��Ϣ
	 * 
	 * @return
	 */
	List<Jurisdiction> queryAlljJurisdictions();

	/**
	 * ������ɫ��Ϣ
	 * 
	 * @param jurisdiction
	 * @return
	 */
	Integer addJurisdiction(@Param("jurisdiction") Jurisdiction jurisdiction);

	/**
	 * �޸Ľ�ɫ��Ϣ
	 * 
	 * @param jurisdiction
	 * @return
	 */
	Integer updateJurisdiction(@Param("jurisdiction") Jurisdiction jurisdiction);

	/**
	 * ɾ����ɫ��Ϣ
	 * 
	 * @param jurisdictionid
	 * @return
	 */
	Integer delJurisdiction(@Param("jurisdictionid") String jurisdictionid);
}
