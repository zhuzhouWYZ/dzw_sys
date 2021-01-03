package com.accp.biz.xn;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ydh.MechanicteamMapper;
import com.accp.pojo.ydh.Mechanicteam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Ydhbiz {
	@Resource
	private MechanicteamMapper mechan;
	
	/**
	 *查询所有班组
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Mechanicteam> querymechanall(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Mechanicteam>(mechan.selectByPrimaryKey());
	}
	/**
	 * 修改班组信息
	 * @return
	 */
	public int modifymechan(Mechanicteam record) {
		return mechan.updateByPrimaryKeySelective(record);
	}
	/**
	 * 新增班组信息
	 * @param record
	 * @return
	 */
	public int addmechan(Mechanicteam record) {
		return mechan.insertSelective(record);
	}
	/**
	 * 删除班组信息
	 * @param tid
	 * @return
	 */
	public int removemechan(int tid) {
		return mechan.deleteByPrimaryKey(tid);
	}
}
