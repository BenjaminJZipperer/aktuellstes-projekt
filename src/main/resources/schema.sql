create table actor
(
   id integer not null,
   nameprotagonist  varchar(255) not null,
   primary key(id)
);
create table speaker
(
   id integer not null,
   namespeaker         varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id),
   ACTOR_ID INT,
   foreign key (ACTOR_ID) references actor
   (ID)
);