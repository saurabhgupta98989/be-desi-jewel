package com.ecom.djwl.category;

import com.ecom.djwl.subcategory.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private  CategoryRepository categoryRepository;

    @Autowired
    private SubcategoryRepository subcategoryRepository;
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
