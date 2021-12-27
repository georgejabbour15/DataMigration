package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Setter
@Getter
public class CmpgnDmgMstr {

    private String CDE_CTRY;
    private String NUM_CMPGN;
    private Byte NUM_CMPGN_DMG_SEQ;
    private String CDE_CMPGN_DMG;
    private Date DTE_STRT;
    private Date DTE_END;
    private String DES_CMPGN;
    private String CDE_FULL_DMG;
    private String CDE_CMPGN_RSN;
    private String CDE_CMPGN_STAT;
    private String NUM_GOVT_ISS_CMPGN;
    private int CNT_VEH_CLOS_WITHOUT_CLM;
    private int CNT_TOT_CMPGN_VEH;
    private int CNT_CMPGN_VEH_EXCL;
    private int CNT_VEH_CLOS_WITH_CLM;
    private String CDE_CMPGN_TYP;
    private String DES_CMPGN_FULL;
    private Date DTE_SRC_RCD_UPDT;
    private LocalDateTime TME_SRC_RCD_UPDT;
    private String ID_SRC_RCD_UPDT_USER;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;

}
