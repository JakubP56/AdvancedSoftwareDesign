package ie.atu.sw;

public record InternalExaminer(
		String name,
        ExaminerType type,
        String department,
        String school,
        String email,
        int crn) implements ExaminerType {

}
