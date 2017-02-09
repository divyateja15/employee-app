package com.revature.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.empapp.model.Emp121;
import com.revature.empapp.util.ConnectionUtil;

public class Dao {
	private JdbcTemplate jt=ConnectionUtil.getJdbcTemplate();
	public void save(Emp121 e)
	{
		String sql="insert into Emp121(name,designation(?,?)";
		Object[] params={e.getName(),e.getDesignation()};
		int row=jt.update(sql,params);
	System.out.println(+row);

	}
}
	

