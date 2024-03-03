package my.home.oop.interfaces.impl;

import my.home.oop.interfaces.AccountBaseAction;

public class AccountBaseActionImpl implements AccountBaseAction {
    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {

    }

    public void test(){
        AccountBaseAction action = new AccountBaseActionImpl();
        action.unBlocking();
    }

}
