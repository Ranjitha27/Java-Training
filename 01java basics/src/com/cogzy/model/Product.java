package com.cogzy.model;

import lombok.Data;

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
public class Product {

	private Integer productId;
	private String productName;
	private Integer categoryId;
	private Integer supplierId;
	private String quantityPerUnit;
	private Double unitPrice;
	private Integer unitsInStock;
	private Integer unitsOnOrder;
	private Integer reOrderLevel;
	private Double discount;
	private Integer discontinued;

}
