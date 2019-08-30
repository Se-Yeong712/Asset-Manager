package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountMapper accMapper;
	
	@Override
	public void insertaccount(AccountVO vo) {
		accMapper.insertaccount(vo);
	}

	@Override
	public List<BankVO> getBank() {
		return accMapper.getBank();
	}

	@Override
	public List<AccountVO> getAccount(String id) {
		return accMapper.getAccount(id);
	}

}
