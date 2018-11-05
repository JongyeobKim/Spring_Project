package kr.ac.kopo.board.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@Entity
@Table(name="gongji")
public class Gongji {

    private static final long serialVersionUID = 1L;        // �ø���������Ҷ� ���� ������ ǥ��
    
    @Id
    @GeneratedValue
    @Column(name="id", unique=true, nullable=false)
    @XmlElement
    private int id;
    
    @Column
    @XmlElement
    private String title;
    
    @Column
    @XmlElement
    private Date date;
    
    @Column
    @XmlElement
    private String content;
    
    @Column
    @XmlElement
    private Integer nodeid;
    
    @Column
    @XmlElement
    private Integer viewcnt;
    
    @Column
    @XmlElement
    private Integer recnt;
    
    
    //targetEntity: ���踦 ���� Entity Class ����, cascade: �� Entity�� ���濡 ���� ���踦 ���� Entity�� ���� ����
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Gongji.class)    //�� => writer  ??!
    @JoinColumn(name = "rootid", referencedColumnName = "id")
    @JsonManagedReference
    private Gongji rootid;
    
    //fetch: ���� Entity�� ������ �б� ������ ���� (EAGER�� ��� ����� Entity�� ������ �̸� �о���� ��)
    //mappedBy: ����� ���� ������ ������ ��ü�� �Ǵ� �ʿ��� ����
    @OneToMany (mappedBy="rootid", fetch=FetchType.EAGER, cascade = CascadeType.ALL)    //writer => ��   ??!
    @JsonManagedReference
    private List<Gongji> replies;
    
    @ManyToOne
    @XmlElement
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    public Integer getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(Integer viewcnt) {
        this.viewcnt = viewcnt;
    }

    public Integer getRecnt() {
        return recnt;
    }

    public void setRecnt(Integer recnt) {
        this.recnt = recnt;
    }

    public Gongji getRootid() {
        return rootid;
    }

    public void setRootid(Gongji rootid) {
        this.rootid = rootid;
    }

    public List<Gongji> getReplies() {
        return replies;
    }

    public void setReplies(List<Gongji> replies) {
        this.replies = replies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}