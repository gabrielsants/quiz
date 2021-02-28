DROP TABLE IF EXISTS quizapp;

CREATE TABLE quizapp (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  question VARCHAR(250) NOT NULL,
  affirmation1 VARCHAR(250) NOT NULL,
  affirmation2 VARCHAR(250) NOT NULL,
  affirmation3 VARCHAR(250) NOT NULL,
  answer INT NOT NULL
);

INSERT INTO quizapp (question, affirmation1, affirmation2, affirmation3, answer) VALUES
    ('In javascript, what is the difference between Set and Map?', 'Map works like an object but duplicate his id’s', 'Each value of Set has a couple', 'Map allows keys of any type',3),
    ('What is closure in javascript?', 'Is when you can use only a key out of your workspace', 'Is when you can use a function that remembers of his lexical scope even when used out of his lexical scope', 'Is when you can’t use a function that remembers of his lexical scope even when used out of his lexical scope',2,),
    ('In CSS, what is the difference between pseudo-classes and pseudo-elements','Using Pseudo-classes you can, just select elements that use attributes since the Pseudo-element refers to imaginary elements that are not part of the DOM.','Using Pseudo-classes you can, just select elements that use attributes since the Pseudo-element refers to imaginary elements that are not part of the DOM.','Using Pseudo-classes you cannot, just select elements that use attributes since the Pseudo-element refers to imaginary elements that are not part of the DOM.',2),
    ('Which HTML tags are used to display the data in tabular form?','<table> <thead> <tbody> <tfoot> <tr> <th> <td> <caption> <colgroup> and <col>','<table> <thead> <tbody> <tfoot> <br> <th> <td> <caption> <colgroup> and <col>','<table> <thead> <tbody> <tfoot> <tr> <th> <td> <label> <colgroup> and <col>',1),
    ('What is the main difference between CSS Grid and Flexbox?','Flexbox is used to design three-dimensional layouts of greater complexity, with a straight line layout. The CSS grid is intended for the creation of two-dimensional layouts of less complexity.','Flexbox is used to design two-dimensional layouts of greater complexity, with a straight line layout. The CSS grid is intended for the creation of simplified one-dimensional layouts.','The flexbox is used to design simplified one-dimensional layouts, with a straight layout. The CSS grid is used to create two-dimensional layouts of greater complexity.',3);