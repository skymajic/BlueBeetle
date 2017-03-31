# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table message (
  id                        bigint auto_increment not null,
  message                   varchar(255),
  constraint pk_message primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table message;

SET FOREIGN_KEY_CHECKS=1;

