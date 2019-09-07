package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.WithdrawVO;

public interface AssetService {
	
		//계좌등록
		public void insertaccount(AccountVO vo);
		
		//은행목록 가져오기
		public List<BankVO> getBank();
		
		//계좌목록 가져오기 
		public List<AccountVO> getAccount(String id);
		
		//입금내역 등록
		public void insertdeposit(DepositVO vo);
		
		//출근내역 등록
		public void insertwithdraw(WithdrawVO vo);
		
		//입금내역 가져오기
		public List<DepositVO> getDeposit(String id);
		
		//출금내역 가져오기
		public List<WithdrawVO> getWithdraw(String id);
	
}
