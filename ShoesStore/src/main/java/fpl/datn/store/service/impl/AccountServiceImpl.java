package fpl.datn.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpoly.datn.entity.Account;
import com.fpoly.datn.repository.AccountRepository;
import com.fpoly.datn.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository userRepository;

	@Override
	public Account findById(String username) {
		return userRepository.findById(username).get();
	}
	
	

}
