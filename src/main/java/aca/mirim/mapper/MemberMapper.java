package aca.mirim.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;

public interface MemberMapper {
	
	@Select("SELECT * FROM MEMBER WHERE id=#{id} AND pw=#{pw}")
	public MemberVO login(LoginDTO dto);
	
	@Select("SELECT * FROM MEMBER WHERE id=#{id}")
	public String checkId(String id);
	
	@Insert("INSERT INTO MEMBER(id, pw, name,phone,email) VALUES(#{id}, #{pw},#{name},#{phone},#{email})")
	public void insertMember(MemberVO vo);
	
	@Select("SELECT id FROM MEMBER WHERE pw=#{pw} and name=#{name}")
	public String findid(@Param("pw")String pw, @Param("name")	String name);
	
	@Select("SELECT pw FROM MEMBER WHERE id=#{id} and name=#{name}")
	public String findpw(@Param("id")String id, @Param("name")String name);	
}
