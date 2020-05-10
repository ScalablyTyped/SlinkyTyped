package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TodoComment extends js.Object {
  var descriptor: TodoCommentDescriptor = js.native
  var message: java.lang.String = js.native
  var position: Double = js.native
}

object TodoComment {
  @scala.inline
  def apply(descriptor: TodoCommentDescriptor, message: java.lang.String, position: Double): TodoComment = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoComment]
  }
  @scala.inline
  implicit class TodoCommentOps[Self <: TodoComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptor(value: TodoCommentDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

