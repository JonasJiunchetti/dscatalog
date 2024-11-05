package com.devsuperior.dscatalog.util;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dscatalog.projections.IdProjection;

public class Utils {

    public static <ID> List<? extends IdProjection<ID>>
    replace(List<? extends IdProjection<ID>> ordered, List<? extends IdProjection<ID>> unordered) {// Type and subtype of IdProjection Entity and ProductProjection 
        
        Map<ID, IdProjection<ID>> map = new HashMap<>(); // easily search for a product by id. If not it would be O(n) to search for a product in the list
        for (IdProjection<ID> obj : unordered) {
            map.put(obj.getId(), obj);
        }

        List<IdProjection<ID>> result = new ArrayList<>();
        for (IdProjection<ID> obj : ordered) {
            result.add(map.get(obj.getId()));
        }

        return result;
    }

}
