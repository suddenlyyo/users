package com.accp.dao;

import com.accp.entity.Pager;
import com.accp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * 查询单个用户
     *
     * @param u
     * @return
     */
    User queryUser(User u);

    /**
     * 删除用户
     *
     * @param user
     * @return
     */
    int deleteUser(User user);

    /**
     * 修改
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 保存
     *
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> queryUsers();

    /**
     * 分页
     *
     * @return
     */
    Pager<User> queryUserPager(User user, int pagerNo, int pagerSize);

    /**
     * 查询用户信息
     * @param user
     * @return
     */
    User queryUserll(User user);

    /**
     * 修改密码
     * @param user
     * @param pwd
     * @return
     */
    User updateUsers(User user, @Param("pwd") String pwd);

}
