package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.WithdrawVO;

public interface AssetService {

		public void insertaccount(AccountVO vo);	

		public List<BankVO> getBank();
		
		public List<AccountVO> getAccount(String id);
		
		public void insertdeposit(DepositVO vo);		
		public void insertwithdraw(WithdrawVO vo);
		
		public List<DepositVO> getDeposit(String id);		
		public List<WithdrawVO> getWithdraw(String id);
	
		public Boolean accountchk(String account);
		
		public DepositVO seldeposit(int code);
		public WithdrawVO selwithdraw(int code);
		
		public void deletedeposit(int code);	
		public void deletewithdraw(int code);
		
		public void updatedeposit(DepositVO vo);	
		public void updatewithdraw(WithdrawVO vo);
		
}
