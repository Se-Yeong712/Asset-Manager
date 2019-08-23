package aca.mirim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;
import aca.mirim.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper memMapper;
	
	@Override
	public MemberVO login(LoginDTO dto) {
		return memMapper.login(dto);
	}

	@Override
	public void insertMember(MemberVO vo) {
		memMapper.insertMember(vo);
		
	}

	@Override
	public String checkId(String id) {
		return memMapper.checkId(id);
		
	}

}
