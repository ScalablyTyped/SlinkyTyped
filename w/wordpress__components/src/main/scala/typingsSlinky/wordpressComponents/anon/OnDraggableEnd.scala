package typingsSlinky.wordpressComponents.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDraggableEnd extends js.Object {
  var onDraggableEnd: DragEventHandler[Element]
  var onDraggableStart: DragEventHandler[Element]
}

object OnDraggableEnd {
  @scala.inline
  def apply(onDraggableEnd: DragEvent[Element] => Unit, onDraggableStart: DragEvent[Element] => Unit): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1(onDraggableEnd), onDraggableStart = js.Any.fromFunction1(onDraggableStart))
    __obj.asInstanceOf[OnDraggableEnd]
  }
}

