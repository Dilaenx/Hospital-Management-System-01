package icet.edu.controller;

import icet.edu.dto.Appoinment;
import icet.edu.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Appoinment")
@RequiredArgsConstructor
public class AppoinmentController {

    final AppoinmentService appoinmentService;

    @PostMapping("/add-appoinment")
    public void addAppoinment(@RequestBody Appoinment appoinment){
        appoinmentService.addAppoinment(appoinment);
    }
}
