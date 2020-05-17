package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AccessRequests")
@js.native
class AccessRequests ()
  extends typingsSlinky.sharepoint.SP.AccessRequests

/* static members */
@JSGlobal("SP.AccessRequests")
@js.native
object AccessRequests extends js.Object {
  def changeRequestStatus(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    itemId: Double,
    newStatus: Double,
    convStr: String,
    permType: String,
    permissionLevel: Double
  ): Unit = js.native
  def changeRequestStatusBulk(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    requestIds: js.Array[Double],
    newStatus: Double
  ): Unit = js.native
}

