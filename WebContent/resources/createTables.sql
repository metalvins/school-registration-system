drop table if exists `customStudent`;

create table customStudent (
`id` INT NOT null primary key auto_increment,
`first_name` varchar(50),
`last_name` varchar(50),
`email` varchar(50)
);

drop table if exists `course`;

create table course (
`course_name` varchar(50) not null primary key,
`teacher` varchar(50),
`days` varchar(10),
`time` varchar(10)
);

drop table if exists `studentCourses`;
create table studentCourses (
`student_id` int not null,
`course_name` varchar(50),
`registered_date` varchar(50),
primary key(`student_id`, `course_name`)
);