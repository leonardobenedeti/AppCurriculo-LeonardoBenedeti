package br.com.allmost.leonardobenedeti.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import br.com.allmost.leonardobenedeti.R;

/**
 * Created by leonardobenedeti on 04/02/15.
 */
public class Popup {

    public static void showPopUpWindow(final View view, String title, String info, final String link, String btLabel){
        final PopupWindow popupWindow = new PopupWindow(view.getContext());

        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.popup_window, null);

        TextView tv = (TextView) linearLayout.findViewById(R.id.tvTitle);
        tv.setText(title);

        tv = (TextView) linearLayout.findViewById(R.id.tvInfo);
        tv.setText(info);

        TextView tvLink = (TextView) linearLayout.findViewById(R.id.tvLink);
        if (link != null){
            tvLink.setText("Link para o projeto");
            tvLink.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse(link);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    view.getContext().startActivity(intent);
                }
            });
        }
        else{
            tvLink.setVisibility(View.GONE);
        }

        Button bt = (Button) linearLayout.findViewById(R.id.btOk);
        bt.setText(btLabel);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });

        popupWindow.setContentView(linearLayout);
        popupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.PopupWindow);
        popupWindow.setBackgroundDrawable(view.getContext().getResources().getDrawable(R.drawable.background_popup));
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }
}
