package vn.topica.itlab4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Item;
import vn.topica.itlab4.repository.ItemRepository;
import vn.topica.itlab4.service.ItemService;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> findByCategoryName(String categoryName, int pageIndex, int pageSize) {
        return itemRepository.findByCategoryName(categoryName, PageRequest.of(pageIndex, pageSize)).getContent();
    }
}
