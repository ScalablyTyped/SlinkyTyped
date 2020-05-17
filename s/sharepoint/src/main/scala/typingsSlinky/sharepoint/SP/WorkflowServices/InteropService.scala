package typingsSlinky.sharepoint.SP.WorkflowServices

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.GuidResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: comments, types
@js.native
trait InteropService extends ClientObject {
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

