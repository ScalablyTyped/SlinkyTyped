package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadContext extends js.Object {
  /**
    * File path relative to the root of the repository. It's up to the client to use any path format.
    */
  var filePath: String = js.native
  /**
    * Position of last character of the thread's span in left file.
    */
  var leftFileEnd: CommentPosition = js.native
  /**
    * Position of first character of the thread's span in left file.
    */
  var leftFileStart: CommentPosition = js.native
  /**
    * Position of last character of the thread's span in right file.
    */
  var rightFileEnd: CommentPosition = js.native
  /**
    * Position of first character of the thread's span in right file.
    */
  var rightFileStart: CommentPosition = js.native
}

object CommentThreadContext {
  @scala.inline
  def apply(
    filePath: String,
    leftFileEnd: CommentPosition,
    leftFileStart: CommentPosition,
    rightFileEnd: CommentPosition,
    rightFileStart: CommentPosition
  ): CommentThreadContext = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], leftFileEnd = leftFileEnd.asInstanceOf[js.Any], leftFileStart = leftFileStart.asInstanceOf[js.Any], rightFileEnd = rightFileEnd.asInstanceOf[js.Any], rightFileStart = rightFileStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThreadContext]
  }
  @scala.inline
  implicit class CommentThreadContextOps[Self <: CommentThreadContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftFileEnd(value: CommentPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFileEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftFileStart(value: CommentPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftFileStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightFileEnd(value: CommentPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFileEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightFileStart(value: CommentPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightFileStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

