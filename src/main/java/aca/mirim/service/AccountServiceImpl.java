package aca.mirim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.AccountVO;
import aca.mirim.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountMapper accMapper;
	
	@Override
	public void insertaccount(AccountVO vo) {
		accMapper.insertaccount(vo);
	}

}
