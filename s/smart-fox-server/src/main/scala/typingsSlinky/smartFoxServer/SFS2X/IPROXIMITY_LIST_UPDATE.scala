package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.MMOItem
import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPROXIMITY_LIST_UPDATE extends js.Object {
  var addedItems: js.Array[MMOItem] = js.native
  var addedUsers: js.Array[SFSUser] = js.native
  var removedItems: js.Array[MMOItem] = js.native
  var removedUsers: js.Array[SFSUser] = js.native
}

object IPROXIMITY_LIST_UPDATE {
  @scala.inline
  def apply(
    addedItems: js.Array[MMOItem],
    addedUsers: js.Array[SFSUser],
    removedItems: js.Array[MMOItem],
    removedUsers: js.Array[SFSUser]
  ): IPROXIMITY_LIST_UPDATE = {
    val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], addedUsers = addedUsers.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any], removedUsers = removedUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPROXIMITY_LIST_UPDATE]
  }
  @scala.inline
  implicit class IPROXIMITY_LIST_UPDATEOps[Self <: IPROXIMITY_LIST_UPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedItems(value: js.Array[MMOItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddedUsers(value: js.Array[SFSUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedItems(value: js.Array[MMOItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedUsers(value: js.Array[SFSUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedUsers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

