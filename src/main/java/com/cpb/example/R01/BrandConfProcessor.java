package com.cpb.example.R01;

import com.cpb.example.R01.BrandConf;
import org.springframework.batch.item.ItemProcessor;

public class BrandConfProcessor implements ItemProcessor<BrandConf,BrandConf>{

    @Override
    public BrandConf process(BrandConf brandConf) throws Exception {
        System.out.println(brandConf.toString());
        return brandConf;
    }
}
