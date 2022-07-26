package com.codegym.repository;

import com.codegym.model.Brand;
import com.codegym.model.Product;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
    //tìm kiếm theo tên
    Iterable<Product> findAllByNameContaining(String name);

    //sắp xếp theo giá
    Iterable<Product> findAllByOrderByPrice();

    Iterable<Product> findAllByOrderByPriceDesc();

    //tìm kiếm theo hãng sản xuất
    Iterable<Product> findAllByBrand(Brand brand);

}
