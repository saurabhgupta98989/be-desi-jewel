package com.ecom.djwl.subcategory;

import com.ecom.djwl.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryService {

    @Autowired
    private SubcategoryRepository subcategoryRepository;
    public List<Subcategory> findAll() {
        return subcategoryRepository.findAll();
    }
}
