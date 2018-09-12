drop database if exists XhuStore;
create database XhuStore;
use XhuStore;
/* 用户表 */
create table user(
    id bigint not null auto_increment,
    phone char(11) not null,
    password char(20) not null,
    nickname char(20) not null default '西瓜小贩',
    introduce varchar(200),
    qq_number char(13),
    wechat_number char(20),
	head_image char(40),
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '用户表';
/* 商品信息表 */
create table goods(
    id bigint not null auto_increment, 
    name varchar(50) not null,
    type char(12) not null,
    price float not null,
    depict varchar(200) comment '商品描述',
    amount int not null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '商品信息表';
/* 商品图片表 */
create table image(
	id bigint not null auto_increment, 
	goods_id bigint not null,
	image char(40) not null,
	create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '商品图片表';
/* 商品发布表 */
create table ralease(
    id bigint not null auto_increment, 
    user_id bigint not null,
    goods_id bigint not null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '商品发布表';
/* 商品收藏表 */
create table favorite(
    id bigint not null auto_increment, 
    user_id bigint not null,
    goods_id bigint not null,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '商品收藏表';
/* 订单表 */
create table orders(
    id bigint not null auto_increment,
    goods_id bigint not null,
    buyer_id bigint not null,
    seller_id bigint not null,
    state tinyint not null default 0,
    start_time datetime not null,
    finish_time datetime not null,
    comment varchar(50),
    admire tinyint default 0,
    create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment '订单表';
/* 管理员表 */
create table admin(
	id bigint not null auto_increment,
    account char(20) not null default 'admin',
    password char(20) not null default 'admin',
	create_time timestamp not null default current_timestamp,
    update_time timestamp not null,
    is_deleted tinyint not null default 0,
    primary key(id)

)engine=InnoDB auto_increment=1000 default charset=utf8 comment '管理员表';