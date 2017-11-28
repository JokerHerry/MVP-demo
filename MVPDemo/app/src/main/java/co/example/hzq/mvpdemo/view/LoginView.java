package co.example.hzq.mvpdemo.view;

/**
 * Created by Hzq on 2017/11/28.
 */

public interface LoginView {
    void loginSuccess();
    void ErrorPass();
    void ErrorEnter();

    void showDialog();
    void hideDialog();
}
