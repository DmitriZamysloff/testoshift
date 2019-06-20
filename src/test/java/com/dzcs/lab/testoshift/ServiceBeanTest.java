package com.dzcs.lab.testoshift;



import static org.junit.Assert.assertEquals;


public class ServiceBeanTest {



    @org.junit.Test
    public void giveMe() {
        String value = "Muztpofpw";
        String expected = ServiceBean.PREFIX + value;
        String received = new ServiceBean().giveMe(value);
        assertEquals(expected, received);
    }
}
