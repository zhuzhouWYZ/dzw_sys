package com.accp.action.cjl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cjl.CjlBiz;
import com.accp.biz.cjl.EmpBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Posttable;
import com.accp.vo.EmpAndBumenAndZhiwei;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Emps")
public class EmpAction {
	@Autowired
	private EmpBiz biz;
	
	@Autowired
	private CjlBiz biz1;
	
	@Autowired
	private SyslogBiz syslogBiz;
	/**
	 * 查询全部员工
	 * @return
	 */
	@GetMapping("{p}/{s}/{empname}")
	public PageInfo<EmpAndBumenAndZhiwei> queryAll(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String empname){
		PageHelper.startPage(p, s);
		if (empname.equals("null")) {
			empname=null;
		}
		System.out.println(empname);
		return biz.EmpVo(empname);
	}
	/**
	 * 新增员工
	 */
	@PostMapping("Emp")
	public Map<String, Object> addpost(@RequestBody Employee employee,HttpSession session) {
		employee.setStatus(0);
		Map<String, Object> message = new HashMap<String, Object>();
			biz.addEmp(employee);
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "新增员工");
			message.put("code", "200");
			message.put("msg", "ok");
		
		
		return message;
	}
	/**
	 * 查询所有部门
	 */
	@GetMapping("bumen")
	public List<Department> bumenquery(){
		return biz1.queryAll();
	}
	/**
	 * 新增一个部门
	 */
	@PostMapping("bumen")
	public Map<String, Object> bumenInsert(@RequestBody Department department,HttpSession session){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.addDepart(department);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "新增部门");
		message.put("code", "200");
		message.put("msg", "ok");

		return message;
	}
	/**
	 * 修改部门名称
	 */
	@PutMapping("bumen")
	public Map<String, Object> bumenupdate(@RequestBody Department department,HttpSession session){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.modifyBumen(department);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "修改部门");
		message.put("code", "200");
		message.put("msg", "ok");

		return message;
	}
	/**
	 * 判断部门是否有人
	 */
	@GetMapping("bumenIsNull/{depatId}")
	public int bumenIsNull(@PathVariable int depatId) {
		PageInfo<EmpAndBumenAndZhiwei> empvo=biz.EmpVo(null);
		for (int i = 0; i < empvo.getList().size(); i++) {
			if (empvo.getList().get(i).getDepartmentid()==depatId) {
				return 1;
			}
		}
		return 0;
	}
	/**
	 * 删除一个部门
	 */
	@DeleteMapping("bumenIsNull/{depatId}")
	public Map<String, Object> bumenremove(@PathVariable int depatId,HttpSession session){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.removeBumen(depatId);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "删除部门");
		message.put("code", "200");
		message.put("msg", "ok");

		return message;
	}
	/**
	 * 根据员工id查询
	 */
	@GetMapping("Emp/{empno}")
	public Employee queryByid(@PathVariable String empno) {
		return biz.queryByid(empno);
	}
	@PutMapping("Emp")
	public Map<String, Object> updatepost(@RequestBody Employee employee,HttpSession session) {
			
			Map<String, Object> message = new HashMap<String, Object>();
				biz.modifyEmp(employee);
				syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "修改员工");
				message.put("code", "200");
				message.put("msg", "ok");
			
			
			return message;
	}
	@DeleteMapping("Emp/{Empno}")
	public Map<String, Object> deletePersonById(@PathVariable String  Empno,HttpSession session) {
		biz.removeEmp(Empno);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "删除员工");
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
}
