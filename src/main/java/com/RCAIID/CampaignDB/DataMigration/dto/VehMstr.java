package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Data
public class VehMstr {
    private String ID_FIN;
    private String ID_NUM_VIN;
    private String NUM_MODL_YR;
    private String CDE_MODL_CLS;
    private String CDE_WRLD_MFR;
    private String CDE_FIN_BAUREIHE;
    private String CDE_MODL_SER;
    private String CDE_STR_PLANT;
    private String CDE_SER_NUM;
    private String DES_SLS_MDL;
    private String NUM_PORD;
    private String CDE_LTST_VEH_RTL_STAT;
    private String ID_LTST_DLR;
    private Date DTE_LTST_CUST_RTL_VEH;
    private String CDE_LTST_SLS_PRI;
    private String CDE_CTRY;
    private String DES_WRNTY_MODL;
    private String IND_WRNTY_VEH_STAT;
    private String CDE_INV_DLR;
    private Date DTE_REGIS;
    private Date DTE_PROD;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
