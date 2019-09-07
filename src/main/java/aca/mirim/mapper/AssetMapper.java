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
	
	@Insert("INSERT INTO DEPOSIT(REGDATE,ACCOUNT,AMOUNT,CATEGORY,ID) VALUES(#{regdate},#{account},#{amount},#{category},#{id})")
	public void insertdeposit(DepositVO vo);
	
	@Insert("INSERT INTO WITHDRAW(REGDATE,ACCOUNT,AMOUNT,CATEGORY,ID) VALUES(#{regdate},#{account},#{amount},#{category},#{id})")
	public void insertwithdraw(WithdrawVO vo);
	
	@Select("SELECT * FROM DEPOSIT WHERE id=#{id}")
	public List<DepositVO> getDeposit(String id);
	
	@Select("SELECT * FROM WITHDRAW WHERE id=#{id}")
	public List<WithdrawVO> getWithdraw(String id);
	
	
}
