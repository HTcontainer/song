package i.impl;

import i.dao.AccountDao;

public class AccountDaoImpl implements AccountDao{
    public  AccountDaoImpl(){
        System.out.println("无参数的构造方法，创建对象");
    }

    public void saveAccount() {
        System.out.println("执行保存数据操作---");
    }
}
