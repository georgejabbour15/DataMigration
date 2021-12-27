package com.RCAIID.CampaignDB.DataMigration.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@Entity
public class DlrAsgmtRuleCde {
    private String CDE_DLR_ASGMT_RULE;
    private String DES_DLR_ASGMT_RULE;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
