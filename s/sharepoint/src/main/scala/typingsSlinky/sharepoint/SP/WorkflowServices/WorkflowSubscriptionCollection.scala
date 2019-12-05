package typingsSlinky.sharepoint.SP.WorkflowServices

import typingsSlinky.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowSubscription objects */
@js.native
trait WorkflowSubscriptionCollection extends ClientObjectCollection[WorkflowSubscription] {
  /** returns SP.WorkflowInstance class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: Double): WorkflowSubscription = js.native
  def itemAt(index: Double): WorkflowSubscription = js.native
}

