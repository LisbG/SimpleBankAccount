package com.lisboa.simplebankaccount.model.entities;

import java.util.UUID;

public class RandomId {

    public static String createRandomId() {
        return UUID.randomUUID().toString().substring(0, 4);
    }
}
