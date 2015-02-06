package br.com.allmost.leonardobenedeti.fragments;

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
public class FmtHome extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        TextView perfil = (TextView) rootView.findViewById(R.id.perfil);

        perfil.setText("Olá, bem vindo ao meu currículo em formato de aplicativo. " +
                "Ao lado você pode navegar pelas minhas competências clicando na opção desejada. " +
                "Para abrir o menu lateral, basta deslizar o dedo do canto esquedo da tela para o lado direito" +
                " ou clicar no icone ao lado do titulo do aplicativo. ");



        return rootView;
    }
}