package typingsSlinky.sharepoint.SP.WorkflowServices

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowInstance objects */
@js.native
trait WorkflowInstanceCollection extends ClientObjectCollection[WorkflowInstance] {
  /** returns SP.WorkflowInstance class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: Double): WorkflowInstance = js.native
  def itemAt(index: Double): WorkflowInstance = js.native
}

