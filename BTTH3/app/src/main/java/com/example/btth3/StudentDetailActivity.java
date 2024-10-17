package com.example.btth3;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class StudentDetailActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        textView = findViewById(R.id.textView);

        int studentId = getIntent().getIntExtra("student_id", -1);
        // Tìm sinh viên theo ID và hiển thị thông tin
        // (Có thể cần thêm logic để lấy dữ liệu từ JSON hoặc danh sách đã có)
    }
}
