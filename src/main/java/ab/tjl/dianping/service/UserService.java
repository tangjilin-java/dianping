package ab.tjl.dianping.service;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.model.UserModel;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author:TangJiLin
 * @Description:用户业务接口
 * @Date: Created in 2020/2/6 15:20
 * @Modified By:
 */
public interface UserService {

    UserModel getUser(Integer id);

    UserModel register(UserModel registerUser) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException;

    UserModel login(String telphone,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException, BusinessException;

    Integer countAllUser();
}
