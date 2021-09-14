package com.ggstudio.wms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ITEM_IN_DETAIL")
public class ItemInDetail implements Serializable {

    @EmbeddedId
    private ItemInDetailPK pk;

    @Column
    private String itemName;

    @Column
    private Integer qty;

    @Column
    private String note;

    @ManyToOne
    @JoinColumn(name = "headerInId", updatable = false, insertable = false)
    private ItemInHeader itemInHeader;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemInDetail that = (ItemInDetail) o;
        return pk.equals(that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }
}
