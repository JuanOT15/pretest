package com.tdea.pretest;

import com.intuit.karate.junit5.Karate;

public class karateRun {

    @Karate.Test

    Karate TestKarate(){
        return Karate.run("classpath:com.tdea.pretest/karate");
    }


}
