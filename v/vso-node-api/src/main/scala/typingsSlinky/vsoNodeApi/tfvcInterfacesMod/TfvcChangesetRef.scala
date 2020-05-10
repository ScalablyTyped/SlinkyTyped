package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcChangesetRef extends js.Object {
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any = js.native
  /**
    * Alias or display name of user
    */
  var author: IdentityRef = js.native
  /**
    * Id of the changeset.
    */
  var changesetId: Double = js.native
  /**
    * Alias or display name of user
    */
  var checkedInBy: IdentityRef = js.native
  /**
    * Comment for the changeset.
    */
  var comment: String = js.native
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: Boolean = js.native
  /**
    * Creation date of the changeset.
    */
  var createdDate: js.Date = js.native
  /**
    * URL to retrieve the item.
    */
  var url: String = js.native
}

object TfvcChangesetRef {
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    changesetId: Double,
    checkedInBy: IdentityRef,
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
    url: String
  ): TfvcChangesetRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changesetId = changesetId.asInstanceOf[js.Any], checkedInBy = checkedInBy.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetRef]
  }
  @scala.inline
  implicit class TfvcChangesetRefOps[Self <: TfvcChangesetRef] (val x: Self) extends AnyVal {
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
    def withChangesetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changesetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedInBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedInBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

