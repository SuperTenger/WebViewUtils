package com.guoguang.webviewtest;

import android.webkit.WebView;

/**
 * Created by Mike on 2018-08-27.
 */

public class WebViewUtils {

    public static void showStr(WebView webView,String str){
        String assetsFontCSS = "<link href=\"file:///android_asset/myfont.css\" rel=\"stylesheet\" type=\"text/css\"/>";
        String assetsbodyCSS = "<link href=\"file:///android_asset/body.css\" rel=\"stylesheet\" type=\"text/css\"/>";
        String content = assetsFontCSS + assetsbodyCSS + str;
        webView.loadDataWithBaseURL(null, content, "text/html", "utf-8", null);
    }

}
