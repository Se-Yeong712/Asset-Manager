package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;

public interface AccountMapper {

	@Insert("INSERT INTO ACCOUNT (ACCOUNT, BANK, ANAME, ID) VALUES (#{account},#{bank},#{aname},#{id})")
	public void insertaccount(AccountVO vo);
	
	@Select("SELECT * FROM BANK")
	public List<BankVO> getBank(); 
	
	@Select("Select * FROM ACCOUNT WHERE id=#{id}")
	public List<AccountVO> getAccount(String id);
	
}
