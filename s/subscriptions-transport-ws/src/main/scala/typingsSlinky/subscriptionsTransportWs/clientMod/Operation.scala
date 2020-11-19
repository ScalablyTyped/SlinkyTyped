package typingsSlinky.subscriptionsTransportWs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends js.Object {
  
  def handler(error: js.Array[js.Error]): Unit = js.native
  def handler(error: js.Array[js.Error], result: js.Any): Unit = js.native
  
  var options: OperationOptions = js.native
}
