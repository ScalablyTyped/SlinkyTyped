package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentContainer[TComment] extends js.Object {
  var comment: TComment = js.native
}

object CommentContainer {
  @scala.inline
  def apply[TComment](comment: TComment): CommentContainer[TComment] = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentContainer[TComment]]
  }
  @scala.inline
  implicit class CommentContainerOps[Self[tcomment] <: CommentContainer[tcomment], TComment] (val x: Self[TComment]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComment] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComment]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TComment] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TComment] with Other]
    @scala.inline
    def withComment(value: TComment): Self[TComment] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

