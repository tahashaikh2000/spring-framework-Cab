package com.niit.domain;

public class Cab {
    private int CustomerId;
    private int Fair;

    public Cab() {
    }

   public Cab(int CustomerId, int Fair){
        this.CustomerId = CustomerId;
        this.Fair = Fair;
   }

    public void setCustomerId(int customerId) {
        this.CustomerId = customerId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setFair(int fairId) {
        this.Fair = fairId;
    }

    public int getFair() {
        return getFair();
    }

    @Override
    public String toString() {
        return "Cab{" +
                "CustomerId=" + CustomerId +
                ", Fair=" + Fair +
                '}';
    }
}
