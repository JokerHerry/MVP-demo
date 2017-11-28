package co.example.hzq.mvpdemo.presenter;

import co.example.hzq.mvpdemo.model.LoginModel;
import co.example.hzq.mvpdemo.model.LoginModelImpl;
import co.example.hzq.mvpdemo.model.entity.User;
import co.example.hzq.mvpdemo.view.LoginView;

/**
 * Created by Hzq on 2017/11/28.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginModelListener{
    LoginView view;
    LoginModel model;

    public LoginPresenterImpl(LoginView loginView){
        this.view = loginView;
        model = new LoginModelImpl();
    }

    @Override
    public void checkLogin(User user) {
        if (view == null){
            return;
        }
        view.showDialog();
        model.login(user,this);
    }

    @Override
    public void loginSuccess() {
        view.hideDialog();
        view.loginSuccess();
    }

    @Override
    public void loginError() {
        view.hideDialog();
        view.ErrorEnter();
    }
}
