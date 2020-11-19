package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementEventMap extends js.Object {
  
  var fullscreenchange: org.scalajs.dom.raw.Event = js.native
  
  var fullscreenerror: org.scalajs.dom.raw.Event = js.native
}
object ElementEventMap {
  
  @scala.inline
  def apply(fullscreenchange: org.scalajs.dom.raw.Event, fullscreenerror: org.scalajs.dom.raw.Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  
  @scala.inline
  implicit class ElementEventMapOps[Self <: ElementEventMap] (val x: Self) extends AnyVal {
    
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
    def setFullscreenchange(value: org.scalajs.dom.raw.Event): Self = this.set("fullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenerror(value: org.scalajs.dom.raw.Event): Self = this.set("fullscreenerror", value.asInstanceOf[js.Any])
  }
}
