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
public class FmtFormacao extends Fragment {

    TextView graduacao, tecnico, cursos;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_formacao, container, false);

        graduacao = (TextView) rootView.findViewById(R.id.graduacao);
        tecnico = (TextView) rootView.findViewById(R.id.tecnico);
        cursos = (TextView) rootView.findViewById(R.id.cursos);

        graduacao.setText("Sistemas de Informação \n 2009 - 2013");
        tecnico.setText("Técnico em Informática \n 2008 - 2009");
        cursos.setText("Trilha Android - 48H \n iOS (Swift) - 24H \n Trilha Infraestrutura - 60H");

        return rootView;
    }
}