package zag.sm.report.service;


import zag.sm.report.model.generated.ReportRequestDTO;

public interface ReportService {

    void generateReport(Long postId ,ReportRequestDTO reportDTO);

}
