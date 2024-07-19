/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2024/7/18 13:16:13                           */
/*==============================================================*/


drop table if exists Brand;

drop table if exists PMS_Product;

type = InnoDB charset = utf-8;

/*==============================================================*/
/* Table: Brand                                                 */
/*==============================================================*/
create table Brand
(
   id                   bigint not null,
   name                 varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
   first_letter         varchar(8) comment '首字母',
   sort                 int,
   factory_status       int comment '是否为品牌制造商： 0->不是； 1-> 是',
   show_status          int,
   product_count        int comment '产品数量',
   product_comment_count int comment '产品评论数量',
   logo                 varchar(255) comment '品牌LOGO',
   big_pic              varchar(255) comment '专区大图',
   brand_story          text CHARACTER SET utf8 COLLATE utf8_general_ci NULL comment '品牌故事',
   primary key (id)
);

/*==============================================================*/
/* Table: PMS_Product                                           */
/*==============================================================*/
create table PMS_Product
(
   PRODUCT_NAME         varchar(64),
   PRODUCT_PIC          varchar(255),
   PRODUCT_SN           varchar(64),
   DELETE_STATUS        int,
   PUBLISH_STATUS       int,
   NEW_STATUS           int,
   RECOMMAND_STATUS     int,
   VERIFY_STATUS        int,
   Sale                 int,
   Price                decimal(2),
   PromotionPrice       decimal(2),
   GiftGrowth           int,
   GiftPoint            int,
   UsePointLimit        int,
   SubTitle             varchar(255),
   Discription          text,
   OriginalPrice        decimal(2),
   Stock                int,
   LowStock             int,
   Unit                 varchar(16),
   Weight               decimal(2),
   PreviewStatus        int,
   ServiceIds           varchar(64),
   Keywords             varchar(255),
   Note                 varchar(255),
   AlbumPics            varchar(255),
   DetailTitle          varchar(255),
   DetailDesc           text,
   DetailHtml           text,
   DetailMobileHtml     text,
   PromotionStartTime   datetime,
   PromotionEndTime     datetime,
   PromotionPerLimit    int,
   ProductCategoryName  varchar(255),
   BrandName            varchar(255),
   ProductId            bigint not null,
   id                   bigint,
   primary key (ProductId)
);

alter table PMS_Product add constraint FK_Relationship_1 foreign key (id)
      references Brand (id) on delete restrict on update restrict;

