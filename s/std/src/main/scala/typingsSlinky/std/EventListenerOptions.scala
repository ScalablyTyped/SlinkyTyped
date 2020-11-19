package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerOptions extends js.Object {
  
  var capture: js.UndefOr[scala.Boolean] = js.native
}
object EventListenerOptions {
  
  @scala.inline
  def apply(): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventListenerOptions]
  }
  
  @scala.inline
  implicit class EventListenerOptionsOps[Self <: org.scalajs.dom.raw.EventListenerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapture(value: scala.Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
  }
}
