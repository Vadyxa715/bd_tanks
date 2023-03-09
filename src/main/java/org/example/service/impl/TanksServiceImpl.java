package org.example.service.impl;


import lombok.RequiredArgsConstructor;
import org.example.domain.Tank;
import org.example.repository.TanksRepository;
import org.example.service.TankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TanksServiceImpl implements TankService {

   // @Autowired
    private final TanksRepository tanksRepository;

    public void save(Tank tank){
        tanksRepository.save(tank);
    }
    public List<Tank> listAll() {
        return (List<Tank>) tanksRepository.findAll();
    }

    public Tank get(Long id) {
        return tanksRepository.findById(id).get();
    }

    public void delete(Long id) {
        tanksRepository.deleteById(id);
    }

    public boolean update(Tank tank, Long id) {
        if (tanksRepository.existsById(id)) {
            tank.setId(id);
            tanksRepository.save(tank);
            return true;
        }

        return false;
    }
}
