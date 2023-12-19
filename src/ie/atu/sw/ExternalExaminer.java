package ie.atu.sw;

public record ExternalExaminer(
		String name,
        ExaminerType type,
        String department,
        String institution) implements ExaminerType {

}
