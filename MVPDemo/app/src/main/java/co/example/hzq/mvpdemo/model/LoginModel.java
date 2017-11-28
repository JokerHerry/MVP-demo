package co.example.hzq.mvpdemo.model;

import co.example.hzq.mvpdemo.model.entity.User;
import co.example.hzq.mvpdemo.presenter.LoginModelListener;

/**
 * Created by Hzq on 2017/11/28.
 */

public interface LoginModel {
    void login(User user, LoginModelListener listener);
}
