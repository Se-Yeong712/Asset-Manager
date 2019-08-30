package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;

public interface AccountService {
	
	public void insertaccount(AccountVO vo);
	public List<BankVO> getBank();
	public List<AccountVO> getAccount(String id);
	
}
