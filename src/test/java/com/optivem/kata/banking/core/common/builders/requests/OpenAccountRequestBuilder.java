package com.optivem.kata.banking.core.common.builders.requests;

import com.optivem.kata.banking.core.usecases.openaccount.OpenAccountRequest;

public class OpenAccountRequestBuilder {

    private static final String FIRST_NAME = "Mary";
    private static final String LAST_NAME = "Jackson";
    private static final int INITIAL_BALANCE = 200;

    private String firstName;
    private String lastName;
    private int balance;

    public OpenAccountRequestBuilder() {
        firstName(FIRST_NAME);
        lastName(LAST_NAME);
        balance(INITIAL_BALANCE);
    }

    public static OpenAccountRequestBuilder anOpenAccountRequest() {
        return new OpenAccountRequestBuilder();
    }

    public OpenAccountRequestBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public OpenAccountRequestBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public OpenAccountRequestBuilder balance(int balance) {
        this.balance = balance;
        return this;
    }

    public OpenAccountRequest build() {
        return OpenAccountRequest.builder()
                .firstName(firstName)
                .lastName(lastName)
                .balance(balance)
                .build();
    }
}
