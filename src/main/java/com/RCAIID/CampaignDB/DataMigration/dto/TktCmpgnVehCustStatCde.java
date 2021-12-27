package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class TktCmpgnVehCustStatCde {
    private String CDE_CMPGN_VEH_CUST_STAT;
    private String DES_CMPGN_VEH_CUST_STAT;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
