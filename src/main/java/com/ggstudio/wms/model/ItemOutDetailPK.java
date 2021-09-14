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
public class ItemOutDetailPK implements Serializable {

    @Column
    private Integer itemId;

    @Column
    private String headerOutId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemOutDetailPK that = (ItemOutDetailPK) o;
        return itemId.equals(that.itemId) &&
                headerOutId.equals(that.headerOutId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, headerOutId);
    }
}
