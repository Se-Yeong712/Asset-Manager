package aca.mirim.service;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;

public interface MemberService {
	
	public MemberVO login(LoginDTO dto);
	public void insertMember(MemberVO vo);

}
