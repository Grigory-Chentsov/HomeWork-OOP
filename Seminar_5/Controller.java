class Controller {
    private StudentService studentService;
    private TeacherService teacherService;
    private StudyGroupService studyGroupService;

    public Controller(StudentService studentService, TeacherService teacherService, StudyGroupService studyGroupService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        List<Student> students = studentService.getStudentsByIds(studentIds);
        return studyGroupService.formStudyGroup(teacher, students);
    }
}
