package com.mzh.financial.back.personinfo.service;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.personinfo.domain.TDataUser;

public interface UserService {
    void insertUserinfo(TDataUser userInfo);
    void insertUserinfo(int accountId);
    ResponseDTO<Void> updateUserinfo(TDataUser userInfo);
    void delUserinfoByAccountId(int accountId);
    void getUserinfoByAccountId(int accountId);
}
