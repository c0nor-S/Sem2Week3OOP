package ie.atu.sem2.week3.sem2week3.service;
import org.springframework.stereotype.Service;

@Service
public class DegreeConversionService {
    public float convert(int a) {
        float pi = 3.141592654F;
        return a * pi / 180;
    }
}
