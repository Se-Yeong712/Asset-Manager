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

	@Override
	public List<DepositVO> getDeposit(String id) {
		return accMapper.getDeposit(id);
	}

	@Override
	public List<WithdrawVO> getWithdraw(String id) {
		return accMapper.getWithdraw(id);
	}

	@Override
	public Boolean accountchk(String account) {
		AccountVO vo = accMapper.accountchk(account);
		
		if(vo==null) {
			return false;
		}
		
		return true;
	}

	@Override
	public DepositVO seldeposit(int code) {
		return accMapper.seldeposit(code);
	}

	@Override
	public WithdrawVO selwithdraw(int code) {
		return accMapper.selwithdraw(code);
	}

	@Override
	public void deletedeposit(int code) {
		accMapper.deletedeposit(code);
	}

	@Override
	public void deletewithdraw(int code) {
		accMapper.deletewithdraw(code);
	}

	@Override
	public void updatedeposit(DepositVO vo) {
		accMapper.updatedeposit(vo);
		
	}

	@Override
	public void updatewithdraw(WithdrawVO vo) {
		accMapper.updatewithdraw(vo);
		
	}

	
	

	

}
