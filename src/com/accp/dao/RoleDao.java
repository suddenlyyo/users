package com.accp.dao;

import com.accp.entity.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> queryRoles();
}
