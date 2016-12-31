CREATE TABLE if not exists `csadatabase`.`queueInfo` 
(
	  `queueName` VARCHAR(45) NOT NULL,
	  `creator` VARCHAR(45) NULL,
      	  `date_created` TIMESTAMP NOT NULL,
          `created_by` VARCHAR(45) NULL,
	  PRIMARY KEY (`queueName`));
  
CREATE TABLE if not exists `csadatabase`.`agents` 
(
		`id` VARCHAR(45) NOT NULL,
		`queueName` VARCHAR(45) NULL,
		`agentId` VARCHAR(45) NULL,
		`agentName` VARCHAR(45)NULL,
                `createddate` VARCHAR(45)NULL,
		  
--		  
		PRIMARY KEY (`id`)
--		CONSTRAINT `queueName`
--		FOREIGN KEY (`queueName`)
--		REFERENCES `database`.`QueueInfo` (`queueName`)
--		ON UPDATE NO ACTION
--		ON DELETE NO ACTION
);
CREATE TABLE if not exists `csadatabase`.`order` 
(
	  `id` VARCHAR(45) NOT NULL,
	  `queueName` VARCHAR(45) NULL,
           `phoneNumber` VARCHAR(45) NULL,
	  `reference_number` INT NULL,
	  `order_type` VARCHAR(45) NULL,
	  `call_before` TIMESTAMP NULL,
	  `call_after` TIMESTAMP NULL,
	  `date_created` TIMESTAMP NULL,
	  `status` VARCHAR(45) NULL,
		  
		  
		PRIMARY KEY (`id`)
--		CONSTRAINT `queueName`
--		FOREIGN KEY (`queueName`)
--		REFERENCES `database`.`QueueInfo` (`queueName`)
--		ON UPDATE NO ACTION
--		ON DELETE NO ACTION
);
