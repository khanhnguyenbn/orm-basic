package vn.topica.itlab4.service;

import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Item;

import java.util.List;

@Service
public interface ItemService {

    List<Item> findByCategoryName(String categoryName, int pageIndex, int pageSize);
}
