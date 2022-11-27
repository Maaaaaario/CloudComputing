package com.cloudcomputing.bussinesscomponent;

import com.cloudcomputing.common.Theme;
import org.springframework.stereotype.Service;


public interface PostBc {

    public String post(String id, Theme theme, String date, String time, String comment);
}
