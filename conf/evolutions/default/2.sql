# --- !Ups
INSERT INTO role (id, role_name, description) VALUES
       (1, 'Admin', NULL),
       (2, 'User', 'A regular user who uses this application');

INSERT INTO user (id, email, first_name, last_name,
                  password, hashed_password, reset_token, role_id) VALUES
       (1, 'paultran@email.ca', 'Paul', 'Tran',
       'ptranx23', NULL, NULL, 1),
       (2, 'sharonmoon@email.ca', 'Sharon', 'Moon',
       'sharonsun', NULL, NULL, 2);

INSERT INTO institute (id, name) VALUES
       (1, 'Paul''s Tutoring Services'),
       (2, 'Sharon''s Private Lessons');

INSERT INTO course (id, title, description, institute_id, creator_user_id) VALUES
       (1, 'Integral Calculus', 'difficult preparation for mathematical examination', 1, 1),
       (2, 'Mandarin Singing', NULL, 1, 1),
       (3, 'Beginner Mandarin Chinese', NULL, 2, 2);

INSERT INTO enrollment (user_id, course_id) VALUES
       (1, 3),
       (2, 1),
       (2, 2);

INSERT INTO assignment (id, name, description, course_id) VALUES
       (1, 'calculus review', NULL, 1),
       (2, 'riemann sums', 'adding area under graph', 1),
       (3, 'chinese vocab ch1', NULL, 3);

INSERT INTO question (id, text, marks, assignment_id) VALUES
       (1, 'what is a derivative?', 1, 1),
       (2, 'what is an integral?', 1, 1),
       (3, 'what is the derivative of x^2?', 5, 2),
       (4, 'translate: hello', 10, 3);

INSERT INTO question_choice (id, text, question_order, is_correct, question_id) VALUES
       (1, 'a way to view area', 1, 0, 1),
       (2, 'change in graph', 2, 1, 1),
       (3, '1 / slope', 3, 0, 1),
       (4, 'true', 1, 0, 2),
       (5, 'false', 2, 1, 2),
       (6, 'log(x^2)', 1, 0, 3),
       (7, 'x', 2, 0, 3),
       (8, '2x^3', 3, 0, 3),
       (9, '2x', 4, 1, 3),
       (10, 'wo bu zhi dao', 1, 0, 4),
       (11, 'zai jian', 2, 0, 4),
       (12, 'nihao', 3, 1, 4);

# --- !Downs

DELETE FROM question_choice;
DELETE FROM question;
DELETE FROM assignment;
DELETE FROM enrollment;
DELETE FROM course;
DELETE FROM institute;
DELETE FROM user;
DELETE FROM role;
