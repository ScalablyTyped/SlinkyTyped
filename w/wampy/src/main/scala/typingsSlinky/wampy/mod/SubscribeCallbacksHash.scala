package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeCallbacksHash extends js.Object {
  
  var onError: js.UndefOr[ErrorCallback] = js.native
  
  var onEvent: js.UndefOr[EventCallback] = js.native
  
  var onSuccess: js.UndefOr[Callback] = js.native
}
object SubscribeCallbacksHash {
  
  @scala.inline
  def apply(): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
  
  @scala.inline
  implicit class SubscribeCallbacksHashOps[Self <: SubscribeCallbacksHash] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: /* args */ ErrorArgs => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnEvent(value: /* args */ DataArgs => Unit): Self = this.set("onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEvent: Self = this.set("onEvent", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
