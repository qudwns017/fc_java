package chapter03.ch13.web.userinfo;

import chapter03.ch13.domain.userinfo.UserInfo;
import chapter03.ch13.domain.userinfo.dao.UserInfoDao;
import chapter03.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import chapter03.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\repos\\FASTCAM\\ch02\\src\\chapter03\\ch13\\db.properties");
        FileInputStream fis = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("John");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("DB ERROR");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
