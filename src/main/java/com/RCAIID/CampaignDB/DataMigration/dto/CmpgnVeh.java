package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
public class CmpgnVeh {
    private String CDE_CTRY;
    private String NUM_CMPGN;
    private String ID_FIN;
    private String CDE_CMPGN_VEH_RPR_STAT;
    private String DTE_VEH_ADD;
    private String DTE_VEH_RPR;
    private String DTE_VEH_ADMON;
    private String TME_CMPGN_VEH_MNL_EXCL;
    private String ID_CMPGN_VEH_MNL_EXCL_USER;
    private String DTE_SRC_RCD_UPDT;
    private String TME_SRC_RCD_UPDT;
    private String ID_SRC_RCD_UPDT_USER;
    private String CDE_DLR;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
