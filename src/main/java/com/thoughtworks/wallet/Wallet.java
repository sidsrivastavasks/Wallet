package com.thoughtworks.wallet;

public class Wallet {
    private Rupee balance;

    public Wallet() throws Exception{
        this.balance = new Rupee(0.0);
    }
    
    public void put(Rupee amount)throws Exception{
        this.balance = this.balance.add(amount);
    }

    public Rupee balance(){
        return balance;
    }
}
