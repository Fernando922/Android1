package br.com.dipaulamobilesolutions.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.dipaulamobilesolutions.agenda.R;
import br.com.dipaulamobilesolutions.agenda.dao.AlunoDAO;

public class ListaAlunosActivity extends AppCompatActivity {

    FloatingActionButton fabAdicionaAluno;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);


        AlunoDAO dao = new AlunoDAO();





        ListView lvAlunos = findViewById(R.id.lvAlunos);
        fabAdicionaAluno = findViewById(R.id.fabAdicionaAluno);


        lvAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));

    }
}

