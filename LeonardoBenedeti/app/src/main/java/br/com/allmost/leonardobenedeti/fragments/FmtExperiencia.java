package br.com.allmost.leonardobenedeti.fragments;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.allmost.leonardobenedeti.R;
import br.com.allmost.leonardobenedeti.util.Popup;

/**
 * Created by leonardobenedeti on 03/02/15.
 */
public class FmtExperiencia extends Fragment {
    TextView descAllmost, descCoca, descCsn, projetosAllmost, projetosCoca, projetosCsn, periodoAllmost, periodoCoca, periodoCsn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_experiencia, container, false);

        descAllmost = (TextView) rootView.findViewById(R.id.descAllMost);
        descCoca = (TextView) rootView.findViewById(R.id.descCoca);
        descCsn = (TextView) rootView.findViewById(R.id.descCsn);

        periodoAllmost = (TextView) rootView.findViewById(R.id.periodoAllmost);
        periodoCoca = (TextView) rootView.findViewById(R.id.periodoCoca);
        periodoCsn = (TextView) rootView.findViewById(R.id.periodoCsn);

        projetosAllmost = (TextView) rootView.findViewById(R.id.projetosAllMost);
        projetosCoca = (TextView) rootView.findViewById(R.id.projetosCoca);
        projetosCsn = (TextView) rootView.findViewById(R.id.projetosCsn);

        periodoAllmost.setText("Desde: 07/2014 \nAté: Atualmente");
        periodoCoca.setText("Desde: 02/2013\nAté: 07/2014");
        periodoCsn.setText("Desde: 03/2012\nAté: 01/2013");

        descAllmost.setText("Desenvolver painéis WEB e aplicativos nas plataformas Android e iOS, gerenciamento de projetos e prazos.");
        projetosAllmost.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        projetosAllmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Popup.showPopUpWindow(v, "All Most - Principal Projeto",
                        "CataloCar - Este projeto consiste em um sistema de inventário veicular. " +
                        "Cada carro cadastrado recebe um QR Code, contendo as informações do " +
                        "próprio cadastro. O aplicativo CataloCar lê o QR Code e o decodifica mostrando " +
                        "as informações do carro na tela do smartphone. O projeto conta apenas com o " +
                        "aplicativo para Android por enquanto. Para a plataforma iOS ainda está em desenvolvimento." +
                        "\n \n" +
                        "Recursos do app: Leitor de Codigos, totalmente integrado(não é necessário ter instalado para funcionar)" +
                        "e Decodificação JSON.",
                        "https://play.google.com/store/apps/details?id=br.com.allmost.catalocar",
                        "Fechar");
            }
        });


        descCoca.setText("Desenvolver de Sistemas e EDI’s. Linguagens utilizadas: Java, ABAP e C#.");
        // projetos coca Principal projeto: NotaBoleto, consiste em buscar de uma base AS400, informações de NF-e e Boletos referentes a pedidos. Ambos são gerados em ambientes diferentes. Este projeto criou uma ligação entre os ambientes e unia os documentos em um arquivo assim sendo enviado para impressora. Sendo um único arquivo(nota + boleto) a impressora após a impressão grampeava, assim facilitando o processo.");
        projetosCoca.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        projetosCoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Popup.showPopUpWindow(v, "Coca Cola - Principal projeto",
                        "NotaBoleto - Este projeto consiste em buscar de uma base AS400, informações de NF-e e " +
                        "Boletos referentes a pedidos. Ambos são gerados em ambientes diferentes, o boleto é gerado " +
                        "em um 'server' por uma interface que gera os boletos usando Crystal Reports, e a NF-e é gerada " +
                        "pelo sistema de notas fiscais utilizado pela CiaFlu. " +
                        "Este projeto criou uma ligação entre os ambientes e em cada um buscava o documento referente e os unia em um único documento assim sendo enviado para impressora. Sendo um único arquivo(nota + boleto) a " +
                        "impressora após a impressão grampeava, assim facilitando o processo.\n\n" +
                        "Recursos do projeto: ABAP e MergePDF(executado externamente pelo ABAP)",
                        null,
                        "Fechar");
            }
        });



        descCsn.setText("Desenvolver relatórios e sistemas na linguagem ABAP, cuja é responsável por customizar a alguns processos do ERP SAP.");
        // projeto Criar uma ferramenta em abap para ler informações geradas pelo MES
        projetosCsn.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        projetosCsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Popup.showPopUpWindow(v, "CSN - Principal projeto",
                        "A CSN não dispõe informações sobre os projetos. Logo não posso divulgar. =/",
                        null,
                        "Fechar");
            }
        });

        return rootView;
    }


}
