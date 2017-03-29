package com.liaxi.dell.dialogfragment;

import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by dell on 2017/3/29.
 */

public class DialogFragment0102 extends android.support.v4.app.DialogFragment{
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //设置不显示标题
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置本体之外不可点击
        getDialog().setCanceledOnTouchOutside(false);
        //设置返回键可点击
        setCancelable(true);
        //设置本体之外透明
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View v = inflater.inflate(R.layout.mbin,null);
        button = (Button) v.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.gert_poop);
        animation.setDuration(5000);
        v.startAnimation(animation);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        //设置匹配父级元素
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
