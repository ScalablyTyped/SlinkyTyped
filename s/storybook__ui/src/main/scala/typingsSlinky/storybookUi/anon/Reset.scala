package typingsSlinky.storybookUi.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reset extends StObject {
  
  var reset: MouseEventHandler[Element] = js.native
  
  var zoomIn: MouseEventHandler[Element] = js.native
  
  var zoomOut: MouseEventHandler[Element] = js.native
}
object Reset {
  
  @scala.inline
  def apply(
    reset: SyntheticMouseEvent[Element] => Unit,
    zoomIn: SyntheticMouseEvent[Element] => Unit,
    zoomOut: SyntheticMouseEvent[Element] => Unit
  ): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), zoomIn = js.Any.fromFunction1(zoomIn), zoomOut = js.Any.fromFunction1(zoomOut))
    __obj.asInstanceOf[Reset]
  }
  
  @scala.inline
  implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReset(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomIn(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomOut(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction1(value))
  }
}
