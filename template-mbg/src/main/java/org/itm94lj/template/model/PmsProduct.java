package org.itm94lj.template.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsProduct implements Serializable {
    private Long productid;

    private String productName;

    private String productPic;

    private String productSn;

    private Integer deleteStatus;

    private Integer publishStatus;

    private Integer newStatus;

    private Integer recommandStatus;

    private Integer verifyStatus;

    private Integer sale;

    private Short price;

    private Short promotionprice;

    private Integer giftgrowth;

    private Integer giftpoint;

    private Integer usepointlimit;

    private String subtitle;

    private Short originalprice;

    private Integer stock;

    private Integer lowstock;

    private String unit;

    private Short weight;

    private Integer previewstatus;

    private String serviceids;

    private String keywords;

    private String note;

    private String albumpics;

    private String detailtitle;

    private Date promotionstarttime;

    private Date promotionendtime;

    private Integer promotionperlimit;

    private String productcategoryname;

    private String brandname;

    private Long id;

    private String discription;

    private String detaildesc;

    private String detailhtml;

    private String detailmobilehtml;

    private static final long serialVersionUID = 1L;

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
    }

    public Short getPromotionprice() {
        return promotionprice;
    }

    public void setPromotionprice(Short promotionprice) {
        this.promotionprice = promotionprice;
    }

    public Integer getGiftgrowth() {
        return giftgrowth;
    }

    public void setGiftgrowth(Integer giftgrowth) {
        this.giftgrowth = giftgrowth;
    }

    public Integer getGiftpoint() {
        return giftpoint;
    }

    public void setGiftpoint(Integer giftpoint) {
        this.giftpoint = giftpoint;
    }

    public Integer getUsepointlimit() {
        return usepointlimit;
    }

    public void setUsepointlimit(Integer usepointlimit) {
        this.usepointlimit = usepointlimit;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Short getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Short originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLowstock() {
        return lowstock;
    }

    public void setLowstock(Integer lowstock) {
        this.lowstock = lowstock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Integer getPreviewstatus() {
        return previewstatus;
    }

    public void setPreviewstatus(Integer previewstatus) {
        this.previewstatus = previewstatus;
    }

    public String getServiceids() {
        return serviceids;
    }

    public void setServiceids(String serviceids) {
        this.serviceids = serviceids;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbumpics() {
        return albumpics;
    }

    public void setAlbumpics(String albumpics) {
        this.albumpics = albumpics;
    }

    public String getDetailtitle() {
        return detailtitle;
    }

    public void setDetailtitle(String detailtitle) {
        this.detailtitle = detailtitle;
    }

    public Date getPromotionstarttime() {
        return promotionstarttime;
    }

    public void setPromotionstarttime(Date promotionstarttime) {
        this.promotionstarttime = promotionstarttime;
    }

    public Date getPromotionendtime() {
        return promotionendtime;
    }

    public void setPromotionendtime(Date promotionendtime) {
        this.promotionendtime = promotionendtime;
    }

    public Integer getPromotionperlimit() {
        return promotionperlimit;
    }

    public void setPromotionperlimit(Integer promotionperlimit) {
        this.promotionperlimit = promotionperlimit;
    }

    public String getProductcategoryname() {
        return productcategoryname;
    }

    public void setProductcategoryname(String productcategoryname) {
        this.productcategoryname = productcategoryname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDetaildesc() {
        return detaildesc;
    }

    public void setDetaildesc(String detaildesc) {
        this.detaildesc = detaildesc;
    }

    public String getDetailhtml() {
        return detailhtml;
    }

    public void setDetailhtml(String detailhtml) {
        this.detailhtml = detailhtml;
    }

    public String getDetailmobilehtml() {
        return detailmobilehtml;
    }

    public void setDetailmobilehtml(String detailmobilehtml) {
        this.detailmobilehtml = detailmobilehtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", productName=").append(productName);
        sb.append(", productPic=").append(productPic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionprice=").append(promotionprice);
        sb.append(", giftgrowth=").append(giftgrowth);
        sb.append(", giftpoint=").append(giftpoint);
        sb.append(", usepointlimit=").append(usepointlimit);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", originalprice=").append(originalprice);
        sb.append(", stock=").append(stock);
        sb.append(", lowstock=").append(lowstock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewstatus=").append(previewstatus);
        sb.append(", serviceids=").append(serviceids);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumpics=").append(albumpics);
        sb.append(", detailtitle=").append(detailtitle);
        sb.append(", promotionstarttime=").append(promotionstarttime);
        sb.append(", promotionendtime=").append(promotionendtime);
        sb.append(", promotionperlimit=").append(promotionperlimit);
        sb.append(", productcategoryname=").append(productcategoryname);
        sb.append(", brandname=").append(brandname);
        sb.append(", id=").append(id);
        sb.append(", discription=").append(discription);
        sb.append(", detaildesc=").append(detaildesc);
        sb.append(", detailhtml=").append(detailhtml);
        sb.append(", detailmobilehtml=").append(detailmobilehtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}