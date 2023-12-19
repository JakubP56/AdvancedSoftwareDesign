package ie.atu.sw;

import java.util.List;

public record ModuleInfo(
		String programCode,
        String title,
        int year,
        String school,
        String department,
        String moduleCode,
        String moduleTitle,
        int registrations,
        List<InternalExaminer> internalExaminers,
        List<ExternalExaminer> externalExaminers) {
	
}
