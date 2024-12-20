package com.test.testplugin;

import com.alibaba.fastjson.JSONObject;
import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;

public class TestModule extends UniModule {
    @UniJSMethod(uiThread = false)
    public void open(UniJSCallback callback) {
        JSONObject data = new JSONObject();
        data.put("code","插件调用成功");
        callback.invoke(data);
    }
}