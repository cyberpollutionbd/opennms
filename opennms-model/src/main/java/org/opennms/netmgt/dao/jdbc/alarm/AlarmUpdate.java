/**
 * 
 */
package org.opennms.netmgt.dao.jdbc.alarm;

import javax.sql.DataSource;

import org.opennms.netmgt.model.OnmsAlarm;

public class AlarmUpdate extends AlarmSaveOrUpdate {

    // DO NOT CHANGE THIS STATEMENT UNLESS YOU CHANGE THE INSERT STATEMENT AND THE
    // PARAMETERS IN AlarmSaveOrUpdate
    private static final String updateStmt = "update events set " +
	    "eventUei = ?, dpName = ?, nodeID = ?, ipaddr = ?, \n" + 
	    "serviceID = ?, reductionKey = ?, alarmType = ?, counter = ?, severity = ?, \n" + 
	    "lastEventID = ?, firstEventTime = ?, lastEventTime = ?, description = ?, logMsg = ?, \n" + 
	    "operInstruct = ?, tticketID = ?, tticketState = ?, mouseOverText = ?, suppressedUntil = ?, \n" + 
	    "suppressedUser = ?, suppressedTime = ?, alarmAckUser = ?, alarmAckTime = ?, clearUei = ?, \n" +
	    "where alarmid = ?";

    public AlarmUpdate(DataSource ds) {
        super(ds, updateStmt);
    }
    
    public int doUpdate(OnmsAlarm alarm) {
        return persist(alarm);
    }
    
}