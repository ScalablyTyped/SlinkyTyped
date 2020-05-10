package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  /**
    * The author of the comment.
    */
  var author: IdentityRef = js.native
  /**
    * The comment type at the time of creation.
    */
  var commentType: CommentType = js.native
  /**
    * The comment content.
    */
  var content: String = js.native
  /**
    * The comment ID. IDs start at 1 and are unique to a pull request.
    */
  var id: Double = js.native
  /**
    * Whether or not this comment was soft-deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * The date the comment's content was last updated.
    */
  var lastContentUpdatedDate: js.Date = js.native
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: js.Date = js.native
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: Double = js.native
  /**
    * The date the comment was first published.
    */
  var publishedDate: js.Date = js.native
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[IdentityRef] = js.native
}

object Comment {
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    commentType: CommentType,
    content: String,
    id: Double,
    isDeleted: Boolean,
    lastContentUpdatedDate: js.Date,
    lastUpdatedDate: js.Date,
    parentCommentId: Double,
    publishedDate: js.Date,
    usersLiked: js.Array[IdentityRef]
  ): Comment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], commentType = commentType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastContentUpdatedDate = lastContentUpdatedDate.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], parentCommentId = parentCommentId.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], usersLiked = usersLiked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def withAuthor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentType(value: CommentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
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
    def withLastContentUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastContentUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCommentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCommentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsersLiked(value: js.Array[IdentityRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usersLiked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

