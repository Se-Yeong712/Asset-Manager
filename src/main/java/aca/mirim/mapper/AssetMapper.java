package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.WithdrawVO;

public interface AssetMapper {

	@Insert("INSERT INTO ACCOUNT (ACCOUNT, BANK, ANAME, ID) VALUES (#{account},#{bank},#{aname},#{id})")
	public void insertaccount(AccountVO vo);
	
	@Select("SELECT * FROM BANK")
	public List<BankVO> getBank(); 
	
	@Select("Select * FROM ACCOUNT WHERE id=#{id}")
	public List<AccountVO> getAccount(String id);
	
	@Select("INSERT INTO DEPOSIT(DEPDATE,DEPACCOUNT,DEPAMOUNT,DEPCATE,ID) VALUES(#{depdate},#{depaccount},#{depamount},#{depcate},#{id})")
	public void insertdeposit(DepositVO vo);
	
	@Select("INSERT INTO WITHDRAW(WITHDATE,WITHACCOUNT,WITHAMOUNT,WITHCATE,ID) VALUES(#{withdate},#{withaccount},#{withamount},#{withcate},#{id})")
	public void insertwithdraw(WithdrawVO vo);
	
	
}
