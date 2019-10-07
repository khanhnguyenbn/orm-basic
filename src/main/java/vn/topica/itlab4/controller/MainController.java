package vn.topica.itlab4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.topica.itlab4.entity.Category;
import vn.topica.itlab4.entity.Item;
import vn.topica.itlab4.service.CategoryService;
import vn.topica.itlab4.service.ItemService;

import java.util.List;

/*
     Test Result
*/

@RestController
public class MainController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ItemService itemService;


    @RequestMapping(value = "/categories/search", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Category> searchCategoryByTypeName(@RequestParam("typeName") String typeName,
                                                   @RequestParam(value = "pageIndex") Integer pageIndex,
                                                   @RequestParam("pageSize") Integer pageSize) {
        return categoryService.findByTypeName(typeName, pageIndex, pageSize);
    }


    @RequestMapping(value = "/items/search", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Item> searchItemByCategoryName(@RequestParam("categoryName") String categoryName,
                                               @RequestParam(value = "pageIndex") Integer pageIndex,
                                               @RequestParam("pageSize") Integer pageSize) {
        return itemService.findByCategoryName(categoryName, pageIndex, pageSize);
    }


    //truyen param qua url nen de phuong thuc GET de test (do test tren chrome)
    @RequestMapping(value = "/category/update", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Category updateCategory(@RequestParam("id") Integer id,
                                   @RequestParam("categoryName") String categoryName) {
        return categoryService.update(id, categoryName);
    }


}
