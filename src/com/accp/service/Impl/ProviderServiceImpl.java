package com.accp.service.Impl;

import com.accp.dao.ProviderDao;
import com.accp.entity.Provider;
import com.accp.service.ProviderService;

import javax.annotation.Resource;
import java.util.List;

public class ProviderServiceImpl implements ProviderService {

	@Resource
	private ProviderDao providerDao;
	/**
	 * 查询所有供应商
	 *
	 * @param p
	 * @return
	 */
	@Override
	public List<Provider> queryProviders(Provider p) {
		return providerDao.queryProviders(p);
	}

	/**
	 * 查询供应商
	 *
	 * @param p
	 * @return
	 */
	@Override
	public Provider queryProvider(Provider p) {
		return providerDao.queryProvider(p);
	}

	/**
	 * 删除供应商
	 *
	 * @param p
	 * @return
	 */
	@Override
	public int deleteProvider(Provider p) {
		return providerDao.deleteProvider(p);
	}

	/**
	 * 修改
	 *
	 * @param p
	 * @return
	 */
	@Override
	public int updateProvider(Provider p) {
		return providerDao.updateProvider(p);
	}

	/**
	 * 保存
	 *
	 * @param p
	 * @return
	 */
	@Override
	public int saveProvider(Provider p) {
		return providerDao.saveProvider(p);
	}
}
