package com.accp.action.cjl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cjl.EmpBiz;
import com.accp.biz.cjl.LiZhiBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Dimission;
import com.accp.pojo.Employee;
import com.accp.vo.EmpAndBumenAndZhiwei;
import com.accp.vo.EmpAndBumenAndZhiweiAndLizhi;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/Lizhis")
public class LiZhiAction {
	@Autowired
	private LiZhiBiz biz;
	
	@Autowired
	private EmpBiz biz1;
	
	@Autowired
	private SyslogBiz syslogBiz;
	/**
	 * 查询离职的全部员工
	 * @return
	 */
	@GetMapping("{p}/{s}")
	public PageInfo<EmpAndBumenAndZhiweiAndLizhi> queryAll(@PathVariable Integer p, @PathVariable Integer s){
		PageHelper.startPage(p, s);
		
		return biz.LiZhiVo();
	}
	/**
	 * 查询单个员工姓名
	 */
	@GetMapping("Lizhi/{Empno}")
	public String queryByNo(@PathVariable String Empno) {
		PageInfo<EmpAndBumenAndZhiwei> pageInfo=biz1.EmpVo(null);
		String name=null;
		for (int i = 0; i < pageInfo.getList().size(); i++) {
			
			if (pageInfo.getList().get(i).getEmployeeno().equals(Empno)) {
				name=pageInfo.getList().get(i).getEmpname();
				break;
			}
			
		}
		return name;
	}
	@PostMapping("Lizhi/{value}/{lreason}")
	public Map<String, Object> addpost(@PathVariable String value,@PathVariable String lreason,HttpSession session) {
		Map<String, Object> message = new HashMap<String, Object>();
			biz.addLizhi(new Dimission(value, lreason, new Date()));
			biz.modifyZhuangtai(value);
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "新增员工离职");
			message.put("code", "200");
			message.put("msg", "ok");
			
		
		return message;
	}
	@DeleteMapping("Lizhi/{Empno}")
	public Map<String, Object> addDelete(@PathVariable String Empno,HttpSession session) {
		Map<String, Object> message = new HashMap<String, Object>();
			biz.remove(Empno);
			biz.modifyZhuangtai1(Empno);
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "回滚员工离职");
			message.put("code", "200");
			message.put("msg", "ok");
		return message;
	}
}
