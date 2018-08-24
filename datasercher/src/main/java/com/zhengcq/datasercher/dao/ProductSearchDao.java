package com.zhengcq.datasercher.dao;

import com.zhengcq.datasercher.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductSearchDao extends ElasticsearchRepository<Product,Long> {
}
