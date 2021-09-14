package com.ggstudio.wms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ITEM_IN_HEADER")
@Getter
@Setter
@NoArgsConstructor
public class ItemInHeader implements Serializable {

    @Id
    @Column(length = 20, unique = true, nullable = false)
    private String headerInId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Column(length = 50)
    private String createdBy;

    @OneToMany(mappedBy = "itemInHeader")
    private Set<ItemInDetail> itemInDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemInHeader that = (ItemInHeader) o;
        return headerInId.equals(that.headerInId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerInId);
    }
}
