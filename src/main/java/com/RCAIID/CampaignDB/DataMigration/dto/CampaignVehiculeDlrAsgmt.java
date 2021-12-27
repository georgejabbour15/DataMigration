package com.RCAIID.CampaignDB.DataMigration.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
public class CampaignVehiculeDlrAsgmt {
    @NotNull
    private String cde_dlr;
    @NotNull
    private String num_cmpgn;
    @NotNull
    @Id
    private String id_fin;
    @NotNull
    private String cde_ctry;
    private String cde_cmpgn_typ;
    private String cde_dlr_asgmt_rule;
    private Date dte_veh_grnd;
    private String ind_veh_lnch;
    private String ind_veh_ca;
    private LocalDateTime dts_crea;
    private String id_crea_user;
    private LocalDateTime dts_last_updt;
    private String id_last_updt_user;
    private String ind_oper;
}
