package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
public class TktVinLst {
    private String ID_NUM_VIN;
    private String CDE_AIRBAG_TYP;
    private String CDE_VEH_MODL_YR;
    private String CDE_BAUM;
    private String DES_VEH_MODL;
    private String CDE_GEO_ZN;
    private String IND_HAH;
    private String CDE_PRI_GRP;
    private String ID_NHTSA;
    private String IND_SLVG;
    private String IND_SCRPD;
    private String IND_STLN;
    private String IND_EXPRTD;
    private Date DTE_LAST_577;
    private String IND_AIRBAG_TYP;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
    private String NUM_PART;
}
