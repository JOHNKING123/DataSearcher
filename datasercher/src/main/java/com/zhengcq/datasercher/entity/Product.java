package com.zhengcq.datasercher.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName="test",type="prodct",indexStoreType="fs",shards=5,replicas=1,refreshInterval="-1")
public class Product {

    @Id
    private String title;

    private String description;

    private Double price;

    private boolean onSale;

    private Integer type;

    private String createDate;
}
