class StudentService {
    public List<Student> getStudentsByIds(List<Integer> studentIds) {
        // Fetch students from database or any other data source using the provided ids
        List<Student> students = new ArrayList<>();
        for (int id : studentIds) {
            students.add(new Student(id));
        }
        return students;
    }
}
