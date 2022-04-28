CREATE TABLE user
(
    id_user int IDENTITY(1,1) NOT NULL,
    firstName varchar(30) NULL,
    lastName varchar(50) NULL,
    email varchar(150) NOT NULL,
    motDePasse varchar(30) NOT NULL,
    avatar varbinary (max), NULL,
    id-groupe int NOT NULL,
    CONSTRAINT PK_USER PRIMARY KEY CLUSTERED (id_user),
    CONSTRAINT FK_USER_GROUP FOREIGN KEY(id-group) REFERENCES group(id-group)
)
GO