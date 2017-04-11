/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.quantasy.blinds.gateway.servant;

import ch.quantasy.blinds.gateway.BlindsContract;
import java.util.Map;

/**
 *
 * @author reto
 */
public class BlindsServantContract extends BlindsContract{
    
    public final String ACTION;
    public final String INTENT_ACTION;
    public final String STATUS_ACTION;
    public final String EVENT_ACTION;
    
    public BlindsServantContract(String baseClass, String instance) {
        super(baseClass, instance);
        ACTION="action";
        INTENT_ACTION=INTENT+"/"+ACTION;
        STATUS_ACTION=STATUS+"/"+ACTION;
        EVENT_ACTION=EVENT+"/"+ACTION;
    }

    @Override
    protected void describe(Map<String, String> descriptions) {
        descriptions.put(INTENT_ACTION, "direction: [up|down|stop]");
    }
    
}
