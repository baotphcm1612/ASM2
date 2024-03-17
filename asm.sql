/*
 Navicat Premium Data Transfer

 Source Server         : ThucHanh
 Source Server Type    : SQL Server
 Source Server Version : 16001000 (16.00.1000)
 Source Host           : DESKTOP-HL72S6V\BRAVOS:1433
 Source Catalog        : studentManager
 Source Schema         : dbo

 Target Server Type    : SQL Server
 Target Server Version : 16001000 (16.00.1000)
 File Encoding         : 65001

 Date: 17/03/2024 14:44:31
*/


-- ----------------------------
-- Table structure for account
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[account]') AND type IN ('U'))
	DROP TABLE [dbo].[account]
GO

CREATE TABLE [dbo].[account] (
  [id] int  IDENTITY(100000,1) NOT NULL,
  [username] varchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [password] varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [type] smallint  NULL
)
GO

ALTER TABLE [dbo].[account] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of account
-- ----------------------------
SET IDENTITY_INSERT [dbo].[account] ON
GO

INSERT INTO [dbo].[account] ([id], [username], [password], [type]) VALUES (N'100002', N'admin', N'$2a$10$M.KYFyfsTyLZae2MieKxgOIIeXA0K83c/uIMMEPvK/cc5jWCzLdg2', N'1')
GO

INSERT INTO [dbo].[account] ([id], [username], [password], [type]) VALUES (N'101002', N'assmin', N'$2a$10$UCtVCc03JDLI/h0FUXso9.Yre.8fgfLIp.LYju1Kz2ZtQJU/TDhsC', N'0')
GO

INSERT INTO [dbo].[account] ([id], [username], [password], [type]) VALUES (N'101003', N'lecturer', N'$2a$10$TP/h4A3.tyJmDcgbe/2FJehUQdKViJvYqE9F74gJWAqR7FLjpvH.2', N'0')
GO

INSERT INTO [dbo].[account] ([id], [username], [password], [type]) VALUES (N'101004', N'officer', N'$2a$10$8lSunc6nfo63QVFLy.cumujSzJXyIUhtOsx675SwGc6zK79FdXNde', N'1')
GO

SET IDENTITY_INSERT [dbo].[account] OFF
GO


-- ----------------------------
-- Table structure for Student
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[Student]') AND type IN ('U'))
	DROP TABLE [dbo].[Student]
GO

CREATE TABLE [dbo].[Student] (
  [ID] varchar(10) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [IT] decimal(10,3)  NULL,
  [PhysicalEdu] decimal(10,2)  NULL,
  [Name] varchar(70) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [English] decimal(10,3)  NULL,
  [Email] varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [Gender] varchar(7) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [Phone] varchar(14) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [Address] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL
)
GO

ALTER TABLE [dbo].[Student] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of Student
-- ----------------------------
INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV001', N'10.000', N'10.00', N'Nguyen Quoc Bao', N'9.000', N'qqq@gmail.com', N'FEMALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV002', N'7.000', N'9.00', N'Nguyen Van A', N'7.000', N'qqq@gmail.com', N'FEMALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV003', N'10.000', N'8.00', N'Nguyen Van B', N'10.000', N'qqq@gmail.com', N'MALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV004', N'0.000', N'0.00', N'Nguyen Van B', N'0.000', N'qqq@gmail.com', N'MALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV005', N'0.000', N'0.00', N'Nguyen Van C', N'0.000', N'qqq@gmail.com', N'MALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV006', N'0.000', N'0.00', N'Nguyen Van D', N'0.000', N'qqq@gmail.com', N'FEMALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV007', N'0.000', N'0.00', N'Nguyen Van E', N'0.000', N'qqq@gmail.com', N'FEMALE', N'0700132121', N'Nonee')
GO

INSERT INTO [dbo].[Student] ([ID], [IT], [PhysicalEdu], [Name], [English], [Email], [Gender], [Phone], [Address]) VALUES (N'SV008', N'7.000', N'0.00', N'Nguyen Van F', N'7.000', N'qqq@gmail.com', N'FEMALE', N'0700132121', N'Nonee')
GO


-- ----------------------------
-- Auto increment value for account
-- ----------------------------
DBCC CHECKIDENT ('[dbo].[account]', RESEED, 101004)
GO


-- ----------------------------
-- Uniques structure for table account
-- ----------------------------
ALTER TABLE [dbo].[account] ADD CONSTRAINT [UQ__account__F3DBC572917DAC8F] UNIQUE NONCLUSTERED ([username] ASC)
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)  
ON [PRIMARY]
GO


-- ----------------------------
-- Primary Key structure for table account
-- ----------------------------
ALTER TABLE [dbo].[account] ADD CONSTRAINT [PK__account__3213E83F38CE165C] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)  
ON [PRIMARY]
GO


-- ----------------------------
-- Primary Key structure for table Student
-- ----------------------------
ALTER TABLE [dbo].[Student] ADD CONSTRAINT [Student_pk] PRIMARY KEY CLUSTERED ([ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)  
ON [PRIMARY]
GO

