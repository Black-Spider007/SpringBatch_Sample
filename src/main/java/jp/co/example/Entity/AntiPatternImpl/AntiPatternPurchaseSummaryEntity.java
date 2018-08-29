package jp.co.example.Entity.AntiPatternImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jp.co.example.DbMapper.PurchaseSummary;
import jp.co.example.DbMapper.PurchaseSummaryMapper;

@Repository("AntiPatternPurchaseSummaryEntity")
@Scope("prototype")
@Configurable
public class AntiPatternPurchaseSummaryEntity extends PurchaseSummary {

	@Autowired
	private PurchaseSummaryMapper purchaseSummaryMapper;

	public void insertThisRecord() {
		purchaseSummaryMapper.insertSelective(this);

	}

}
