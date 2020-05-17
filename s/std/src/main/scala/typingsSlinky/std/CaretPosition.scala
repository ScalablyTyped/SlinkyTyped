package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaretPosition extends js.Object {
  val offset: Double = js.native
  val offsetNode: org.scalajs.dom.raw.Node = js.native
  def getClientRect(): DOMRect | Null = js.native
}

object CaretPosition {
  @scala.inline
  def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: org.scalajs.dom.raw.Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
  @scala.inline
  implicit class CaretPositionOps[Self <: CaretPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClientRect(value: () => DOMRect | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetNode(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

