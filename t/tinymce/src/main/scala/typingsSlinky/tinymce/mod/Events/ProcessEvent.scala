package typingsSlinky.tinymce.mod.Events

import org.scalajs.dom.raw.Node
import typingsSlinky.tinymce.tinymceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessEvent extends Event {
  var content: String = js.native
  var forced_root_block: String = js.native
  var format: String = js.native
  var get: Boolean = js.native
  var get_inner: Boolean = js.native
  var node: Node = js.native
  var selection: `true` = js.native
}

object ProcessEvent {
  @scala.inline
  def apply(
    content: String,
    forced_root_block: String,
    format: String,
    get: Boolean,
    get_inner: Boolean,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    node: Node,
    preventDefault: () => Unit,
    selection: `true`,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): ProcessEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], forced_root_block = forced_root_block.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], get_inner = get_inner.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), node = node.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selection = selection.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEvent]
  }
  @scala.inline
  implicit class ProcessEventOps[Self <: ProcessEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForced_root_block(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced_root_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet_inner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

