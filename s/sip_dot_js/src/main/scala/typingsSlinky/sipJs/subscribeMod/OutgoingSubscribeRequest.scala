package typingsSlinky.sipJs.subscribeMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingSubscribeRequest extends OutgoingRequest {
  
  /** Delegate providing custom handling of this outgoing SUBSCRIBE request. */
  @JSName("delegate")
  var delegate_OutgoingSubscribeRequest: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
  
  /** Stop waiting for an inital subscription creating NOTIFY. */
  def waitNotifyStop(): Unit = js.native
}
