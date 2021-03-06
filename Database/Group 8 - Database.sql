USE [LibraryManagement]
GO
/****** Object:  Table [dbo].[book_list]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_list](
	[book_id] [int] IDENTITY(1,1) NOT NULL,
	[book_name] [varchar](200) NULL,
	[book_detail] [varchar](1000) NULL,
	[fee_per_day] [int] NULL,
	[author_name] [varchar](50) NULL,
	[published_date] [date] NULL,
	[publisher_id] [int] NULL,
	[book_type_id] [int] NULL,
 CONSTRAINT [PK_book_book_id] PRIMARY KEY CLUSTERED 
(
	[book_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_type]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[book_type](
	[book_type_id] [int] IDENTITY(1,1) NOT NULL,
	[book_type_name] [varchar](50) NULL,
 CONSTRAINT [PK_booktype_booktypeid] PRIMARY KEY CLUSTERED 
(
	[book_type_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[borrowed_ticket]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[borrowed_ticket](
	[ticket_id] [int] IDENTITY(1,1) NOT NULL,
	[member_id] [int] NULL,
	[ticket_date] [date] NULL,
	[return_date] [date] NULL,
	[ticket_status] [int] NULL,
	[employee_id] [int] NULL,
 CONSTRAINT [PK_borrowed_ticket_ticket_id] PRIMARY KEY CLUSTERED 
(
	[ticket_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[borrowed_ticket_detail]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[borrowed_ticket_detail](
	[ticket_details_id] [int] IDENTITY(1,1) NOT NULL,
	[ticket_id] [int] NULL,
	[book_id] [int] NULL,
	[amount] [int] NULL,
 CONSTRAINT [PK_borrowed_ticket_details_id] PRIMARY KEY CLUSTERED 
(
	[ticket_details_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[employee_list]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[employee_list](
	[employee_id] [int] IDENTITY(1,1) NOT NULL,
	[fullname] [varchar](50) NULL,
	[gender] [int] NULL,
	[salary] [int] NULL,
	[position] [varchar](20) NULL,
	[username] [varchar](50) NULL,
	[pass] [varchar](50) NULL,
	[DOB] [date] NULL,
	[Email] [varchar](50) NULL,
	[Phone] [varchar](50) NULL,
 CONSTRAINT [PK_employee_list_username] PRIMARY KEY CLUSTERED 
(
	[employee_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[member]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[member](
	[member_id] [int] IDENTITY(1,1) NOT NULL,
	[member_email] [varchar](50) NULL,
	[member_name] [varchar](50) NULL,
	[member_gender] [int] NULL,
	[member_DOB] [date] NULL,
	[member_address] [varchar](100) NULL,
	[member_phone] [varchar](10) NULL,
 CONSTRAINT [PK_memberid] PRIMARY KEY CLUSTERED 
(
	[member_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[nation]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[nation](
	[nation_id] [int] IDENTITY(1,1) NOT NULL,
	[nation_name] [varchar](50) NULL,
 CONSTRAINT [PK_nation_nationid] PRIMARY KEY CLUSTERED 
(
	[nation_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[publisher]    Script Date: 9/4/2020 8:34:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[publisher](
	[publisher_id] [int] IDENTITY(1,1) NOT NULL,
	[publisher_name] [varchar](100) NULL,
	[nation_id] [int] NULL,
 CONSTRAINT [PK_publisher_publisherid] PRIMARY KEY CLUSTERED 
(
	[publisher_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[book_list] ON 

INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (1, N'Humans', N'Humans will resonate with readers across the globe?providing a portrait of our shared experience.', 10, N'Brandon Stanton', CAST(0xA7410B00 AS Date), 4, 1)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (2, N'Dior Hats: From Christian Dior to Stephen Jones', N'The great hats of Dior, as chosen by Stephen Jones, one of the most revered milliners of our times.', 10, N'Stephen Jones', CAST(0x84410B00 AS Date), 1, 1)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (3, N'Die with Zero: Getting All You Can from Your Money and Your Life', N'A Common-Sense Guide to Living Rich….Instead of Dying Rich', 10, N'Bill Perkins', CAST(0x61410B00 AS Date), 1, 2)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (4, N'Lights Out: Pride, Delusion, and the Fall of General Electric', N'Lights Out details how one of America’s all-time great companies has been reduced to a cautionary tale for our times.', 10, N'Thomas Gryta', CAST(0x5A410B00 AS Date), 1, 2)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (5, N'Rebooting AI: Building Artificial Intelligence We Can Trust', N'Despite the hype surrounding AI, creating an intelligence that rivals or exceeds human levels is far more complicated than we have been led to believe.', 10, N'Gary Marcus', CAST(0x40410B00 AS Date), 5, 4)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (6, N'Programmer - Witches of the Network World', N'This is the first book in the series "FOLLOWING DREAMS" that Messy Books promises to bring kids the excitement, passion and excitement, and confidence to pursue their dreams.', 10, N'Jane (J.M) Bedell', CAST(0x22410B00 AS Date), 6, 4)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (7, N'Getting to Know ArcGIS Pro', N'In the tradition of the best-selling Getting to Know series, Getting to Know ArcGIS Pro, second edition teaches new and existing GIS users how to get started solving problems by visualizing, querying, creating, editing, analyzing, and presenting geospatial data in both 2D and 3D environments using ArcGIS Pro.', 10, N'Michael Law', CAST(0x3A3F0B00 AS Date), 3, 4)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (8, N'Dog Man: Grime and Punishment', N'The next great Dog Man adventure from the worldwide bestselling author and artist Dav Pilkey. You`ll howl with laughter!', 10, N'Dav Pilkey', CAST(0x84410B00 AS Date), 1, 3)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (9, N'The Very Hungry Caterpillar', N'THE all-time classic picture book, from generation to generation, sold somewhere in the world every 30 seconds! Have you shared it with a child or grandchild in your life?', 10, N'Eric Carle', CAST(0xA7410B00 AS Date), 2, 3)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (10, N'Chinese for Kids', N'Mandarin for Kids Set 1 is a motivating set of first Chinese readers for children ages 3-8 who are beginning to learn Chinese.', 10, N'Germaine Choe', CAST(0xDB3A0B00 AS Date), 3, 3)
INSERT [dbo].[book_list] ([book_id], [book_name], [book_detail], [fee_per_day], [author_name], [published_date], [publisher_id], [book_type_id]) VALUES (11, N'365 Delicious Family Dishes', N'365 Delicious Family Dishes - choose one every day, surprise every day, don`t repeat yourself! Simple happiness lies in family meals - loving connections!', 10, N'Ezcooking Class', CAST(0x053A0B00 AS Date), 6, 5)
SET IDENTITY_INSERT [dbo].[book_list] OFF
SET IDENTITY_INSERT [dbo].[book_type] ON 

INSERT [dbo].[book_type] ([book_type_id], [book_type_name]) VALUES (1, N'Arts & Photography')
INSERT [dbo].[book_type] ([book_type_id], [book_type_name]) VALUES (2, N'Business & Money')
INSERT [dbo].[book_type] ([book_type_id], [book_type_name]) VALUES (3, N'Children`s Books')
INSERT [dbo].[book_type] ([book_type_id], [book_type_name]) VALUES (4, N'Computers & Technology')
INSERT [dbo].[book_type] ([book_type_id], [book_type_name]) VALUES (5, N'Cookbooks, Food & Wine')
SET IDENTITY_INSERT [dbo].[book_type] OFF
SET IDENTITY_INSERT [dbo].[borrowed_ticket] ON 

INSERT [dbo].[borrowed_ticket] ([ticket_id], [member_id], [ticket_date], [return_date], [ticket_status], [employee_id]) VALUES (1, 1, CAST(0x20410B00 AS Date), CAST(0x22410B00 AS Date), 1, 2)
INSERT [dbo].[borrowed_ticket] ([ticket_id], [member_id], [ticket_date], [return_date], [ticket_status], [employee_id]) VALUES (2, 2, CAST(0xE5400B00 AS Date), CAST(0xE9400B00 AS Date), 1, 1)
INSERT [dbo].[borrowed_ticket] ([ticket_id], [member_id], [ticket_date], [return_date], [ticket_status], [employee_id]) VALUES (3, 3, CAST(0xE9400B00 AS Date), CAST(0xF4400B00 AS Date), 1, 4)
INSERT [dbo].[borrowed_ticket] ([ticket_id], [member_id], [ticket_date], [return_date], [ticket_status], [employee_id]) VALUES (4, 4, CAST(0xD1400B00 AS Date), CAST(0xDB400B00 AS Date), 1, 3)
SET IDENTITY_INSERT [dbo].[borrowed_ticket] OFF
SET IDENTITY_INSERT [dbo].[borrowed_ticket_detail] ON 

INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (1, 1, 1, 1)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (2, 1, 2, 2)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (3, 2, 4, 1)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (4, 2, 5, 2)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (5, 3, 6, 1)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (6, 3, 1, 3)
INSERT [dbo].[borrowed_ticket_detail] ([ticket_details_id], [ticket_id], [book_id], [amount]) VALUES (7, 4, 5, 1)
SET IDENTITY_INSERT [dbo].[borrowed_ticket_detail] OFF
SET IDENTITY_INSERT [dbo].[employee_list] ON 

INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (1, N'Nguyen Nhat Tien', 1, 6000, N'CEO', N'tien', N'12345', CAST(0xF6210B00 AS Date), N'nnt2107@gmail.com', N'0335167610')
INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (2, N'Nguyen Thuy An', 0, 2000, N'Staff', N'thuyan', N'an12345', CAST(0x4F240B00 AS Date), N'thuyan@gmail.com', N'0908070505')
INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (3, N'Nguyen Ngoc Anh', 0, 3000, N'Staff', N'ngocanh', N'anh212345', CAST(0x8B260B00 AS Date), N'ngocanhng@gmail.com', N'0908123605')
INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (4, N'Nguyen Anh Duc', 1, 3000, N'Staff', N'anhduc', N'anhduc2345', CAST(0x3D230B00 AS Date), N'anhduc99@gmail.com', N'0908842605')
INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (5, N'Nguyen Bao Duy', 1, 4000, N'Manager', N'baoduy49', N'baoduy12345', CAST(0x25220B00 AS Date), N'baoduy9896@gmail.com', N'0908078905')
INSERT [dbo].[employee_list] ([employee_id], [fullname], [gender], [salary], [position], [username], [pass], [DOB], [Email], [Phone]) VALUES (6, N'Nguyen Duc Anh', 1, 2000, N'Staff', N'ducanh888', N'ducanh6312345', CAST(0xEB260B00 AS Date), N'ducanh02010@gmail.com', N'0908079875')
SET IDENTITY_INSERT [dbo].[employee_list] OFF
SET IDENTITY_INSERT [dbo].[member] ON 

INSERT [dbo].[member] ([member_id], [member_email], [member_name], [member_gender], [member_DOB], [member_address], [member_phone]) VALUES (1, N'wilson98@gmail.com', N'Johnathan Wilson', 1, CAST(0x0A270B00 AS Date), N'Q2-TPHCM', N'0120942941')
INSERT [dbo].[member] ([member_id], [member_email], [member_name], [member_gender], [member_DOB], [member_address], [member_phone]) VALUES (2, N'ducbao089@gmail.com', N'Nguyen Duc Bao', 1, CAST(0x7A260B00 AS Date), N'Q6-TPHCM', N'0120942943')
INSERT [dbo].[member] ([member_id], [member_email], [member_name], [member_gender], [member_DOB], [member_address], [member_phone]) VALUES (3, N'myanh9724@gmail.com', N'Huynh My Anh', 0, CAST(0x36210B00 AS Date), N'Q.Thu Duc-TPHCM', N'0120942931')
INSERT [dbo].[member] ([member_id], [member_email], [member_name], [member_gender], [member_DOB], [member_address], [member_phone]) VALUES (4, N'duckhoi988@gmail.com', N'Tran Duc Khoi', 1, CAST(0x5E1D0B00 AS Date), N'Q8-TPHCM', N'0120942986')
INSERT [dbo].[member] ([member_id], [member_email], [member_name], [member_gender], [member_DOB], [member_address], [member_phone]) VALUES (5, N'mytuyen8721@gmail.com', N'Truong My Tuyen', 0, CAST(0x6B230B00 AS Date), N'Q1-TPHCM', N'0120942345')
SET IDENTITY_INSERT [dbo].[member] OFF
SET IDENTITY_INSERT [dbo].[nation] ON 

INSERT [dbo].[nation] ([nation_id], [nation_name]) VALUES (1, N'US')
INSERT [dbo].[nation] ([nation_id], [nation_name]) VALUES (2, N'China')
INSERT [dbo].[nation] ([nation_id], [nation_name]) VALUES (3, N'UK')
INSERT [dbo].[nation] ([nation_id], [nation_name]) VALUES (4, N'Viet Nam')
SET IDENTITY_INSERT [dbo].[nation] OFF
SET IDENTITY_INSERT [dbo].[publisher] ON 

INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (1, N'Graphix', 1)
INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (2, N'Philomel Books', 1)
INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (3, N'Language Together', 2)
INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (4, N'Macmillan Publishers', 3)
INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (5, N'Vintage', 3)
INSERT [dbo].[publisher] ([publisher_id], [publisher_name], [nation_id]) VALUES (6, N'The World', 3)
SET IDENTITY_INSERT [dbo].[publisher] OFF
ALTER TABLE [dbo].[borrowed_ticket_detail] ADD  DEFAULT ((0)) FOR [amount]
GO
ALTER TABLE [dbo].[employee_list] ADD  DEFAULT (NULL) FOR [pass]
GO
ALTER TABLE [dbo].[book_list]  WITH CHECK ADD  CONSTRAINT [FK_book_booktype] FOREIGN KEY([book_type_id])
REFERENCES [dbo].[book_type] ([book_type_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[book_list] CHECK CONSTRAINT [FK_book_booktype]
GO
ALTER TABLE [dbo].[book_list]  WITH CHECK ADD  CONSTRAINT [FK_book_publisher] FOREIGN KEY([publisher_id])
REFERENCES [dbo].[publisher] ([publisher_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[book_list] CHECK CONSTRAINT [FK_book_publisher]
GO
ALTER TABLE [dbo].[borrowed_ticket]  WITH CHECK ADD  CONSTRAINT [FK_borrowed_ticket_member] FOREIGN KEY([member_id])
REFERENCES [dbo].[member] ([member_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[borrowed_ticket] CHECK CONSTRAINT [FK_borrowed_ticket_member]
GO
ALTER TABLE [dbo].[borrowed_ticket]  WITH CHECK ADD  CONSTRAINT [FK_employee_employeelist] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee_list] ([employee_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[borrowed_ticket] CHECK CONSTRAINT [FK_employee_employeelist]
GO
ALTER TABLE [dbo].[borrowed_ticket_detail]  WITH CHECK ADD  CONSTRAINT [FK_borrowed_book] FOREIGN KEY([book_id])
REFERENCES [dbo].[book_list] ([book_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[borrowed_ticket_detail] CHECK CONSTRAINT [FK_borrowed_book]
GO
ALTER TABLE [dbo].[borrowed_ticket_detail]  WITH CHECK ADD  CONSTRAINT [FK_borrowed_ticket] FOREIGN KEY([ticket_id])
REFERENCES [dbo].[borrowed_ticket] ([ticket_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[borrowed_ticket_detail] CHECK CONSTRAINT [FK_borrowed_ticket]
GO
ALTER TABLE [dbo].[publisher]  WITH CHECK ADD  CONSTRAINT [FK_nation_publisher] FOREIGN KEY([nation_id])
REFERENCES [dbo].[nation] ([nation_id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[publisher] CHECK CONSTRAINT [FK_nation_publisher]
GO
