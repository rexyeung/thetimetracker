# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  uid                       integer auto_increment not null,
  email                     varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  phone_number              varchar(255),
  constraint pk_users primary key (uid))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

