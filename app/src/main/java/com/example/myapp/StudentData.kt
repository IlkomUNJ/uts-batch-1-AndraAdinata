package com.example.myapp

object StudentData {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun getStudentListNames(): List<String> {
        return students.map { "${it.id} - ${it.name}" }
    }
}
