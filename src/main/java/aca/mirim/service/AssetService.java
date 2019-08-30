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
	
}
