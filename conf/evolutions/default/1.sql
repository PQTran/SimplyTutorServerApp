# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table assignment (
  id                            bigint auto_increment not null,
  name                          varchar(50) not null,
  description                   varchar(100),
  course_id                     bigint not null,
  constraint pk_assignment primary key (id)
);

create table course (
  id                            bigint auto_increment not null,
  title                         varchar(50) not null,
  description                   varchar(100),
  institute_id                  bigint,
  creator_user_id               bigint not null,
  constraint pk_course primary key (id)
);

create table enrollment (
  course_id                     bigint not null,
  user_id                       bigint not null,
  constraint pk_enrollment primary key (course_id,user_id)
);

create table institute (
  id                            bigint auto_increment not null,
  name                          varchar(100) not null,
  constraint uq_institute_name unique (name),
  constraint pk_institute primary key (id)
);

create table question (
  id                            bigint auto_increment not null,
  text                          varchar(300) not null,
  marks                         integer not null,
  assignment_id                 bigint,
  constraint pk_question primary key (id)
);

create table question_choice (
  id                            bigint auto_increment not null,
  text                          varchar(100) not null,
  question_order                integer not null,
  is_correct                    tinyint(1) default 0 not null,
  question_id                   bigint not null,
  constraint pk_question_choice primary key (id)
);

create table role (
  id                            bigint auto_increment not null,
  role_name                     varchar(30),
  description                   varchar(100),
  constraint pk_role primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  email                         varchar(50) not null,
  first_name                    varchar(30) not null,
  last_name                     varchar(30) not null,
  password                      varchar(30) not null,
  hashed_password               varchar(100),
  reset_token                   varchar(100),
  role_id                       bigint not null,
  constraint pk_user primary key (id)
);

alter table assignment add constraint fk_assignment_course_id foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_assignment_course_id on assignment (course_id);

alter table course add constraint fk_course_institute_id foreign key (institute_id) references institute (id) on delete restrict on update restrict;
create index ix_course_institute_id on course (institute_id);

alter table course add constraint fk_course_creator_user_id foreign key (creator_user_id) references user (id) on delete restrict on update restrict;
create index ix_course_creator_user_id on course (creator_user_id);

alter table enrollment add constraint fk_enrollment_course foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_enrollment_course on enrollment (course_id);

alter table enrollment add constraint fk_enrollment_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_enrollment_user on enrollment (user_id);

alter table question add constraint fk_question_assignment_id foreign key (assignment_id) references assignment (id) on delete restrict on update restrict;
create index ix_question_assignment_id on question (assignment_id);

alter table question_choice add constraint fk_question_choice_question_id foreign key (question_id) references question (id) on delete restrict on update restrict;
create index ix_question_choice_question_id on question_choice (question_id);

alter table user add constraint fk_user_role_id foreign key (role_id) references role (id) on delete restrict on update restrict;
create index ix_user_role_id on user (role_id);


# --- !Downs

alter table assignment drop foreign key fk_assignment_course_id;
drop index ix_assignment_course_id on assignment;

alter table course drop foreign key fk_course_institute_id;
drop index ix_course_institute_id on course;

alter table course drop foreign key fk_course_creator_user_id;
drop index ix_course_creator_user_id on course;

alter table enrollment drop foreign key fk_enrollment_course;
drop index ix_enrollment_course on enrollment;

alter table enrollment drop foreign key fk_enrollment_user;
drop index ix_enrollment_user on enrollment;

alter table question drop foreign key fk_question_assignment_id;
drop index ix_question_assignment_id on question;

alter table question_choice drop foreign key fk_question_choice_question_id;
drop index ix_question_choice_question_id on question_choice;

alter table user drop foreign key fk_user_role_id;
drop index ix_user_role_id on user;

drop table if exists assignment;

drop table if exists course;

drop table if exists enrollment;

drop table if exists institute;

drop table if exists question;

drop table if exists question_choice;

drop table if exists role;

drop table if exists user;

