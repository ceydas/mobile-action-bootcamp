package com.bahadirmemis.mobileactionbootcamp.acc.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.acc.dao.AccMoneyTransferDao;
import com.bahadirmemis.mobileactionbootcamp.acc.entity.AccMoneyTransfer;
import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class AccMoneyTransferEntityService extends BaseEntityService<AccMoneyTransfer, AccMoneyTransferDao> {

    public AccMoneyTransferEntityService(AccMoneyTransferDao dao) {
        super(dao);
    }
}
