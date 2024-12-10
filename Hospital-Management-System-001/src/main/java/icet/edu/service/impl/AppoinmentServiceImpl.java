package icet.edu.service.impl;

import icet.edu.dto.Appoinment;
import icet.edu.entity.AppoinmentEntity;
import icet.edu.repository.AppoimentRepository;
import icet.edu.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppoinmentServiceImpl implements AppoinmentService {

    final AppoimentRepository repository;
    final ModelMapper mapper;
    @Override
    public void addAppoinment(Appoinment appoinment) {
        repository.save(mapper.map(appoinment, AppoinmentEntity.class));
    }
}
