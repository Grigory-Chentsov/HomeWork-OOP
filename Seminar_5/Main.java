public class Main {
    public static void main(String[] args) {
        
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        StudyGroupService studyGroupService = new StudyGroupService();

        
        Controller controller = new Controller(studentService, teacherService, studyGroupService);

        
        List<Integer> studentIds = List.of(2, 3, 4);
        StudyGroup studyGroup = controller.createStudyGroup(1, studentIds);

        
        System.out.println("Teacher: " + studyGroup.getTeacher().getId());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getId());
        }
    }
}
