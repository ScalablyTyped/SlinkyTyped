package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AccessRequests")
@js.native
class AccessRequests ()
  extends typingsSlinky.sharepoint.SP.AccessRequests
object AccessRequests {
  
  /* static member */
  @JSGlobal("SP.AccessRequests.changeRequestStatus")
  @js.native
  def changeRequestStatus(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    itemId: Double,
    newStatus: Double,
    convStr: String,
    permType: String,
    permissionLevel: Double
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.AccessRequests.changeRequestStatusBulk")
  @js.native
  def changeRequestStatusBulk(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    requestIds: js.Array[Double],
    newStatus: Double
  ): Unit = js.native
}
