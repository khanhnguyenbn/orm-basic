package vn.topica.itlab4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.topica.itlab4.entity.Type;

import java.util.List;

public interface TypeRepository extends PagingAndSortingRepository<Type, Integer> {
}
