package com.ggstudio.wms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "ITEM_OUT_DETAIL")
public class ItemOutDetail implements Serializable {


    @EmbeddedId
    private ItemOutDetailPK pk;

    @Column
    private String itemName;

    @Column
    private Integer qty;

    @Column
    private String note;

    @ManyToOne
    @JoinColumn(name = "headerOutId", updatable = false, insertable = false)
    private ItemOutHeader itemOutHeader;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemOutDetail that = (ItemOutDetail) o;
        return pk.equals(that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }
}
