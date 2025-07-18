package zag.sm.report.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RestController;
import zag.sm.report.model.generated.ReportRequestDTO;
import zag.sm.report.controller.generated.UserReportController;
import zag.sm.report.service.ReportService;

import static org.springframework.http.HttpStatus.CREATED;
import static zag.sm.user.model.enums.UserRoles.ADMIN_ROLE;
import static zag.sm.user.model.enums.UserRoles.MEMBER_ROLE;


@RestController
@AllArgsConstructor
public class UserReportControllerImpl implements UserReportController {

    private final ReportService reportService;


    @Override
    @Secured({ADMIN_ROLE,MEMBER_ROLE})
    public ResponseEntity<Void> _createReport(Long postId, ReportRequestDTO reportRequestDTO) {
        reportService.generateReport(postId, reportRequestDTO);
        return ResponseEntity.status(CREATED).build();
    }
}
