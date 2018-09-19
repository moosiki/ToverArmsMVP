package com.tover.manage.commonres.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

import com.tover.manage.commonres.R;


/**
 * ================================================
 * Created by JessYan on 16/04/2018 17:01
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class ProgressDialog extends Dialog {
    public ProgressDialog(@NonNull Context context) {
        super(context, R.style.public_dialog_progress);
        setContentView(R.layout.public_dialog_progress);
        setCanceledOnTouchOutside(false);
    }
}
