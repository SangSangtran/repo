create table Users (
user_id int primary key auto_increment,
user_name varchar(100) not null,
password varchar(300) not null,
phone varchar(20) not null,
mail varchar(300) not null
);

create table Actors (
actor_id int primary key auto_increment,
name varchar(100),
description text,
list_movie text
);

create table Movies (
movie_id int primary key auto_increment,
movie_name varchar(100),
description text,
rating int,
duration int,
release_date date,
actor_id int,
foreign key (actor_id) references Actors(actor_id)
);

create table Theaters (
theater_id int primary key auto_increment,
theater_name varchar(100),
theater_address varchar(300)
);

create table Showtimes (
showtime_id int primary key auto_increment,
theater_id int,
movie_id int,
foreign key (movie_id) references Movies(movie_id),
foreign key (theater_id) references Theaters(theater_id)
);

create table Tickets (
ticker_id int primary key auto_increment,
user_id int,
movie_id int,
showtime_id int,
theater_id int,
foreign key (user_id) references Users(user_id),
foreign key (movie_id) references Movies(movie_id),
foreign key (showtime_id) references Showtimes(showtime_id),
foreign key (theater_id) references Theaters(theater_id)
);

drop table Tickets;

create table Tickets (
ticket_id int primary key auto_increment,
user_id int,
movie_id int,
showtime_id int,
theater_id int,
foreign key (user_id) references Users(user_id),
foreign key (movie_id) references Movies(movie_id),
foreign key (showtime_id) references Showtimes(showtime_id),
foreign key (theater_id) references Theaters(theater_id)
);

create table Payments (
payment_id int primary key auto_increment,
ticket_id int,
payment_method varchar(100),
payment_status varchar(100),
foreign key (ticket_id) references Tickets(ticket_id)
);

create table Rooms (
room_id int primary key auto_increment,
room_name int,
total_seats int,
theater_id int,
foreign key (theater_id) references Theaters(theater_id) 
);

create table Seats (
seat_id int primary key auto_increment,
seat_name int,
status enum('empty', 'reserved') default('empty'),
room_id int,
foreign key (room_id) references Rooms(room_id) 
);

alter table Users
add column date_of_birth date;

alter table Tickets 
add column price float not null check(price >= 0);

alter table Tickets
add column order_date datetime default current_timestamp;

alter table Tickets
drop column order_date;

alter table Tickets
add column booking_date datetime default current_timestamp;

alter table Tickets
add column status enum('confirmed', 'canceled') comment'Trạng thái vé';

alter table Showtimes
add column showtime_datetime datetime not null;

alter table Showtimes
add column room_id int;

alter table Showtimes
add foreign key (room_id) references Rooms (room_id);

ALTER TABLE Movies
MODIFY COLUMN rating DECIMAL(2,1);

ALTER TABLE Movies
ADD COLUMN thumbnail VARCHAR(300);

ALTER TABLE Users
MODIFY COLUMN password VARCHAR(100) NOT NULL DEFAULT '';

ALTER TABLE Users
ADD COLUMN google_account_id INT(11) DEFAULT 0,
ADD COLUMN role_id INT(11) DEFAULT NULL;

ALTER TABLE Users
MODIFY COLUMN google_account_id INT DEFAULT 0,
MODIFY COLUMN role_id INT DEFAULT NULL;

ALTER TABLE Users DROP COLUMN mail;