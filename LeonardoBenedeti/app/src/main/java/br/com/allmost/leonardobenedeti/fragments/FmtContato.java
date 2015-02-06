package br.com.allmost.leonardobenedeti.fragments;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.allmost.leonardobenedeti.R;

/**
 * Created by leonardobenedeti on 03/02/15.
 */
public class FmtContato extends Fragment {

    EditText formNome, formEmail, formTel, formAssunto, formMensagem;
    TextView txtFace, txtIn, txtTwtr, txtInsta;
    ImageView imgFace, imgIn, imgTwtr, imgInsta, enviar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_contato, container, false);

        txtFace = (TextView) rootView.findViewById(R.id.txtFace);
        imgFace = (ImageView) rootView.findViewById(R.id.imgFace);
        txtIn = (TextView) rootView.findViewById(R.id.txtIn);
        imgIn = (ImageView) rootView.findViewById(R.id.imgIn);
        txtTwtr = (TextView) rootView.findViewById(R.id.txtTwtr);
        imgTwtr = (ImageView) rootView.findViewById(R.id.imgTwtr);
        txtInsta = (TextView) rootView.findViewById(R.id.txtInsta);
        imgInsta = (ImageView) rootView.findViewById(R.id.imgInsta);

        formNome = (EditText) rootView.findViewById(R.id.formNome);
        formEmail = (EditText) rootView.findViewById(R.id.formEmail);
        formTel = (EditText) rootView.findViewById(R.id.formPhone);
        formAssunto = (EditText) rootView.findViewById(R.id.formAssunto);
        formMensagem = (EditText) rootView.findViewById(R.id.formMsg);


        txtFace.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        txtFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkFace();
            }
        });
        imgFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkFace();
            }
        });

        txtIn.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        txtIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkIn();
            }
        });
        imgIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkIn();
            }
        });


        txtTwtr.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        txtTwtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkTwtr();
            }
        });
        imgTwtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkTwtr();
            }
        });

        txtInsta.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        txtInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkInsta();
            }
        });
        imgInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkInsta();
            }
        });


        enviar = (ImageView) rootView.findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // envio de email

                if (formNome.getText().toString().equals("")){
                    formNome.setError("Digite seu nome");
                }
                else if (formEmail.getText().toString().equals("")){
                    formEmail.setError("Digite seu Email");
                }
                else if (formTel.getText().toString().equals("")){
                    formTel.setError("Digite seu telefone");
                }
                else if (formAssunto.getText().toString().equals("")){
                    formAssunto.setError("Digite um assunto");
                }
                else if (formMensagem.getText().toString().equals("")){
                    formMensagem.setError("Digite uma mensagem");
                }

                else{

                    String to = "leonardobenedeti@gmail.com";

                    //Está sem verificação se vazio pois é gerado um erro caso o campo esteja vazio na acao do envio.
                    String subject = "Contato via app: "+ formAssunto.getText().toString();
                    String message =
                            "\nNome: "+formNome.getText().toString()+
                            "\nTelefone: "+formTel.getText().toString()+
                            "\nEmail: "+formEmail.getText().toString()+
                            "\n======================="+
                            "\nAssunto: "+formAssunto.getText().toString()+
                            "\nMensagem: "+formMensagem.getText().toString();

                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                    email.putExtra(Intent.EXTRA_SUBJECT, subject);
                    email.putExtra(Intent.EXTRA_TEXT, message);
                    email.setType("message/rfc822");

                    startActivity(Intent.createChooser(email, "E-mail"));
                }

            }
        });

        return rootView;
    }

    private void linkIn() {
        Intent it;
        try{
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://profile/148759799"));
            getActivity().startActivity(it);
        }
        catch(Exception e){
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/in/leonardobenedeti/"));
            getActivity().startActivity(it);
        }

    }

    private void linkFace() {
        Intent it;
        try{
            getActivity().getPackageManager().getPackageInfo("com.facebook.katana", 0);
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001223036519"));
            getActivity().startActivity(it);
        }
        catch(Exception e){
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/leobenedeti"));
            getActivity().startActivity(it);
        }
    }

    private void linkTwtr() {
        Intent it;
        try{
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=1702676479"));
            getActivity().startActivity(it);
        }
        catch(Exception e){
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/LeonardoBSM"));
            getActivity().startActivity(it);
        }

    }

    private void linkInsta(){
        Intent it;
        try{

            it = getActivity().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
            it.setComponent(new ComponentName( "com.instagram.android", "com.instagram.android.activity.UrlHandlerActivity"));
            it.setData( Uri.parse( "http://instagram.com/_u/leonardobenedeti/") );

            getActivity().startActivity(it);
        }
        catch(Exception e){
            it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/leonardobenedeti/"));
            getActivity().startActivity(it);
        }
    }

}