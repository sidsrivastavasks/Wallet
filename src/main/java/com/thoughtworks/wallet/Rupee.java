package com.thoughtworks.wallet;

public class Rupee {
    private final double value;
    
    public Rupee(double amount)throws Exception{
        if(amount<0)throw new Exception();
        this.value = amount;
    }

    public Rupee add(Rupee amount)throws Exception{
        return new Rupee(this.value + amount.value);
    }

    @Override
    public boolean equals(Object rupeeObj){
        if(rupeeObj==null)
            return false;

        if (rupeeObj.getClass() != this.getClass())
            return false;

        if(this==rupeeObj)
            return true;

        Rupee amount = (Rupee) rupeeObj;
        return (this.value==amount.value);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 7;
        hash = (prime * hash) + (int)value;
        
        return hash;
    }
}
