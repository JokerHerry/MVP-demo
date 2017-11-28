package co.example.hzq.mvpdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.example.hzq.mvpdemo.R;
import co.example.hzq.mvpdemo.model.entity.User;
import co.example.hzq.mvpdemo.presenter.LoginPresenter;
import co.example.hzq.mvpdemo.presenter.LoginPresenterImpl;
import co.example.hzq.mvpdemo.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {


    @BindView(R.id.login_progress)
    ProgressBar loginProgress;
    @BindView(R.id.email)
    AutoCompleteTextView name;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.email_sign_in_button)
    Button btn;

    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        btn.setOnClickListener(this);
        presenter = new LoginPresenterImpl(this);
    }



    @Override
    public void loginSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ErrorPass() {
        Toast.makeText(this,"密码错误",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ErrorEnter() {
        Toast.makeText(this,"输入错误",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialog() {
        loginProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideDialog() {
        loginProgress.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        User user = new User(name.getText().toString(), password.getText().toString());
        presenter.checkLogin(user);
    }
}

