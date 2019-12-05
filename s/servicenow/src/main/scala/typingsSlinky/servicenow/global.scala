package typingsSlinky.servicenow

import typingsSlinky.servicenow.servicenow.GlideRecordOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global")
@js.native
object global extends js.Object {
  @js.native
  class Workflow () extends js.Object {
    def broadcastEvent(contextId: String, eventName: String): Unit = js.native
    def cancel(record: typingsSlinky.servicenow.servicenow.GlideRecord): Unit = js.native
    def cancelContext(context: typingsSlinky.servicenow.servicenow.GlideRecord): Unit = js.native
    def deleteWorkflow(current: typingsSlinky.servicenow.servicenow.GlideRecord): Unit = js.native
    def fireEvent(eventRecord: typingsSlinky.servicenow.servicenow.GlideRecord, eventName: String): Unit = js.native
    def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
    def getContexts(record: typingsSlinky.servicenow.servicenow.GlideRecord): typingsSlinky.servicenow.servicenow.GlideRecord = js.native
    def getEstimatedDeliveryTime(workflowId: String): String = js.native
    def getEstimatedDeliveryTimeFromWFVersion(wfVersion: typingsSlinky.servicenow.servicenow.GlideRecord): String = js.native
    def getReturnValue(workflowID: String, amount: Double, result: Boolean): js.Object = js.native
    def getRunningFlows(record: typingsSlinky.servicenow.servicenow.GlideRecord): typingsSlinky.servicenow.servicenow.GlideRecord = js.native
    def getVersion(workflowId: String): Unit = js.native
    def getVersionFromName(workflowName: String): Unit = js.native
    def getWorkflowFromName(workflowName: String): Unit = js.native
    def hasWorkflow(record: typingsSlinky.servicenow.servicenow.GlideRecord): Boolean = js.native
    def restartWorkflow(record: typingsSlinky.servicenow.servicenow.GlideRecord, maintainStateFlag: Boolean): Unit = js.native
    def runFlows(record: typingsSlinky.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
    def startFlow(
      workflowId: String,
      current: typingsSlinky.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): String = js.native
    def startFlow(
      workflowId: String,
      current: typingsSlinky.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): String = js.native
    def startFlowFromContextInsert(context: typingsSlinky.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsSlinky.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): typingsSlinky.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsSlinky.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): typingsSlinky.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsSlinky.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object,
      withSchedule: js.Any
    ): typingsSlinky.servicenow.servicenow.GlideRecord = js.native
  }
  
  @js.native
  object Class extends js.Object {
    def create(): js.Any = js.native
  }
  
  @js.native
  object GlideStringUtil extends js.Object {
    def base64Decode(value: String): String = js.native
    def base64DecodeAsBytes(value: String): js.Any = js.native
    def escapeHTML(value: String): String = js.native
    def getStringFromStream(stream: js.Object): String = js.native
  }
  
}

