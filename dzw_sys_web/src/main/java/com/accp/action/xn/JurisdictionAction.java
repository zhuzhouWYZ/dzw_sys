package com.accp.action.xn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.JurisdictionBiz;
import com.accp.biz.xn.SyfunctionBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Jurisdiction;
import com.accp.pojo.Syfunction;

@SuppressWarnings("all")
@RestController
@RequestMapping("api/jurs")
public class JurisdictionAction {

	@Autowired
	private JurisdictionBiz jurisdictionBiz;
	
	@Autowired
	private SyfunctionBiz syfunctionBiz;
	
	@Autowired
	private SyslogBiz syslogBiz;
	
	@GetMapping("/jurandfun")
	public List<Jurisdiction> getJurMap(){
		List<Jurisdiction> jurs = jurisdictionBiz.queryAllJurMap();
		for (Jurisdiction jur : jurs) {		
			System.out.println("每个职位权限长度:" + jur.getSyfunctions().size());
			List tree = new ArrayList();
			Set<String> menuNames = new TreeSet<String>();
			for (Syfunction fun : jur.getSyfunctions()) {//一级菜单项
				if (null != fun.getParentSyfun()) {
					menuNames.add(fun.getParentSyfun().getSyfunctionname());
				}
			}
			int i =1;
			for (String name : menuNames) {//二级菜单项
				Map<String, Object> node = new HashMap<String, Object>();
				node.put("id", i);// 0:根级菜单
				node.put("text", name);
				List nodeChild = new ArrayList();
				for (Syfunction fun : jur.getSyfunctions()) {
					// 匹配是否是当前菜单的子项
					if (name.equals(fun.getParentSyfun().getSyfunctionname())) {
						Map<String, Object> n = new HashMap<String, Object>();
						n.put("id", fun.getSyfunctionid());
						n.put("text", fun.getSyfunctionname());
						nodeChild.add(n);
					}
				}
				node.put("children", nodeChild);
				tree.add(node);
				i++;
			}
			
			jur.setSyfunctions(tree);
		}
		
		return jurs;
	}
	
	@GetMapping("/allSyfun")
	public List<Syfunction> getSyfunMap(){
		List<Syfunction> syfunctions = syfunctionBiz.queryAllSyfun();
			List tree = new ArrayList();
			Set<String> menuNames = new TreeSet<String>();
			for (Syfunction fun : syfunctions) {//一级菜单项
				if (null != fun.getParentSyfun()) {
					menuNames.add(fun.getParentSyfun().getSyfunctionname());
				}
			}
			int i =1;
			for (String name : menuNames) {//二级菜单项
				Map<String, Object> node = new HashMap<String, Object>();
				node.put("id", i);// 0:根级菜单
				node.put("text", name);
				List nodeChild = new ArrayList();
				
				for (Syfunction fun : syfunctions) {
					// 匹配是否是当前菜单的子项
					if (null != fun.getParentSyfun()) {
						if (name.equals(fun.getParentSyfun().getSyfunctionname())) {
							Map<String, Object> n = new HashMap<String, Object>();
							n.put("id", fun.getSyfunctionid());
							n.put("text", fun.getSyfunctionname());
							nodeChild.add(n);
						}
					}
				}
				node.put("children", nodeChild);
				tree.add(node);
				i++;
			}
		return tree;
	}
	
	/**
	 * 删除角色权限
	 * @return
	 */
	@RequestMapping("/jur/delqx/{jurid}/{syfunid}")
	public Map<String, String> removeJurQx(@PathVariable String jurid,@PathVariable String syfunid,HttpSession session){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.removeJurQx(jurid, syfunid)!=0) {
			message.put("code", "200");
			message.put("msg", "删除权限成功！");
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "删除角色权限");
		}else {
			message.put("code", "500");
			message.put("msg", "删除权限失败！");
		}
		return message;
	}
	/**
	 * 查询所有角色
	 * @return
	 */
	@GetMapping
	public  List<Jurisdiction> getAllJurisdictions(){
		return jurisdictionBiz.queryAllJurisdictions();
	}
	
	@RequestMapping("/jur/add")
	public Map<String, String> addJurisdiction(@RequestBody Jurisdiction jurisdiction,HttpSession session){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.addJurisdiction(jurisdiction) > 0) {
			message.put("code", "200");
			message.put("msg", "新增角色成功！");
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "新增角色");
		}else {
			message.put("code", "500");
			message.put("msg", "新增角色失败！");
		}
		return message;
	}
	
	@RequestMapping("/jur/modify")
	public Map<String, String> modifyJurisdiction(@RequestBody Jurisdiction jurisdiction,HttpSession session){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.modifyJurisdiction(jurisdiction) > 0) {
			message.put("code", "200");
			message.put("msg", "修改角色成功！");
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "修改角色信息");
		}else {
			message.put("code", "500");
			message.put("msg", "修改角色失败！");
		}
		return message;
	}
	
	@RequestMapping("/jur/remove/{jurisdictionid}")
	public Map<String, String> removeJurisdiction(@PathVariable String jurisdictionid,HttpSession session){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.removeJurisdiction(jurisdictionid) > 0) {
			message.put("code", "200");
			message.put("msg", "删除角色成功！");
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "删除角色");
		}else {
			message.put("code", "500");
			message.put("msg", "删除角色失败！");
		}
		return message;
	}
	
}
