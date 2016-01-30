package org.whispersystems.textsecure.api.util;

import java.lang.System;

class ArrayCompat {
    public byte[] copyOfRange(byte[] from, int start, int end){
        int length = end - start;
        byte[] result = new byte[length];
        System.arraycopy(from, start, result, 0, length);
        return result;
    }
}
