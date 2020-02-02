package com.cox.automotive.storemanagementsystem.util;

import com.cox.automotive.storemanagementsystem.annotation.Util;
import com.cox.automotive.storemanagementsystem.beans.StoresBean;
import com.cox.automotive.storemanagementsystem.entity.StoresEntity;
import com.google.gson.Gson;
import org.springframework.beans.BeanUtils;

@Util
public class DataUtil {

    public void populate(final StoresEntity entity, final StoresBean storesBean) {
        BeanUtils.copyProperties(storesBean, entity, "id");
        entity.setLocation(new Gson().toJson(storesBean.getLocation().toString().replaceAll("\\\\", "")));
        entity.setServices(new Gson().toJson(storesBean.getServices()));
    }
}
