package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentReply extends js.Object {
  /**
  		 * The value in the comment editor
  		 */
  var text: String = js.native
  /**
  		 * The active [comment thread](#CommentThread)
  		 */
  var thread: CommentThread = js.native
}

object CommentReply {
  @scala.inline
  def apply(text: String, thread: CommentThread): CommentReply = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReply]
  }
  @scala.inline
  implicit class CommentReplyOps[Self <: CommentReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread(value: CommentThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

