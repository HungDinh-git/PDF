package com.example.pdf;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo PDFView
        PDFView pdfView = findViewById(R.id.pdfView);

        // Tải file PDF từ thư mục assets
        pdfView.fromAsset("sample.pdf")
                .enableSwipe(true) // Cho phép vuốt để chuyển trang
                .enableDoubletap(true) // Cho phép phóng to/thu nhỏ bằng double-tap
                .load();
    }
}