package ndk.banee.spring_jstore.service;

import ndk.banee.spring_jstore.domain.wishlist;
import ndk.banee.spring_jstore.domain.wishlistExample;
import ndk.banee.spring_jstore.mapper.wishlistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private wishlistMapper WishlistMapper;



    public List<wishlist> findAllProducts() {

            return WishlistMapper.selectByExample(new wishlistExample());
    }

    public void addToWishList(wishlist WishList){

        WishlistMapper.insert(WishList);
    }
}
