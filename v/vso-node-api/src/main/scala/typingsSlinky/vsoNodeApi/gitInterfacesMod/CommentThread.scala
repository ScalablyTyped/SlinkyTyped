package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThread extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  /**
    * A list of the comments.
    */
  var comments: js.Array[Comment] = js.native
  /**
    * The comment thread id.
    */
  var id: Double = js.native
  /**
    * Specify if the thread is deleted which happens when all comments are deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * The time this thread was last updated.
    */
  var lastUpdatedDate: js.Date = js.native
  /**
    * Optional properties associated with the thread as a collection of key-value pairs.
    */
  var properties: js.Any = js.native
  /**
    * The time this thread was published.
    */
  var publishedDate: js.Date = js.native
  /**
    * The status of the comment thread.
    */
  var status: CommentThreadStatus = js.native
  /**
    * Specify thread context such as position in left/right file.
    */
  var threadContext: CommentThreadContext = js.native
}

object CommentThread {
  @scala.inline
  def apply(
    _links: js.Any,
    comments: js.Array[Comment],
    id: Double,
    isDeleted: Boolean,
    lastUpdatedDate: js.Date,
    properties: js.Any,
    publishedDate: js.Date,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): CommentThread = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threadContext = threadContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
  @scala.inline
  implicit class CommentThreadOps[Self <: CommentThread] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: CommentThreadStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadContext(value: CommentThreadContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

