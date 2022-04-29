CREATE DATABASE BUDJET
GO

USE BUDJET
GO

CREATE TABLE team
(
    id_team int IDENTITY(1,1) NOT NULL,
    team_name varchar(30) NOT NULL
    CONSTRAINT PK_TEAM PRIMARY KEY CLUSTERED(id_team)
)
GO

CREATE TABLE member
(
    id_member int IDENTITY(1,1) NOT NULL,
    pseudo varchar(30) NOT NULL,
    email varchar(150) NOT NULL,
    member_password varchar(30) NOT NULL,
    avatar varbinary (max) NULL,
    id_team int NOT NULL,
    CONSTRAINT PK_MEMBER PRIMARY KEY CLUSTERED (id_member),
    CONSTRAINT FK_MEMBER_TEAM FOREIGN KEY(id_team) REFERENCES team(id_team)
)
GO

CREATE TABLE spending
(
    id_spending int IDENTITY(1,1) NOT NULL,
    amount float NULL,
    id_member int NULL,
    id_team int NULL,
    spending_date date NULL,
    CONSTRAINT PK_SPENDING PRIMARY KEY CLUSTERED(id_spending),
    CONSTRAINT FK_SPENDING_MEMBER FOREIGN KEY(id_member) REFERENCES member(id_member)
)
GO

CREATE TABLE budget
(
    id_budget int IDENTITY(1,1) NOT NULL,
    amount float NULL,
    budget_date date NULL,
    id_member int NULL,
    id_team int NULL,
    CONSTRAINT PK_BUDGET PRIMARY KEY CLUSTERED (id_budget),
    CONSTRAINT FK_BUDGET_MEMBER FOREIGN KEY(id_member) REFERENCES member(id_member),
    CONSTRAINT FK_BUDGET_TEAM FOREIGN KEY(id_team) REFERENCES team(id_team)
)
GO