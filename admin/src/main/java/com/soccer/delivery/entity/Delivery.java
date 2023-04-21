package com.soccer.delivery.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.soccer.address.entity.Address;
import com.soccer.common.entity.BaseEntity;
import com.soccer.order.entity.Order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "tb_order")
public class Delivery extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "delivery_id")
	private Long id;
	
	@OneToOne(mappedBy = "delivery")
	private Order order;
	
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;
	
	@Embedded
	private Address address;
	
	private LocalDateTime regDate;
	
	private LocalDateTime updDate;
	
}
