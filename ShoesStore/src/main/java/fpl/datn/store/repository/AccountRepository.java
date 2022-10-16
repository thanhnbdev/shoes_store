package fpl.datn.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.datn.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
}
