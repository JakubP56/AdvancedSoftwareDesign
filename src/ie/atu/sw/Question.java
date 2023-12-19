package ie.atu.sw;

import java.util.List;

public record Question(
		String text,
        List<QuestionDetails> details) {

}
