package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.WithdrawVO;
import aca.mirim.mapper.AssetMapper;

@Service
public class AssetServiceImpl implements AssetService{

	@Autowired
	AssetMapper accMapper;
	
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

	@Override
	public void insertdeposit(DepositVO vo) {
		accMapper.insertdeposit(vo);
	}

	@Override
	public void insertwithdraw(WithdrawVO vo) {
		accMapper.insertwithdraw(vo);
		
	}

}
