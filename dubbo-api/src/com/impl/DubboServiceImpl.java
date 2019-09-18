package java.com.impl;

import java.com.inter.DubboService;

public class DubboServiceImpl implements DubboService {

    @Override
    public String getMessage(String msg) {
        return "receive your call: " + msg;
    }
}
