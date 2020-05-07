INSERT INTO LPU_MOVIE_USER(USER_ID,PASSWORD) VALUES (101,'Sai Durga');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1001,'bahubali','telugu','ssr','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1002,'war','hindi','karan','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1003,'kgf','kannada','prashanth','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1004,'wfl','telugu','vd','Romantic');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1005,'hit','telugu','sudheer','thriller');

select * from LPU_MOVIE_MOVIE;
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2001, 'a','jalandhar','ram',9875,1001);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2002, 'b','jalandhar','sam',7896,1001);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2003, 'c','phagwara','shyam',7568,1002);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2004, 'd','phagwara','singh',8974,1003);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2005, 'e','amritsar','harpal',6548,1003);

select * from LPU_MOVIE_THEATER;
insert into LPU_MOVIE_SHOW(show_id,screen_Name,seats,show_Name,show_start_time,show_end_time,theater_Id) values(4001,'Screen1',120,'MorningShow',TIME('9:00:00'),TIME('12:00:00'),2001);
insert into LPU_MOVIE_SHOW(show_id,screen_Name,seats,show_Name,show_start_time,show_end_time,theater_Id) values(4002,'Screen2',120,'EveningShow',TIME('9:00:00'),TIME('12:00:00'),2002);
insert into LPU_MOVIE_SHOW(show_id,screen_Name,seats,show_Name,show_start_time,show_end_time,theater_Id) values(4003,'Screen3',120,'MorningShow',TIME('9:30:00'),TIME('12:30:00'),2003);

select * from LPU_MOVIE_SHOW;



INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,show_id) VALUES (1025,200,'Available',4001);

