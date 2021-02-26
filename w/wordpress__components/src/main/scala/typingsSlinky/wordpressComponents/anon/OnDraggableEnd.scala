package typingsSlinky.wordpressComponents.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDraggableEnd extends StObject {
  
  var onDraggableEnd: DragEventHandler[Element] = js.native
  
  var onDraggableStart: DragEventHandler[Element] = js.native
}
object OnDraggableEnd {
  
  @scala.inline
  def apply(onDraggableEnd: DragEvent[Element] => Unit, onDraggableStart: DragEvent[Element] => Unit): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1(onDraggableEnd), onDraggableStart = js.Any.fromFunction1(onDraggableStart))
    __obj.asInstanceOf[OnDraggableEnd]
  }
  
  @scala.inline
  implicit class OnDraggableEndMutableBuilder[Self <: OnDraggableEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDraggableEnd(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDraggableEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDraggableStart(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDraggableStart", js.Any.fromFunction1(value))
  }
}
