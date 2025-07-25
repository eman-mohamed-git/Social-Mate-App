/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package zag.sm.report.controller.generated;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import zag.sm.report.model.generated.ErrorVTO;
import zag.sm.report.model.generated.LookupResultSet;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
@Validated
@Controller
@Tag(name = "Lookup", description = "the Lookup API")
public interface LookupController {

    /**
     * GET /lookups/categories/report/post : Retrieve All Report Categories
     *
     * @return OK (status code 200) or Bad Request (status code 400) or Internal Server Error (status code 500)
     */
    @Operation(operationId = "getAllCategories", summary = "Retrieve All Report Categories", tags = {
            "Lookup" }, responses = { @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = LookupResultSet.class)) }),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorVTO.class)) }),
                    @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorVTO.class)) }) })
    @RequestMapping(method = RequestMethod.GET, value = "/lookups/categories/report/post", produces = {
            "application/json" })

    ResponseEntity<LookupResultSet> _getAllCategories(

    );

    /**
     * GET /lookups/statuses/report/post : Retrieve All Statuses Report
     *
     * @return OK (status code 200) or Bad Request (status code 400) or Internal Server Error (status code 500)
     */
    @Operation(operationId = "getAllStatus", summary = "Retrieve All Statuses Report", tags = {
            "Lookup" }, responses = { @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = LookupResultSet.class)) }),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorVTO.class)) }),
                    @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorVTO.class)) }) })
    @RequestMapping(method = RequestMethod.GET, value = "/lookups/statuses/report/post", produces = {
            "application/json" })

    ResponseEntity<LookupResultSet> _getAllStatus(

    );

}
