package com.accp.dao;

import java.util.List;

import com.accp.entity.Bill;

public interface BillDao {
	/**
	 * 查询订单
	 * @return
	 */
	Bill queryBill(Bill b);
	
	/**
	 * 查询订单
	 * @return
	 */
	List<Bill> queryBills(Bill b);
	
	/**
	 * 增加
	 * @param b
	 * @return
	 */
	int saveBill(Bill b);
	
	/**
	 * 删除 
	 * @param b
	 * @return
	 */
	int deleteBill(Bill b);
	
	/**
	 * 修改
	 * @param b
	 * @return
	 */
	int updateBill(Bill b);
}
