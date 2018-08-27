package com.guoguang.webviewtest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String htmlSource =
                "<html><body><h1> 扩展A15字【㑀㑁㑂㑃㑄㑅㑆㑈㑉㑊㑋㑌㑍㑎㑏】扩展B15字【\uD840\uDC30\uD840\uDC31\uD840\uDC32\uD840\uDC33\uD840\uDC34\uD840\uDC35\uD840\uDC36\uD840\uDC37\uD840\uDC38\uD840\uDC39\uD840\uDC3A\uD840\uDC3B\uD840\uDC3C\uD840\uDC3D\uD840\uDC3E】new [\uE900\n" +
                "\uEA00\n" +
                "\uEFC5\n" +
                "\uF559\n" +
                "﨩}</h1></body></html>\n";
        wv = (WebView) findViewById(R.id.wv);
        WebViewUtils.showStr(wv, htmlSource);
    }
}
