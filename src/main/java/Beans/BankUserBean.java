package Beans;

import java.io.Serializable;

public class BankUserBean implements Serializable {
    private String uname;
    private String ufullname;
    private String upassword;
    private Long adhar;
    private Long phoneno;
    private Long accountno;
    private Double accountbalance;

    public BankUserBean() {}

    public String getUname() { return uname; }
    public void setUname(String uname) { this.uname = uname; }

    public String getUfullname() { return ufullname; }
    public void setUfullname(String ufullname) { this.ufullname = ufullname; }

    public String getUpassword() { return upassword; }
    public void setUpassword(String upassword) { this.upassword = upassword; }

    public Long getAdhar() { return adhar; }
    public void setAdhar(Long adhar) { this.adhar = adhar; }

    public Long getPhoneno() { return phoneno; }
    public void setPhoneno(Long phoneno) { this.phoneno = phoneno; }

    public Long getAccountno() { return accountno; }
    public void setAccountno(Long accountno) { this.accountno = accountno; }

    public Double getAccountbalance() { return accountbalance; }
    public void setAccountbalance(Double accountbalance) { this.accountbalance = accountbalance; }
}
