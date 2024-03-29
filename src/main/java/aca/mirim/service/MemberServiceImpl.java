package aca.mirim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aca.mirim.domain.LoginDTO;
import aca.mirim.domain.MemberVO;
import aca.mirim.domain.Table;
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

	@Override
	public String findid(String pw, String name) {
		return memMapper.findid(pw, name);
	}

	@Override
	public String findpw(String id, String name) {
		return memMapper.findpw(id, name);
	}

	@Override
	public MemberVO getmember(String id) {
		return memMapper.getMember(id);
	}

	@Override
	public void updateMember(MemberVO vo) {
		memMapper.updateMember(vo);
		
	}

	@Override
	public List<Table> getTable() {
		return memMapper.getTable();
	}

}
