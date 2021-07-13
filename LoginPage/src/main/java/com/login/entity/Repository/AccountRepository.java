package com.login.entity.Repository;

import com.login.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    public Account findByEmail(String email);
    public Account findByUsername(String username);
}