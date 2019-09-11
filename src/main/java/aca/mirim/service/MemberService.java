package aca.mirim.service;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;

public interface MemberService {
	
	public MemberVO login(LoginDTO dto);
	public String checkId(String id);
	public void insertMember(MemberVO vo);
	public String findid(String pw, String name);
	public String findpw(String id, String name);
	public MemberVO getmember(String id);
	public void updateMember(MemberVO vo);
	
}
