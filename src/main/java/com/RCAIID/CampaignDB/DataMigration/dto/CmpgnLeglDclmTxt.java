package com.RCAIID.CampaignDB.DataMigration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class CmpgnLeglDclmTxt {
    private String CDE_CTRY;
    private String ID_DCLM;
    private String TXT_LEGL_DCLM;
    private LocalDateTime DTS_CREA;
    private String ID_CREA_USER;
    private LocalDateTime DTS_LAST_UPDT;
    private String ID_LAST_UPDT_USER;
}
