package com.canny.snowflakemigration.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A MigrationProcess.
 */
@Entity
@Table(name = "migration_process")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MigrationProcess implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 650)
    @Column(name = "description", length = 650)
    private String description;

    @Column(name = "type")
    private String type;

    @Size(max = 3200)
    @Column(name = "tables_to_migrate", length = 3200)
    private String tablesToMigrate;

    @Size(max = 3200)
    @Column(name = "cdc", length = 3200)
    private String cdc;

    @Size(max = 3200)
    @Column(name = "bulk", length = 3200)
    private String bulk;

    @Column(name = "last_status")
    private String lastStatus;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "last_modified_date")
    private Instant lastModifiedDate;

    @ManyToOne(optional = false)
    @NotNull
    private SourceConnection sourceConnection;

    @ManyToOne(optional = false)
    @NotNull
    private SnowflakeConnection snowflakeConnection;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public MigrationProcess name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public MigrationProcess description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public MigrationProcess type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTablesToMigrate() {
        return tablesToMigrate;
    }

    public MigrationProcess tablesToMigrate(String tablesToMigrate) {
        this.tablesToMigrate = tablesToMigrate;
        return this;
    }

    public void setTablesToMigrate(String tablesToMigrate) {
        this.tablesToMigrate = tablesToMigrate;
    }

    public String getCdc() {
        return cdc;
    }

    public MigrationProcess cdc(String cdc) {
        this.cdc = cdc;
        return this;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }


    public String getBulk() {
        return bulk;
    }

    public MigrationProcess bulk(String bulk) {
        this.bulk = bulk;
        return this;
    }

    public void setBulk(String bulk) {
        this.bulk = bulk;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public MigrationProcess lastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public MigrationProcess createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public MigrationProcess createdDate(Instant createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public MigrationProcess lastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public MigrationProcess lastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SourceConnection getSourceConnection() {
        return sourceConnection;
    }

    public MigrationProcess sourceConnection(SourceConnection sourceConnection) {
        this.sourceConnection = sourceConnection;
        return this;
    }

    public void setSourceConnection(SourceConnection sourceConnection) {
        this.sourceConnection = sourceConnection;
    }

    public SnowflakeConnection getSnowflakeConnection() {
        return snowflakeConnection;
    }

    public MigrationProcess snowflakeConnection(SnowflakeConnection snowflakeConnection) {
        this.snowflakeConnection = snowflakeConnection;
        return this;
    }

    public void setSnowflakeConnection(SnowflakeConnection snowflakeConnection) {
        this.snowflakeConnection = snowflakeConnection;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationProcess)) {
            return false;
        }
        return id != null && id.equals(((MigrationProcess) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "MigrationProcess{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", type='" + getType() + "'" +
            ", tablesToMigrate='" + getTablesToMigrate() + "'" +
            ", cdc='" + getCdc() + "'" +
            ", bulk='" + getBulk() + "'" +
            ", lastStatus='" + getLastStatus() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", lastModifiedBy='" + getLastModifiedBy() + "'" +
            ", lastModifiedDate='" + getLastModifiedDate() + "'" +
            "}";
    }
}
