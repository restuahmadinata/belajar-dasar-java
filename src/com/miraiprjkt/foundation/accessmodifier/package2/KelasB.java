package com.miraiprjkt.foundation.accessmodifier.package2;

import com.miraiprjkt.foundation.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    
    protected void methodC() {
        super.methodC();
        System.out.println("Manggil si protected dari package luar");
    }

}
