package com.accp.service.Impl;

import com.accp.dao.UserDao;
import com.accp.entity.Pager;
import com.accp.entity.User;
import com.accp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userBiz")
public class UserServiceImpl implements UserService {
	@Resource
  private UserDao userDao;
	/**
	 * 查询单个用户
	 *
	 * @param u
	 * @return
	 */
	@Override
	public User queryUser(User u) {
		return  userDao.queryUser(u);
	}

	/**
	 * 删除用户
	 *
	 * @param user
	 * @return
	 */
	@Override
	public int deleteUser(User user) {
		return userDao.deleteUser(user);
	}

	/**
	 * 修改
	 *
	 * @param user
	 * @return
	 */
	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	/**
	 * 保存
	 *
	 * @param user
	 * @return
	 */
	@Override
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}

	/**
	 * 查询所有用户
	 *
	 * @return
	 */
	@Override
	public List<User> queryUsers() {
		return userDao.queryUsers();
	}

	/**
	 * 分页
	 *
	 * @param user
	 * @param pagerNo
	 * @param pagerSize
	 * @return
	 */
	@Override
	public Pager<User> queryUserPager(User user, int pagerNo, int pagerSize) {
		return userDao.queryUserPager(user,pagerNo,pagerSize);
	}

	/**
	 * 查询用户信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public User queryUserll(User user) {
		return userDao.queryUserll(user);
	}

	/**
	 * 修改密码
	 *
	 * @param user
	 * @param pwd
	 * @return
	 */
	@Override
	public User updateUsers(User user, String pwd) {
		return userDao.updateUsers(user,pwd);
	}
}
