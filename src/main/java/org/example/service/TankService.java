package org.example.service;

import org.example.domain.Tank;

import java.util.List;

public interface TankService {
    public void save(Tank tank);

    public List<Tank> listAll();

    public Tank get(Long id);

    public void delete(Long id);
}