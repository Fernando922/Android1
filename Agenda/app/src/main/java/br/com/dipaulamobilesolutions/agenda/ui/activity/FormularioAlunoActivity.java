package br.com.dipaulamobilesolutions.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.com.dipaulamobilesolutions.agenda.Aluno;
import br.com.dipaulamobilesolutions.agenda.R;
import br.com.dipaulamobilesolutions.agenda.dao.AlunoDAO;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDAO dao = new AlunoDAO();


        Button botaoSalvar = findViewById(R.id.btnSalvar);
        EditText etNome = findViewById(R.id.etnome);
        EditText etTelefone = findViewById(R.id.etTelefone);
        EditText etEmail = findViewById(R.id.etEmail);


        botaoSalvar.setOnClickListener(v -> {
                String nome = etNome.getText().toString();
                String telefone = etTelefone.getText().toString();
                String email = etEmail.getText().toString();


                Aluno alunoCriado = new Aluno(nome, telefone, email);

                dao.salva(alunoCriado);

                Intent intent = new Intent(FormularioAlunoActivity.this, ListaAlunosActivity.class);

                startActivity(intent);


        });
    }
}