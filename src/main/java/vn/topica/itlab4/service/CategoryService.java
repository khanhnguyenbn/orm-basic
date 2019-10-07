package vn.topica.itlab4.service;

import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Category;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {

    List<Category> findByTypeName(String typeName, int pageIndex, int pageSize);

    Category update(int id, String categoryName);

    Optional<Category> findById(int id);
}
