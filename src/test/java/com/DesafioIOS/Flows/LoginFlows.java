package com.DesafioIOS.Flows;


import com.DesafioIOS.Screens.LoginScreen;

public class LoginFlows {
    //Objects and constructor
    LoginScreen loginScreen;

    public LoginFlows() {
        loginScreen = new LoginScreen();
    }

    //Flows
    public void efetuarLogin(String username, String password) throws InterruptedException {
        loginScreen.preencherUsuario(username);
        loginScreen.preencherSenha(password);
    }
}