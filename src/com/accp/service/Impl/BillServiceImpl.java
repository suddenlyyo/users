package com.accp.service.Impl;

import com.accp.dao.BillDao;
import com.accp.entity.Bill;
import com.accp.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("billService")
public class BillServiceImpl implements BillService {

	@Resource
	private BillDao billDao;
	/**
	 * 查询订单
	 *
	 * @param b
	 * @return
	 */
	@Override
	public Bill queryBill(Bill b) {
		return  billDao.queryBill(b);
	}

	/**
	 * 查询订单
	 *
	 * @param b
	 * @return
	 */
	@Override
	public List<Bill> queryBills(Bill b) {
		return billDao.queryBills(b);
	}

	/**
	 * 增加
	 *
	 * @param b
	 * @return
	 */
	@Override
	public int saveBill(Bill b) {
		return billDao.saveBill(b);
	}

	/**
	 * 删除
	 *
	 * @param b
	 * @return
	 */
	@Override
	public int deleteBill(Bill b) {
		return billDao.deleteBill(b);
	}

	/**
	 * 修改
	 *
	 * @param b
	 * @return
	 */
	@Override
	public int updateBill(Bill b) {
		return billDao.updateBill(b);
	}
}
