package aca.mirim.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	
	@Select("SELECT * FROM ACCOUNT WHERE account=#{account}")
	public AccountVO accountchk(String account);
	
	@Select("SELECT * FROM DEPOSIT WHERE code=#{code}")
	public DepositVO seldeposit(int code);
	
	@Select("SELECT * FROM WITHDRAW WHERE code=#{code}")
	public WithdrawVO selwithdraw(int code);
	
	@Delete("DELETE FROM DEPOSIT WHERE code=#{code}")
	public void deletedeposit(int code);
	
	@Delete("DELETE FROM WITHDRAW WHERE code=#{code}")
	public void deletewithdraw(int code);
	
	@Update("UPDATE DEPOSIT SET regdate=#{regdate}, account=#{account},amount=#{amount},category=#{category} where code=#{code}")
	public void updatedeposit(DepositVO vo);
	
	@Update("UPDATE WITHDRAW SET regdate=#{regdate}, account=#{account},amount=#{amount},category=#{category} where code=#{code}")
	public void updatewithdraw(WithdrawVO vo);
	
	
	@Select("SELECT * FROM DEPOSIT WHERE id=#{id} ${term}")
	public List<DepositVO> getDeposit(@Param("id")String id,@Param("term")String term);
	
	@Select("SELECT * FROM WITHDRAW WHERE id=#{id} ${term}")
	public List<WithdrawVO> getWithdraw(@Param("id")String id,@Param("term")String term);
	
	
	@Select("SELECT * FROM DEPOSIT WHERE id=#{id} AND account=#{accountlist} ${term}")
	public List<DepositVO> getDepAccount(@Param("id")String id,@Param("term")String term,@Param("accountlist")String accountlist );
	
	@Select("SELECT * FROM WITHDRAW WHERE id=#{id} AND account=#{accountlist} ${term}")
	public List<WithdrawVO> getWithAccount(@Param("id")String id,@Param("term")String term,@Param("accountlist")String accountlist );
	
	
	
	@Select("SELECT count(code) FROM ${table} WHERE id=#{id} AND regdate=trunc(sysdate,'iw')${day}")
	public int getGraph(@Param("table") String table, @Param("id")String id,@Param("day")String day);
	
}
