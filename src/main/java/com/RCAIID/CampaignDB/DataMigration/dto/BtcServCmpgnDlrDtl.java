package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class BtcServCmpgnDlrDtl {

    private String CDE_CTRY;
    private String CDE_DLR;
    private String NUM_CMPGN;
    private String DTE_YR;
    private String DTE_MTH;
    private String DTE_WK;
    private int CNT_TOT_VEH;
    private int CNT_TOT_RPRD_VEH;
    private int CNT_TOT_TARG_VEH;
    private float PCT_TRGT_RATE;
    private float PCT_CML_RATE;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;

}