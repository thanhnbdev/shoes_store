package fpl.datn.store.service;

import com.fpoly.datn.entity.Account;

public interface AccountService {
	Account findById(String username);
}
