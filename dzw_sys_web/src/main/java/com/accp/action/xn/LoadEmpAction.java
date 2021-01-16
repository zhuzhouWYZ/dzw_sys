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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.LoadEmpBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Syfunction;

@SuppressWarnings("all")
@RestController
@RequestMapping("api/loadEmp")
public class LoadEmpAction {

	@Autowired
	private LoadEmpBiz loadEmpBiz;
	
	@Autowired
	private SyslogBiz syslogBiz;
	
	@GetMapping("/login/{emplogenid}/{emplogepaw}")
	public Map<String, Object> loginIn(HttpSession session,@PathVariable String emplogenid,@PathVariable String emplogepaw){
		Map<String, Object> message = new HashMap<String, Object>();
		Employee emp = loadEmpBiz.loginIn(emplogenid, emplogepaw);
		if (emp!=null) {
			
			session.setAttribute("EMP", emp);// 服务器保存
			syslogBiz.addSyslog(emp.getEmplogenid(), "用户登录");
			//System.out.println(session.getId());
			message.put("EMP", emp);// 客户端保存
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "300");
			message.put("msg", "no");
		}
		
		return message;
	}
	
	@GetMapping("/getLoginEMP")
	public Employee getEMP(HttpSession session) {
		return (Employee) session.getAttribute("EMP");
	}
	
	@GetMapping("/loginOut")
	public Map<String, String> loginOut(HttpSession session){
		session.removeAttribute("EMP");
		session.invalidate();// 立即失效
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
	@GetMapping("/getSyfunTree")
	public List getUserFunTree(HttpSession session) {
		//从session获得用户，以便得到权限
		Employee emp = (Employee)session.getAttribute("EMP");
		//System.out.println(emp.getJurisdiction().getSyfunctions());
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		//System.out.println(session.getAttribute("EMP"));
		for (Syfunction fun : emp.getJurisdiction().getSyfunctions()) {
			//System.out.println(fun.getParentSyfun().getSyfunctionname());
			menuNames.add(fun.getParentSyfun().getSyfunctionname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);// 0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Syfunction fun : emp.getJurisdiction().getSyfunctions()) {
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
		}
		return tree;
	}
}
