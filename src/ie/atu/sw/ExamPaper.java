package ie.atu.sw;

import java.util.List;

public record ExamPaper(
		List<String> allowedItems,
        int totalQuestions,
        int requiredAnswers,
        List<Question> questions) {

}
