/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.cola.extension;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * ExtensionRepository
 *
 * @author fulan.zjf 2017-11-05
 */
@Component
public class ExtensionRepository {

    public Map<ExtensionCoordinate, IExtensionPoint> getExtensionRepo() {
        return extensionRepo;
    }

    private Map<ExtensionCoordinate, IExtensionPoint> extensionRepo = new HashMap<>();


}
