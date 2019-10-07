package vn.topica.itlab4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.topica.itlab4.entity.Category;

import java.util.Optional;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {

    @Query("SELECT c FROM Category c, Type t WHERE c.typeId = t.id AND t.name=:typeName")
    Page<Category> findByTypeName(String typeName, Pageable pageable);



}
