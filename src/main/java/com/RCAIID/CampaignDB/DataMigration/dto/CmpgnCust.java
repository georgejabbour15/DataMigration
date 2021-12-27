package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Setter
@Getter
public class CmpgnCust {

    private int ID_CUST;
    private String NAM_LAST;
    private String NAM_FIR;
    private String NAM_MID_INIT;
    private LocalDateTime NAM_PFX;
    private String NAM_SFX;
    private LocalDateTime ADR_LN_1;
    private String ADR_LN_2;
    private LocalDateTime ADR_LN_3;
    private LocalDateTime NAM_CITY;
    private LocalDateTime CDE_ST;
    private LocalDateTime CDE_ZIP;
    private Date DTE_EFF;
    private LocalDateTime ADR_EML;
    private LocalDateTime NUM_TEL;
    private LocalDateTime CDE_CUST_CTRY;
    private Date DTE_SRC_RCD_UPDT;
    private LocalDateTime TME_SRC_RCD_UPDT;
    private String ID_SRC_RCD_UPDT_USER;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;

}
