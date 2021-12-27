package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class TktCmpgnVehCustStat {
    private String CDE_CNTRY;
    private String ID_FIN;
    private String CDE_CMPGN_VEH_CUST_STAT;
    private String CDE_DLR;
    private String NAM_FTS_DC;
    private String NAM_LAST;
    private String NUM_TEL;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
