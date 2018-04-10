package jp.co.example.Entity.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jp.co.example.DbMapper.PurchaseSummary;
import jp.co.example.DbMapper.PurchaseSummaryMapper;
import jp.co.example.Entity.OutputToDB;

@Repository("purchaseSummaryEntity")
@Scope("prototype")
@Configurable
public class PurchaseSummaryEntity extends PurchaseSummary implements OutputToDB {

	@Autowired
	private PurchaseSummaryMapper purchaseSummaryMapper;

	@Override
	public void insertThisRecord() {
		purchaseSummaryMapper.insertSelective(this);

	}

}
