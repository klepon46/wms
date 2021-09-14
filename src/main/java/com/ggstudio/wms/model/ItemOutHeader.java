package com.ggstudio.wms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ITEM_OUT_HEADER")
public class ItemOutHeader implements Serializable {


    @Id
    @Column(length = 20, unique = true, nullable = false)
    private String headerOutId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Column(length = 50)
    private String createdBy;

    @OneToMany(mappedBy = "itemOutHeader")
    private Set<ItemOutDetail> itemOutDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemOutHeader that = (ItemOutHeader) o;
        return headerOutId.equals(that.headerOutId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerOutId);
    }
}
