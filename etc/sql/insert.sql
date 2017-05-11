-- insert static data after evolution runs
-- must update on schema change

INSERT INTO role VALUES
       (1, 'Admin', NULL),
       (2, 'User', 'A regular user who uses this application');

INSERT INTO user VALUES
       (1, 'ptranx23@gmail.com', 'Paul', 'Tran',
       'ptranx23', NULL, NULL, 1),
       (2, 'sharonsun@gmail.com', 'Sharon', 'Sun',
       'sharonsun', NULL, NULL, 2);

INSERT INTO institute VALUES
       (1, 'Paul''s Tutoring Services'),
       (2, 'Sharon''s Private Lessons');

INSERT INTO course VALUES
       (1, 'Integral Calculus', 'difficult preparation for mathematical examination', 1, 1),
       (2, 'Mandarin Singing', NULL, 1, 1),
       (3, 'Beginner Mandarin Chinese', NULL, 2, 2);

INSERT INTO enrollment (user_id, course_id) VALUES
       (1, 3),
       (2, 1),
       (2, 2);

INSERT INTO assignment VALUES
       (1, 'calculus review', NULL, 1),
       (2, 'riemann sums', 'adding area under graph', 1),
       (3, 'chinese vocab ch1', NULL, 3);

INSERT INTO question VALUES
       (1, 'what is a derivative?', 1, 1),
       (2, 'what is an integral?', 1, 1),
       (3, 'what is the derivative of x^2?', 5, 2),
       (4, 'translate: hello', 10, 3);

INSERT INTO question_choice VALUES
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
