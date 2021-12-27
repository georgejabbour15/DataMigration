package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
public class TktReclCmpgnMstr {
    private String CDE_CTRY;
    private String NUM_CMPGN;
    private String NUM_NHTSA_CMPGN;
    private Date DTE_EFF;
    private String DES_TKT_PRI_GRP;
    private String DES_TKT_PRI_ZN;
    private String CDE_AIRBAG_TYP;
    private String CDE_TRGT_TYPE;
    private String CDE_CMPGN_CATG;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
