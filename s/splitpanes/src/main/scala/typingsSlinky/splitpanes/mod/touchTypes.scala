package typingsSlinky.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait touchTypes extends js.Object {
  var activeSplitter: Null | Double = js.native
  var dragging: Boolean = js.native
  var mouseDown: Boolean = js.native
}

object touchTypes {
  @scala.inline
  def apply(dragging: Boolean, mouseDown: Boolean): touchTypes = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[touchTypes]
  }
  @scala.inline
  implicit class touchTypesOps[Self <: touchTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSplitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSplitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSplitterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSplitter")(null)
        ret
    }
  }
  
}

