package hellojpa;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATED_DATETIME")
    private LocalDateTime createdDateTime;

    @Column(name = "LAST_MODIFIER")
    private String lastModifier;

    @Column(name = "LAST_MODIFIED_DATETIME")
    private LocalDateTime lastModifiedDateTime;

    public String getCreator() {
        return creator;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public String getLastModifier() {
        return lastModifier;
    }

    public LocalDateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
}
