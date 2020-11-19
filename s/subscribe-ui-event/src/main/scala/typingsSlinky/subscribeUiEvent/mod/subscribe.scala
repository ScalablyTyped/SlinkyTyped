package typingsSlinky.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("subscribe-ui-event", "subscribe")
@js.native
object subscribe extends js.Object {
  
  def apply[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Subscription = js.native
  def apply[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T], options: SubscribeOptions): Subscription = js.native
}
