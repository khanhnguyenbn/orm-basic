package vn.topica.itlab4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Category;
import vn.topica.itlab4.repository.CategoryRepository;
import vn.topica.itlab4.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findByTypeName(String typeName, int pageIndex, int pageSize){
        return categoryRepository.findByTypeName(typeName, PageRequest.of(pageIndex, pageSize)).getContent();
    }

    public Category update(int id, String categoryName){
        Optional<Category> category = findById(id);
        if(category.isPresent()){
            category.get().setName(categoryName);
            return categoryRepository.save(category.get());
        } else {
            return null;
        }
    }

    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }
}
