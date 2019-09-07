package aca.mirim.service;

import java.util.List;

import aca.mirim.domain.AccountVO;
import aca.mirim.domain.BankVO;
import aca.mirim.domain.DepositVO;
import aca.mirim.domain.WithdrawVO;

public interface AssetService {
	
		//���µ��
		public void insertaccount(AccountVO vo);
		
		//������ ��������
		public List<BankVO> getBank();
		
		//���¸�� �������� 
		public List<AccountVO> getAccount(String id);
		
		//�Աݳ��� ���
		public void insertdeposit(DepositVO vo);
		
		//��ٳ��� ���
		public void insertwithdraw(WithdrawVO vo);
		
		//�Աݳ��� ��������
		public List<DepositVO> getDeposit(String id);
		
		//��ݳ��� ��������
		public List<WithdrawVO> getWithdraw(String id);
	
}
