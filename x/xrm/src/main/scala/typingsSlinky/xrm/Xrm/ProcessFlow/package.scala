package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ProcessFlow {
  
  /**
    * Called when method to get active processes is complete
    * @param status The result of the get active processes operation.
    * @remarks **Returns object with the following key-value pairs**:
    * * CreatedOn
    * * ProcessDefinitionID
    * * ProcessDefinitionName
    * * ProcessInstanceID
    * * ProcessInstanceName
    * * StatusCodeName
    */
  type GetProcessInstancesDelegate = js.Function1[/* object */ typingsSlinky.xrm.Xrm.ProcessFlow.ProcessDictionary, scala.Unit]
  
  /**
    * Called when process change methods have completed.
    * @param status The result of the process change operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * crossEntity    (The previous stage is for a different entity.)
    * * beginning      (The active stage is the first stage of the active path.)
    * * invalid        (The operation failed because the selected stage isn’t the same as the active stage.)
    * * unreachable    (The stage exists on a different path.)
    */
  type ProcessCallbackDelegate = js.Function1[/* status */ java.lang.String, scala.Unit]
  
  /**
    * Represents a key-value pair, where the key is the Process Flow's ID, and the value is the name thereof.
    */
  type ProcessDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /**
    * Called when process set status method has completed.
    * @param status The new status of the process instance: active, aborted, or finished
    */
  type ProcessSetStatusDelegate = js.Function1[/* status */ typingsSlinky.xrm.Xrm.ProcessFlow.ProcessStatus, scala.Unit]
  
  /**
    * Called when method to set active process is complete
    * @param status The result of the set active process operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * invalid        (The processInstanceId isn’t valid or the process isn’t enabled.)
    */
  type SetProcessInstanceDelegate = js.Function1[/* status */ java.lang.String, scala.Unit]
}
