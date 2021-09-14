package com.ggstudio.wms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ItemInDetailPK implements Serializable {


    @Column
    private Integer itemId;

    @Column
    private String headerInId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemInDetailPK that = (ItemInDetailPK) o;
        return itemId.equals(that.itemId) &&
                headerInId.equals(that.headerInId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, headerInId);
    }
}
