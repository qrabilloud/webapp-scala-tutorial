CREATE TABLE User (
  id uuid default RANDOM_UUID() not null,
  name nvarchar not null
  primary key(id)
);