create table user
(
	id bigint unsigned auto_increment,
	user_name varchar(200) not null,
	email varchar(200) null,
	mobile varchar(11) null,
	hash_password blob null,
	organization_id bigint unsigned null,
	role_id bigint unsigned null,
	create_time datetime null,
	update_time datetime null,
	primary key (`id`),
	constraint pk_id
		unique (id),
	constraint uk_user_name
		unique (user_name),
	constraint uk_email
		unique (email),
	constraint uk_mobile
		unique (mobile)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
