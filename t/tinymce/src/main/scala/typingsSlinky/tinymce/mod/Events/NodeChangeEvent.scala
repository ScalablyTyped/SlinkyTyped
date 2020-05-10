package typingsSlinky.tinymce.mod.Events

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeChangeEvent extends Event {
  var element: Node = js.native
  var parents: js.Array[Node] = js.native
  var selectionChange: Boolean = js.native
}

object NodeChangeEvent {
  @scala.inline
  def apply(
    element: Node,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    parents: js.Array[Node],
    preventDefault: () => Unit,
    selectionChange: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeChangeEvent]
  }
  @scala.inline
  implicit class NodeChangeEventOps[Self <: NodeChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

