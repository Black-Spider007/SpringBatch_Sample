package jp.co.example.Entity.AntiPatternImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jp.co.example.DbMapper.PurchaseDetail;

@Repository("purchaseDetailEntity")
@Scope("prototype")
@Configurable
public class AntiPatternPurchaseDetailEntity extends PurchaseDetail {

	@Autowired
	@Qualifier("purchaseSummaryEntity")
	private AntiPatternPurchaseSummaryEntity purchaseSummaryEntity;

	public AntiPatternPurchaseSummaryEntity convertToDB() {
		purchaseSummaryEntity.setCustomerId(getCustomerId());
		purchaseSummaryEntity.setPurchaseNumber(getPurchaseNumber());
		purchaseSummaryEntity.setTotalPrice(getItemPrice());
		purchaseSummaryEntity.setPurchaseAt(getPurchaseAt());
		return purchaseSummaryEntity;
	}

}
