package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class CmpgnCtryVehTyp {

    private String CDE_CTRY_ABRV;
    private String CDE_VEH_CTRY;
    private String CDE_VEH_TYP;
    private String DES_VEH_TYP;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
