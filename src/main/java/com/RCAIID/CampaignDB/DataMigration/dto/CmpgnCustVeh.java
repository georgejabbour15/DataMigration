package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@Data
public class CmpgnCustVeh {

    private int ID_CUST;
    private String ID_FIN;
    private Date DTE_STRT;
    private Date DTE_END;
    private String IND_CUST_SRC_VEND;
    private String IND_VIO;
    private String NUM_VEH_LIC_PLT;
    private String DTE_VEH_RGS;
    private Date DTE_SRC_RCD_UPDT;
    private LocalDateTime TME_SRC_RCD_UPDT;
    private String ID_SRC_RCD_UPDT_USER;
    private String CDE_SELL_DLR;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
