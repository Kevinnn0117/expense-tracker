CREATE TABLE expenses (
    id INTEGER PRIMARY KEY,
    description TEXT,
    category TEXT,
    amount REAL
);

INSERT INTO expenses (id, description, category, amount)
VALUES
(1, 'Lunch', 'Food', 12.50),
(2, 'Metro', 'Travel', 2.75),
(3, 'Book', 'Learning', 18.00);

SELECT * FROM expenses;

UPDATE expenses
SET amount = 15.00
WHERE id = 1;

SELECT * FROM expenses;

DELETE FROM expenses
WHERE id = 3;

SELECT * FROM expenses;