package com.accp.control;

import com.accp.entity.Bill;
import com.accp.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class billControl {
    @Resource
    private BillService billService;
    @RequestMapping("/Bill.htm")
    public String toBillList(Bill b, Model model){
        List<Bill> bills = billService.queryBills(b);
        model.addAttribute("billList",bills);
        return "/jsp/billlist";
    }
    @RequestMapping("/Billv.htm")
    public String toBill(Bill b, Model model){
        Bill queryBill = billService.queryBill(b);
        model.addAttribute("bill",queryBill);
        return "/jsp/billview";
    }
    @RequestMapping("/BillAdd.htm")
    public String addBill(Bill b, Model model){
        Bill queryBill = billService.queryBill(b);
        model.addAttribute("bill",queryBill);
        return "/jsp/billview";
    }

}
