package kz.hunt.character.repository;

import kz.hunt.character.data.entity.BaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends CrudRepository<T, Long> {
}
