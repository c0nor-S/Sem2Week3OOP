package ie.atu.sem2.week3.sem2week3.controller;

import ie.atu.sem2.week3.sem2week3.service.DegreeConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/conversion")
public class DegreeConversionController {
    private final DegreeConversionService degreeConversionService;

    public DegreeConversionController(DegreeConversionService degreeConversionService) {
        this.degreeConversionService = degreeConversionService;
    }

    @GetMapping("/convert")
    public ResponseEntity<?> convert(@RequestParam int a) {
        if(a % 1 != 0) {
            return ResponseEntity.badRequest().body("Non Integer Value Error");
        }
            float sum = degreeConversionService.convert(a);
            return ResponseEntity.ok(sum);
    }
}
