package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventMap extends StObject {
  
  var click: org.scalajs.dom.raw.Event = js.native
  
  var close: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var show: org.scalajs.dom.raw.Event = js.native
}
object NotificationEventMap {
  
  @scala.inline
  def apply(
    click: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    show: org.scalajs.dom.raw.Event
  ): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
  
  @scala.inline
  implicit class NotificationEventMapMutableBuilder[Self <: NotificationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
