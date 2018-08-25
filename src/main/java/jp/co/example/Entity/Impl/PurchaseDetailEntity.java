package jp.co.example.Entity.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jp.co.example.DbMapper.PurchaseDetail;
import jp.co.example.Entity.InputFromDB;
import jp.co.example.Entity.OutputToDB;

@Repository("purchaseDetailEntity")
@Scope("prototype")
@Configurable
public class PurchaseDetailEntity extends PurchaseDetail implements InputFromDB {

	@Autowired
	@Qualifier("purchaseSummaryEntity")
	private PurchaseSummaryEntity purchaseSummaryEntity;

	@Override
	public OutputToDB convertToDB() {
		purchaseSummaryEntity.setCustomerId(getCustomerId());
		purchaseSummaryEntity.setPurchaseNumber(getPurchaseNumber());
		purchaseSummaryEntity.setTotalPrice(getItemPrice());
		purchaseSummaryEntity.setPurchaseAt(getPurchaseAt());
		return purchaseSummaryEntity;
	}

}
