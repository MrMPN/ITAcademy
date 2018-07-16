package com.example.java.persistance;

import com.example.java.domain.Florist;


public class FloristRepository {
    private Florist florist;

    public Florist getFlorist() throws Exception {
        if (florist == null)throw new Exception("Florist not created");
        return florist;
    }

    public void saveFlorist(Florist florist) throws Exception {
        if (florist == null)throw new Exception("Florist not created");
        this.florist = florist;
    }
}
