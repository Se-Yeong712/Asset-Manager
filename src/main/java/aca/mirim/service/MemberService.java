package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;
import aca.mirim.domain.Table;

public interface MemberService {
	
	public MemberVO login(LoginDTO dto);
	public String checkId(String id);
	public void insertMember(MemberVO vo);
	public String findid(String pw, String name);
	public String findpw(String id, String name);
	public MemberVO getmember(String id);
	public void updateMember(MemberVO vo);
	public List<Table> getTable();
	
}
