package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class RegisterResponse {
    @SerializedName("errorCode")
    public int errorCode;
    @SerializedName("errorMsg")
    public String errorMsg;
}
