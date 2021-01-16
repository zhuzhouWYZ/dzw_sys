package com.accp.biz.ydh;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.ydh.FieldStatusMapper;
import com.accp.dao.ydh.FieldVehicleMapper;
import com.accp.dao.ydh.MechanicMapper;
import com.accp.dao.ydh.MechanicStarMapper;
import com.accp.dao.ydh.MechanicStatusMapper;
import com.accp.dao.ydh.MechanicteamMapper;
import com.accp.dao.ydh.RepairBillMapper;
import com.accp.dao.ydh.VehicletypeMapper;
import com.accp.pojo.ydh.FieldStatus;
import com.accp.pojo.ydh.FieldVehicle;
import com.accp.pojo.ydh.Mechanic;
import com.accp.pojo.ydh.MechanicStar;
import com.accp.pojo.ydh.MechanicStatus;
import com.accp.pojo.ydh.Mechanicteam;
import com.accp.pojo.ydh.RepairBill;
import com.accp.pojo.ydh.Vehicletype;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("biz")
public class Ydhbiz {
	/**
	 * 技工班组
	 */
	@Resource
	private MechanicteamMapper mechan;
	/**
	 * 技工星级
	 */
	@Resource
	private MechanicStarMapper mestar;
	
	
	/**
	 * 外勤车辆
	 */
	@Resource
	private FieldVehicleMapper fcar;
	/**
	 * 技工
	 */
	@Resource
	private MechanicMapper chaic;
	
	@Resource
	private FieldStatusMapper fsta;
	
	@Resource
	private MechanicStatusMapper meicsta;
	/**
	 * 车辆型号
	 */
	@Resource
	private VehicletypeMapper vetype;
	/**
	 * 维修单
	 */
	@Resource 
	private RepairBillMapper rebill;
	/**
	 *查询所有班组
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Mechanicteam> querymechanall(Integer pageNum,Integer pageSize,String tname){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Mechanicteam>(mechan.selectByPrimaryKey(tname));
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
	
	
	
	
	/**
	 * 查询技工星级
	 */
	public PageInfo<MechanicStar> querymestarall(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<MechanicStar>(mestar.selectByPrimaryKey());
	}
	/**
	 * 修改技工星级
	 * @param record
	 * @return
	 */
	public int modifymestar(MechanicStar record) {
		return mestar.updateByPrimaryKeySelective(record);
	}
	/**
	 * 新增技工星级
	 * @param record
	 * @return
	 */
	public int addmestar(MechanicStar record) {
		return mestar.insertSelective(record);
	}
	/**
	 * 删除技工星级
	 * @param sid
	 * @return
	 */
	public int removemestar(int sid) {
		return mestar.deleteByPrimaryKey(sid);
	}
	
	
	
	/**
	 * 查询外勤车辆
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<FieldVehicle> queryfcarall(Integer pageNum,Integer pageSize,Integer fstatusid,String fvname ){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<FieldVehicle>(fcar.selectByPrimaryKey(fstatusid, fvname));
	}
	/**
	 * 修改外勤车辆信息
	 * @param record
	 * @return
	 */
	public int modifyfcar(FieldVehicle record) {
		return fcar.updateByPrimaryKeySelective(record);
	}
	/**
	 * 删除外勤车辆信息
	 */
	public int modifyfcar(Integer fvid) {
		return fcar.updateByPrimaryKey(fvid);
	}
	/**
	 * 新增外勤车辆
	 * @param record
	 * @return
	 */
	public int addfcar(FieldVehicle record) {
		return fcar.insertSelective(record);
	}
	
	
	
	/**
	 * 查询技工基本信息
	 * @param pageNum
	 * @param pageSize
	 * @param fstatusid
	 * @param fvname
	 * @return
	 */
	
	public PageInfo<Mechanic> querychaic(Integer pageNum,Integer pageSize,String mname,Integer tid ){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Mechanic>(chaic.selectByPrimaryKey(mname,tid));
	}
	/**
	 * 修改技工信息
	 * @param record
	 * @return
	 */
	public int modifychaic(Mechanic record) {
		return chaic.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 技工离职
	 * @param fvid
	 * @return
	 */
	public int modifychaic(Integer mid) {
		return chaic.updateByPrimaryKey(mid);
	}
	/**
	 * 新增技工
	 * @param record
	 * @return
	 */
	public int addchaic(Mechanic record) {
		return chaic.insertSelective(record);
	}
	
	/**
	 * 查询车辆状态
	 * @return
	 */
	public List<FieldStatus>queryall(){
		return fsta.selectByPrimaryKey();
				
	}
	/***
	 * 查询技工状态
	 * @return
	 */
	public List<MechanicStatus>queryictsta(){
		return meicsta.selectByPrimaryKey();
				
	}
	/**
	 * 查询车辆型号
	 * @return
	 */
	public List<Vehicletype> queryvetype(){
		return vetype.selectByPrimaryKey();
	}
	/**
	 * 查询维修单
	 * @param pageNum
	 * @param pageSize
	 * @param servicestatusid
	 * @return
	 */
	public PageInfo<RepairBill> queryrebill(Integer pageNum,Integer pageSize,Integer servicestatusid){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<RepairBill>(rebill.selectByPrimaryKey(servicestatusid));
	}
}
