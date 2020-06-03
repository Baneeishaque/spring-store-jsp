package ndk.banee.spring_jstore.service;

import ndk.banee.spring_jstore.domain.product;
import ndk.banee.spring_jstore.domain.productExample;
import ndk.banee.spring_jstore.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private productMapper productmapper;

    public List<product> findAllProducts() {
        return productmapper.selectByExample(new productExample());
    }

    public product getById(Integer id) {
        return productmapper.selectByPrimaryKey(id);
    }

    public byte[] getImage(Integer id) {
        product prd = this.getById(id);
        if (prd != null) {
            return prd.getImage();
        }
        return new byte[]{};
    }

    public void deleteProduct(Integer id) {
        productmapper.deleteByPrimaryKey(id);
    }

    public void saveOrUpdate(product prod) {
        if (prod.getProductid() != null) {
            productmapper.updateByPrimaryKey(prod);
            productmapper.updateByPrimaryKeyWithBLOBs(prod);
        } else {
            productmapper.insert(prod);
        }
    }
}
