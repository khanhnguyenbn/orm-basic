package vn.topica.itlab4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.topica.itlab4.entity.Item;

public interface ItemRepository extends PagingAndSortingRepository<Item, Integer> {

    @Query("SELECT i FROM Item i, Category c WHERE i.categoryId = c.id AND c.name=:categoryName")
    Page<Item> findByCategoryName(String categoryName, Pageable pageable);
}
