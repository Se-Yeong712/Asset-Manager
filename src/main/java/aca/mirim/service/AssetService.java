package aca.mirim.service;

import java.sql.Date;
import java.util.List;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.Impulse;
import aca.mirim.domain.Search;
import aca.mirim.domain.WithdrawVO;
import aca.mirim.domain.Category;
import aca.mirim.domain.getDepositVO;
import aca.mirim.domain.getWithdrawVO;

public interface AssetService {

		public void insertaccount(AccountVO vo);	

		public List<BankVO> getBank();
		
		public List<AccountVO> getAccount(String id);
		
		public void insertdeposit(DepositVO vo);		
		public void insertwithdraw(WithdrawVO vo);
	
		public Boolean accountchk(String account);
		
		public getDepositVO seldeposit(int code);
		public getWithdrawVO selwithdraw(int code);
		
		public void deletedeposit(int code);	
		public void deletewithdraw(int code);
		
		public void updatedeposit(DepositVO vo);	
		public void updatewithdraw(WithdrawVO vo);

		
		public List<DepositVO> getDeposit(String id, Search search);		
		public List<WithdrawVO> getWithdraw(String id, Search search);
		
		public List<DepositVO> getDepAccount(String id, Search search,String accountlist);
		public List<WithdrawVO> getWithAccount(String id, Search search,String accountlist);

		public Integer getCalendar(String table, String id, Date caldate);
		
		public int getGraph(String table, String id, String day);
		
		public List<Category> getcategory(String id);
		
		public Impulse getImpulse(String id);
}


