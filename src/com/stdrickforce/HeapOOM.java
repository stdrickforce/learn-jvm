package com.stdrickforce;

import java.util.List;
import java.util.ArrayList;

public class HeapOOM {
    private static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) list.add(new OOMObject());
    }
}

