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
public class FmtPerfil extends Fragment {

    TextView nome, idade, hobbies, esportes, txtPerfil;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);

        nome = (TextView) rootView.findViewById(R.id.nome);
        idade = (TextView) rootView.findViewById(R.id.idade);
        hobbies = (TextView) rootView.findViewById(R.id.hobbies);
        esportes = (TextView) rootView.findViewById(R.id.esportes);
        txtPerfil = (TextView) rootView.findViewById(R.id.txtPerfil);

        nome.setText("Leonardo Benedeti Silva Macedo");

        idade.setText("24 anos");

        hobbies.setText("Gosto muito de carros antigos. Por conta disso, tenho um VW Passat, " +
                "ano 84. Inclusive, possuo um planejamento de reforma do mesmo para o " +
                "mais breve possível.");

        esportes.setText("• Jiu Jitsu - Pratico há aproximadamente 2 anos (Ótimo esporte para " +
                         "eliminar o estresse)\n" +
                         "• Basquete - Ultimamente não tenho praticado tanto por falta de tempo, " +
                         "mas sempre que possível estou em quadra jogando com amigos.");

        txtPerfil.setText("      Passei a gostar de Tecnologia no momento em que tive contato com " +
                "meu primeiro computador. Após esse contato comecei a me interessar pelo assunto, " +
                "porem apenas com manutenção de computadores, o que imaginava ser o futuro. " +
                "\n       Mais pra frente me matriculei no Curso Técnico em Informática da Faetec, " +
                "ai descobri meu melhor passa tempo, a programação. Passei a estudar cada vez mais " +
                "assuntos sobre lógica de programação e afins." +
                "\n       Com a graduação em sistemas de informação, meu mundo que se limitava a " +
                "Java, MySQL, Html e PHP, se expandiu de uma maneira imensurável. Aprendi como analisar " +
                "muito bem uma ideia e transforma-la em algo realmente utilizável, aprendi a lapidar " +
                "todo meu conhecimento técnico e torna-lo mais organizado e bem feito."+
                "E hoje fui atraído para o mundo mobile no qual venho me especializando e aprendendo " +
                "cada dia mais." );


        return rootView;
    }


}