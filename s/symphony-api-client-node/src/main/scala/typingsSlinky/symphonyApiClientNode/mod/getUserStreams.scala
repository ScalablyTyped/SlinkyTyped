package typingsSlinky.symphonyApiClientNode.mod

import typingsSlinky.symphonyApiClientNode.streamsClientMod.StreamType
import typingsSlinky.symphonyApiClientNode.streamsClientMod.UserStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "getUserStreams")
@js.native
object getUserStreams extends js.Object {
  
  def apply(skip: Double, limit: Double, streamTypes: js.Array[StreamType], includeInactiveStreams: Boolean): js.Promise[UserStream] = js.native
}
