package com.cos.oauth.provider;

import java.util.Map;

public class GoogleUserInfo implements OAuth2UserInfo{

    Map<String,Object> attributes;

    public GoogleUserInfo(Map<String,Object> attributes){
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getProviderId() {
        return (String)attributes.get("sub");
    }

    @Override
    public String geteEamil() {
        return (String)attributes.get("email");
    }

}
