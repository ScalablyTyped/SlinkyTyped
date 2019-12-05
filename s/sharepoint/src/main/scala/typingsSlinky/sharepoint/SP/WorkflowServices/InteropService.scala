package typingsSlinky.sharepoint.SP.WorkflowServices

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.GuidResult
import typingsSlinky.sharepoint.SP.ObjectPathStaticProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: comments, types
@JSGlobal("SP.WorkflowServices.InteropService")
@js.native
class InteropService protected () extends ClientObject {
  def this(context: ClientRuntimeContext, objectPath: ObjectPathStaticProperty) = this()
  def cancelWorkflow(instanceId: Guid): Unit = js.native
  def disableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
  def enableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
  def startWorkflow(
    associationName: String,
    correlationId: Guid,
    listId: Guid,
    itemGuid: Guid,
    workflowParameters: js.Any
  ): GuidResult = js.native
}

/* static members */
@JSGlobal("SP.WorkflowServices.InteropService")
@js.native
object InteropService extends js.Object {
  def getCurrent(context: ClientRuntimeContext): InteropService = js.native
}

