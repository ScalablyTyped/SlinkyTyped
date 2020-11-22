package typingsSlinky.symphonyApiClientNode.mod

import typingsSlinky.symphonyApiClientNode.connectionsClientMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getRejectedConnections")
@js.native
object getRejectedConnections extends js.Object {
  
  def apply(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
}
