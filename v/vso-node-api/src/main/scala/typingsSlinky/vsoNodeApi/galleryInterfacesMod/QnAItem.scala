package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QnAItem extends js.Object {
  /**
    * Time when the review was first created
    */
  var createdDate: js.Date = js.native
  /**
    * Unique identifier of a QnA item
    */
  var id: Double = js.native
  /**
    * Get status of item
    */
  var status: QnAItemStatus = js.native
  /**
    * Text description of the QnA item
    */
  var text: String = js.native
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: js.Date = js.native
  /**
    * User details for the item.
    */
  var user: UserIdentityRef = js.native
}

object QnAItem {
  @scala.inline
  def apply(
    createdDate: js.Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): QnAItem = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QnAItem]
  }
  @scala.inline
  implicit class QnAItemOps[Self <: QnAItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: QnAItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UserIdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

