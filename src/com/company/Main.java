package com.company;

import state.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Document document = new Document();

        State currentState = new SendState();
        currentState.setNextState(document);

//        currentState = new NewState();
//        currentState.setNextState(document);
//
//        document.setDocumentOk(false);
//        currentState = new SignedState();
//        currentState.setNextState(document);

    }
}
