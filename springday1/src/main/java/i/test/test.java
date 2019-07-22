package i.test;

import i.dao.AccountDao;
import i.uitils.iocu;

public class test {
    public static void main(String[] args) throws Exception{
        AccountDao dao = iocu.getBean("accountDao");
        dao.saveAccount();
    }
}
