package com.accp.dao;

import java.util.List;



import com.accp.entity.Provider;

public interface ProviderDao {
	/**
	 * 查询所有供应商
	 * @return
	 */
List<Provider> queryProviders(Provider p);
/**
 * 查询供应商
 * @return
 */
Provider queryProvider(Provider p);
/**
 * 删除供应商
 * @param p
 * @return
 */
int deleteProvider(Provider p);

/**
 * 修改
 * @param p
 * @return
 */
int updateProvider(Provider p);
/**
 * 保存
 * @param p
 * @return
 */
int saveProvider(Provider p);
}
