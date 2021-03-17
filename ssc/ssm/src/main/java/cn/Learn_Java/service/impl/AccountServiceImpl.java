package cn.Learn_Java.service.impl;
import cn.Learn_Java.dao.AccountDao;
import cn.Learn_Java.domain.Account;
import cn.Learn_Java.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return accountDao.findAll();
    }
    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");
        accountDao.saveAccount(account);
    }
}
