/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leidos.ode.agent.formatter;

import com.leidos.ode.agent.data.ODEAgentMessage;
import com.leidos.ode.data.PodeDataDelivery;
import com.leidos.ode.data.PodeDataDistribution;
import com.leidos.ode.data.ServiceRequest;
import com.leidos.ode.util.ODEMessageType;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cassadyja
 */
public class PassthroughFormatter extends ODEMessageFormatter{

    @Override
    public Map<ODEMessageType, List<PodeDataDistribution>> formatMessage(ODEAgentMessage agentMessage, ServiceRequest serviceRequst) {
        return null;
    }
    
}
