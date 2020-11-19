package typingsSlinky.stompit.channelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSubscription extends js.Object {
  
  def cancel(): Unit = js.native
  
  def unsubscribe(): Unit = js.native
}
object ChannelSubscription {
  
  @scala.inline
  def apply(cancel: () => Unit, unsubscribe: () => Unit): ChannelSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ChannelSubscription]
  }
  
  @scala.inline
  implicit class ChannelSubscriptionOps[Self <: ChannelSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
