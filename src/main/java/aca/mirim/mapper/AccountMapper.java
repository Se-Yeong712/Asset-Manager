package aca.mirim.mapper;

import org.apache.ibatis.annotations.Insert;

import aca.mirim.domain.AccountVO;

public interface AccountMapper {

	@Insert("INSERT INTO ACCOUNT (ACCOUNT, BANK, ANAME, ID) VALUES (#{account},#{bank},#{aname},#{id})")
	public void insertaccount(AccountVO vo);
	
}
