package com.example.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityAddStudentBinding

class AddStudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val id = binding.etId.text.toString()
            val name = binding.etName.text.toString()
            val phone = binding.etPhone.text.toString()
            val address = binding.etAddress.text.toString()

            if (id.isNotEmpty() && name.isNotEmpty()) {
                StudentData.addStudent(Student(id, name, phone, address))
                Toast.makeText(this, "Siswa berhasil ditambahkan", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "ID dan Nama wajib diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
