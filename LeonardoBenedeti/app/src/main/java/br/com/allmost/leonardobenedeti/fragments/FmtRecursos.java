package br.com.allmost.leonardobenedeti.fragments;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.allmost.leonardobenedeti.R;

/**
 * Created by leonardobenedeti on 03/02/15.
 */
public class FmtRecursos extends Fragment {

    TextView navigation, refNavigation, fragment, refFragment, popupWindow, refPopupWindow, animation, refAnimation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_recursos, container, false);

        navigation = (TextView) rootView.findViewById(R.id.navigation);
        refNavigation = (TextView) rootView.findViewById(R.id.linkNavigation);

        fragment = (TextView) rootView.findViewById(R.id.fragment);
        refFragment = (TextView) rootView.findViewById(R.id.linkFragment);

        popupWindow = (TextView) rootView.findViewById(R.id.popup);
        refPopupWindow = (TextView) rootView.findViewById(R.id.linkPopup);

        animation = (TextView) rootView.findViewById(R.id.animation);
        refAnimation = (TextView) rootView.findViewById(R.id.linkAnimation);

        navigation.setText("O Navigation Drawer é um painel que faz a transição a partir da borda esquerda da tela e exibe principais opções de navegação do aplicativo.");
        final String linkNavi = "https://developer.android.com/design/patterns/navigation-drawer.html";
        refNavigation.setText("Referência: \n" + linkNavi);
        refNavigation.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        refNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkToReference(linkNavi);
            }
        });


        fragment.setText("Um Fragment é um pedaço de interface de um aplicativo que pode ser colocado em uma atividade.");
        final String linkFrag = "https://developer.android.com/reference/android/app/Fragment.html";
        refFragment.setText("Referência: \n" + linkFrag);
        refFragment.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        refFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkToReference(linkFrag);
            }
        });


        popupWindow.setText("Um PopupWindow é um recipiente flutuante que aparece no topo da atividade atual.");
        final String linkPop = "https://developer.android.com/reference/android/widget/PopupWindow.html";
        refPopupWindow.setText("Referência: \n" + linkPop);
        refPopupWindow.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        refPopupWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkToReference(linkPop);
            }
        });



        animation.setText("O animationStyle é utilizado para animar objetos das atividades. Neste aplicativo ele realizou o fade-in e fade-out dos PopupWindows. ");
        final String linkAnim = "http://developer.android.com/reference/android/widget/PopupWindow.html#setAnimationStyle(int) ";
        refAnimation.setText("Referência: \n" + linkAnim);
        refAnimation.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        refAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkToReference(linkAnim);
            }
        });


        return rootView;
    }

    public void linkToReference(String link){
        Uri uri = Uri.parse(link);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        getActivity().startActivity(intent);
    }
}