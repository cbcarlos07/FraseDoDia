package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Estes são os provérbios de Salomão, \n filho de Davi, rei de Israel. Pv 1:1",
            "Eles ajudarão a experimentar a sabedoria e a disciplina; a compreender as palavras que dão entendimento; Pv 1:2",
            "a viver com disciplina e sensatez, fazendo o que é justo, direito e correto; Pv 1:3",
            "ajudarão a dar prudência aos inexperientes e conhecimento e bom senso aos jovens. Pv 1:4",
            "Se o sábio lhes der ouvidos, aumentará seu conhecimento, e quem tem discernimento obterá orientação Pv 1:5",
            "para compreender provérbios e parábolas, ditados e enigmas dos sábios. Pv 1:6",
            "O temor do Senhor é o princípio do conhecimento, mas os insensatos desprezam a sabedoria e a disciplina. Pv 1:7",
            "Ouça, meu filho, a instrução de seu pai e não despreze o ensino de sua mãe. Pv 1:8",
            "Eles serão um enfeite para a sua cabeça, um adorno para o seu pescoço. Pv 1 :9",
            "Meu filho, se os maus tentarem seduzi-lo, não ceda! Pv 1 :10"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button)   findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
