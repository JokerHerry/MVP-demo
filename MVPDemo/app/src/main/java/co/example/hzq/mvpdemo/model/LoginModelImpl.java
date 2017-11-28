package co.example.hzq.mvpdemo.model;


import android.os.Handler;
import android.text.TextUtils;

import co.example.hzq.mvpdemo.model.entity.User;
import co.example.hzq.mvpdemo.presenter.LoginModelListener;

/**
 * Created by Hzq on 2017/11/28.
 */

public class LoginModelImpl implements LoginModel{
    @Override
    public void login(User user, final LoginModelListener listener) {
        final String name = user.getName();
        final String password = user.getPassword();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Boolean error =false;
                if (TextUtils.isEmpty(name)){
                    error = true;
                    //输入错误
                    System.out.println("输入错误");
                    listener.loginError();
                }
                if (TextUtils.isEmpty(password)){
                    error = true;
                    //输入错误
                    System.out.println("输入错误");
                    listener.loginError();
                }
                if(!error){
                    //登录成功
                    System.out.println("登录成功");
                    listener.loginSuccess();
                }
            }
        },2000);
    }
}
