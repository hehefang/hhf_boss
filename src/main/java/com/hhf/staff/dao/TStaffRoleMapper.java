package com.hhf.staff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hhf.staff.model.TStaffRole;
import com.hhf.staff.model.TStaffRoleExample;

@Repository
public interface TStaffRoleMapper {
	int countByExample(TStaffRoleExample example);

	int deleteByExample(TStaffRoleExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TStaffRole record);

	int insertSelective(TStaffRole record);

	List<TStaffRole> selectByExample(TStaffRoleExample example);

	TStaffRole selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TStaffRole record,
			@Param("example") TStaffRoleExample example);

	int updateByExample(@Param("record") TStaffRole record,
			@Param("example") TStaffRoleExample example);

	int updateByPrimaryKeySelective(TStaffRole record);

	int updateByPrimaryKey(TStaffRole record);
}