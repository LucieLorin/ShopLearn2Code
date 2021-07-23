package com.learn2code.Shop.db.servis.api;
import com.learn2code.Shop.domain.Merchant;
import org.springframework.lang.Nullable;
import java.util.List;

public interface MerchantService {

    List<Merchant> getMerchants();

    @Nullable
    Merchant get(int id);

    @Nullable
    Merchant delete(int id);

    @Nullable
    Integer add(Merchant merchant);
}
