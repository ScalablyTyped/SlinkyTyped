package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewportEventMap extends js.Object {
  
  var resize: org.scalajs.dom.raw.UIEvent = js.native
  
  var scroll: org.scalajs.dom.raw.Event = js.native
}
object VisualViewportEventMap {
  
  @scala.inline
  def apply(resize: org.scalajs.dom.raw.UIEvent, scroll: org.scalajs.dom.raw.Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
  
  @scala.inline
  implicit class VisualViewportEventMapOps[Self <: VisualViewportEventMap] (val x: Self) extends AnyVal {
    
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
    def setResize(value: org.scalajs.dom.raw.UIEvent): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: org.scalajs.dom.raw.Event): Self = this.set("scroll", value.asInstanceOf[js.Any])
  }
}
