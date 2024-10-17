package com.example.btth3;

import android.os.Bundle;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements StudentAdapter.OnStudentClickListener {
    private RecyclerView recyclerView;
    private StudentAdapter adapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentList = loadStudentsFromJson();
        adapter = new StudentAdapter(studentList, this);
        recyclerView.setAdapter(adapter);
    }

    private List<Student> loadStudentsFromJson() {
        List<Student> students = new ArrayList<>();
        try {
            InputStream is = getAssets().open("students.json");
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            String json = new String(buffer);
            Type listType = new TypeToken<List<Student>>() {}.getType();
            students = new Gson().fromJson(json, listType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void onStudentClick(Student student) {
        Intent intent = new Intent(this, StudentDetailActivity.class);
        intent.putExtra("student_id", student.getId());
        startActivity(intent);
    }
}