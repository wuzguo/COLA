package com.alibaba.craftsman.event.handler;


import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.Response;
import com.alibaba.craftsman.api.IUserProfileService;
import com.alibaba.craftsman.dto.RefreshScoreCmd;
import com.alibaba.craftsman.dto.domainevent.MetricItemCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;

@CatchAndLog
public class MetricItemCreatedHandler {

    @Autowired
    private IUserProfileService userProfileService;

    public Response execute(MetricItemCreatedEvent event) {
        RefreshScoreCmd cmd = new RefreshScoreCmd(event.getUserId());
        userProfileService.refreshScore(cmd);
        return Response.buildSuccess();
    }
}
