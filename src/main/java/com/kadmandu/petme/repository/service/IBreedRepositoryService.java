package com.kadmandu.petme.repository.service;

import java.util.List;

import com.kadmandu.petme.repository.base.IBaseRepositoryService;
import com.kadmandu.petme.repository.entity.AnimalRepository;
import com.kadmandu.petme.repository.entity.BreedRepository;

/**
 * Interface containing the operations to perform against the mongo data source for breeds
 * 
 * @author German Potes
 */
public interface IBreedRepositoryService extends IBaseRepositoryService<BreedRepository> {

    List<BreedRepository> getByAnimal(final AnimalRepository animalRepository);
}