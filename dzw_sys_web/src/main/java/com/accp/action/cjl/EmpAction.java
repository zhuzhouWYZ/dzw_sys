package com.accp.action.cjl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, Object> addpost(@RequestBody Employee employee) {
		
		Map<String, Object> message = new HashMap<String, Object>();
			biz.addEmp(employee);
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
	public Map<String, Object> bumenInsert(@RequestBody Department department){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.addDepart(department);
		message.put("code", "200");
		message.put("msg", "ok");

		return message;
	}
	/**
	 * 修改部门名称
	 */
	@PutMapping("bumen")
	public Map<String, Object> bumenupdate(@RequestBody Department department){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.modifyBumen(department);
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
	public Map<String, Object> bumenremove(@PathVariable int depatId){
		Map<String, Object> message = new HashMap<String, Object>();
		biz1.removeBumen(depatId);
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
	public Map<String, Object> updatepost(@RequestBody Employee employee) {
			
			Map<String, Object> message = new HashMap<String, Object>();
				biz.modifyEmp(employee);
				message.put("code", "200");
				message.put("msg", "ok");
			
			
			return message;
	}
	@DeleteMapping("Emp/{Empno}")
	public Map<String, Object> deletePersonById(@PathVariable String  Empno) {
		biz.removeEmp(Empno);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
}