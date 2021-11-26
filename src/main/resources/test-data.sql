BEGIN TRANSACTION;

DROP TABLE IF EXISTS room, reservation, employee, department, billing;

CREATE TABLE room(
    room_id serial,
	name varchar(40)  NOT NULL,
	bed_number int not null;
	bed_size varchar(40) NOT NULL,
	price money NOT NULL,
	CONSTRAINT PK_room PRIMARY KEY (room_id)
);

CREATE TABLE reservation(
    reservation_id serial,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    room_name varchar(40) NOT NULL,
    from_date date NOT NULL,
    to_date date NOT NULL,
    create_date date CURRENT_DATE,
    is_active boolean NOT NULL,
    CONSTRAINT PK_reservation PRIMARY KEY (reservation_id),
    CONSTRAINT FK_reservation_room FOREIGN KEY (room_name) REFERENCES room(name)
);

CREATE TABLE employee(
employee_id serial,
department_id int NOT NULL,
first_name varchar(50) NOT NULL,
last_name varchar(50) NOT NULL,
hire_date date NOT NULL,
hourly_pay_rate money NOT NULL,
schedule varchar(100) NOT NULL,
CONSTRAINT PK_employee PRIMARY KEY (employee_id),
CONSTRAINT FK_employee_department FOREIGN KEY (department_id) REFERENCES department(department_id)



CREATE TABLE department (
    department_id serial ,
    name varchar(70) NOT NULL,
    CONSTRAINT PK_department PRIMARY KEY (department_id)
);

CREATE TABLE billing(
    billing_id serial,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    room_id int NOT NULL,
    number_of_night int NOT NULL,
    unit_price money NOT NULL,
    total_price money NOT NULL,
    is_paid boolean NOT NULL,
    CONSTRAINT PK_billing PRIMARY KEY (billing_id),
    CONSTRAINT FK_billing_room FOREIGN KEY (room_id) REFERENCES room(room_id)
);

INSERT INTO department(name) VALUES ('management');
INSERT INTO department(name) VALUES ('human resource');
INSERT INTO department(name) VALUES ('billing');
INSERT INTO department(name) VALUES ('online customer services');
INSERT INTO department(name) VALUES ('front desk');
INSERT INTO department(name) VALUES ('house keeping');
INSERT INTO department(name) VALUES ('security');


INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-A',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-A',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-A',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-A suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-B',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-B',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-B',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-B suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-C',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-C',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-C',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-C suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-D',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-D',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-D',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-D suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-E',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-E',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-E',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-E suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-F',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-F',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-F',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-F suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-G',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-G',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-G',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-G suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-H',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-H',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-H',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-H suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-I',1,'king',218.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-I',1,'Queen',178.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-I',2,'single',189.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('creek-I suite ',1,'california king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-A fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-A fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-A fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-A fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-B fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-B fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-B fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-B fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-C fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-C fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-C fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-C fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-D fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-D fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-D fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-D fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-E fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-E fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-E fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-E fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-A fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-F fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-F fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-F fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-G fire',1,'king',278.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-G fire',1,'Queen',208.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-G fire',2,'single',219.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('wood-G fire suite ',1,'california king',408.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-A view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-A view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-A view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-A view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-B view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-B view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-B view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-B view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-C view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-C view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-C view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-C view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-D view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view suite ',1,'california king',489.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',1,'king',328.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',1,'Queen',388.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view',2,'single',399.57);
INSERT INTO room (name, bed_number, bed_size, price)
VALUES('watter-E view suite ',1,'california king',489.57);

INSERT INTO employee(department_id, first_name,last_name,hire_date,hourly_pay_rate,schedule)
VALUES (1,'Fred','Konan','2018-12-22',55,'Monday-Saturday');


COMMIT;



