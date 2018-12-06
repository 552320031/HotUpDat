package demo.example.com.hotupdata;

import android.app.Application;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by hanguorui on 2018/12/5.
 */

public class MyApp extends TinkerApplication {
    public MyApp() {
        super(ShareConstants.TINKER_ENABLE_ALL, "demo.example.com.hotupdata.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}