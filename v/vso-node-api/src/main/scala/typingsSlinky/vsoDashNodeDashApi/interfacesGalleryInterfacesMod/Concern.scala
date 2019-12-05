package typingsSlinky.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concern extends QnAItem {
  /**
    * Category of the concern
    */
  var category: ConcernCategory
}

object Concern {
  @scala.inline
  def apply(
    category: ConcernCategory,
    createdDate: js.Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): Concern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Concern]
  }
}

